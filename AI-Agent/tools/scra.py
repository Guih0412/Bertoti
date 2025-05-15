from smolagents.tools import Tool
from urllib.request import urlopen
from bs4 import BeautifulSoup
import nltk
import string
import unicodedata

nltk.download('stopwords')


class LetrasMusTool(Tool):
    name = "letras_tool"
    description = "Extrai e limpa letras de músicas do site letras.mus.br. Entrada: {'comments': nome da banda}"
    
    inputs = {
        "comments": {
            "type": "string",
            "description": "Nome da banda/artista para buscar as músicas."
        }
    }
    
    output_type = "string"

    def __init__(self):
        self.base_url = 'https://www.letras.mus.br'
        self.music = ''

    def normalize(self, band):
        # Remove acentos e caracteres especiais
        band = unicodedata.normalize('NFKD', band).encode('ASCII', 'ignore').decode('ASCII')
        band = band.lower().replace(' ', '-')
        return ''.join(c for c in band if c.isalnum() or c == '-')

    def get_links(self, band):
        print(f"🔍 Buscando músicas da banda: {band}")
        try:
            ctrl_page = set()
            normalized_band = self.normalize(band)
            html = urlopen(f"{self.base_url}/{normalized_band}")
            bs = BeautifulSoup(html, 'html.parser')
            ul = bs.find('ul', {'class': 'cnt-list'})
            if ul:
                for link in ul.find_all('a'):
                    href = link.get('href')
                    if href and href not in ctrl_page:
                        ctrl_page.add(href)
                        self.get_music(href)
            else:
                print("⚠️ Nenhuma lista de músicas encontrada.")
        except Exception as e:
            print(f"❌ Erro ao acessar a página da banda: {e}")

    def get_music(self, path):
        try:
            html = urlopen(f"{self.base_url}/{path}")
            bs = BeautifulSoup(html, 'html.parser')
            div = bs.find('div', {'class': 'cnt-letra p402_premium'})
            if div:
                for verse in div.find_all('p'):
                    self.music += ' '.join(verse.stripped_strings) + ' '
        except Exception as e:
            print(f"❌ Erro ao acessar a música: {e}")

    def clean_write(self, preview=100):
        print("🧹 Limpando letras e salvando no arquivo...")
        stopwords = nltk.corpus.stopwords.words('portuguese')
        plain_text = ''
        for word in self.music.split():
            if len(word) >= 3:
                word = ''.join(c for c in word if c not in string.punctuation)
                if word.lower() not in stopwords:
                    plain_text += word.lower() + ' '
        try:
            with open('letras_filtradas.txt', 'w') as f:
                f.write(plain_text)
            print("✅ Letras salvas em letras_filtradas.txt")
        except Exception as e:
            print(f"❌ Erro ao gravar arquivo: {e}")
        return plain_text[:preview]

    def forward(self, comments: str) -> str:
        """
        Método exigido pelo smolagents. Espera um dict com 'comments'.
        """
        self.music = ''
        self.get_links(comments)
        return self.clean_write()
