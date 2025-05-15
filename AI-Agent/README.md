
# 🎵 Agente de Web Scraping de Letras de Músicas com BeautifulSoup

Este projeto é um agente inteligente que realiza **web scraping de letras de músicas no site [letras.mus.br](https://www.letras.mus.br)**. Ele foi desenvolvido com base no template de agentes da Hugging Face e roda localmente com modelos de linguagem via [Ollama](https://ollama.com/).

---

## 🔍 Funcionalidades

- 🔗 Acessa automaticamente a página de um artista no letras.mus.br
- 🎶 Extrai e limpa o conteúdo textual das letras das músicas
- 🧹 Remove pontuação e palavras irrelevantes (stopwords)
- 📊 Pode ser usado como base para análise de sentimentos, geração de resumos ou comparações entre artistas

---


## Instalação

### 1. Crie um ambiente virtual

```bash
python -m venv venv
source venv/bin/activate  # Linux/macOS
venv\Scripts\activate     # Windows
```

### 2. Instale as dependências

```bash
pip install -r requirements.txt
```

```bash
pip install nltk beautifulsoup4
```

### 3. Instale o Ollama e baixe um modelo local

Você pode [baixar o Ollama aqui](https://ollama.com/download) para executar modelos localmente.

```bash
ollama pull qwen2.5:3b
```

### 4. Execute o agente
```bash
python app.py
```
