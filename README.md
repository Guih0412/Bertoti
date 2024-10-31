## Atividade 1: Resumo das citaçoes

###### We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

###### Essa citação enfatiza que o programador de engenharia de software deve trabalhar com três fundamentos importantes para executar uma gestão de projeto com eficiencia e resolver problemas estabelecidos, através da organização do tempo, da alta escala e eficiência, e tomada de decisões com grandes riscos.



###### Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

###### Essa citaçao enfatiza que a engenharia de software é a base da programação, e é mais completa e com mais tarefas, já que a programação trabalha apenas com o desenvolvimento, enquanto a engenharia de software também trabalha com modificação e manuntençao ao decorrer do tempo.







## Atividade 2: Trade offs

#### 1. Windows vs Linux

###### Windows: ele oferece uma ampla compatibilidade de software, isto, um suporte para uma grande variedade de softwares comerciais para aplicativos de desktop, e tambem possui uma interface gráfica familiar e ferramentas de gerenciamento conhecidas. No entanto, seu uso envolve altos cuscos de licenciamento, e possui menos flexibilidade em personalização e otimização do sistema operacional.

###### Linux: ele é gratuito e contém uma open source que permite uma personalização profunda e um melhor acesso ao codigo fonte para fazer otimizações especificas, além disso, é mais seguro e estável com menos vulnerabilidades e riscos de malware. No entanto, individuos acostumados com outros sistemas operacionais pode encontrar dificuldades de aprender a utilizar e trabalhar no linux, e muitos jogos e softwares não sao compativeis com esse sistema.



#### 2. Python vs Java

###### Python:a sua sintaxe é simples e legivel, facil de ser compreendida, trocando o codigo simples de ler, escrever e manter, além disso, permite um desenvolvimento mais rápido e uma ótima prototipagem para que seja util ao trabalhar em ambientes ageis. Entretanto, ele é mais lento do que outras linguagens de programação e pode consumir mais memória e ter menos controle sobre o gerenciamento de recursos do que linguagens como java.

###### Java: ele é altamente portatil por conta do uso de sua JVM, isto é, de sua máquina virtual, que permite que seu codigo seja executado em qualquer plataforma que suporte a JVM, e possui um desempenho mais consistente e eficiente em ambientes de largas escalas. Entretanto, sua sintaxe envolve mais detalhes e possui um código mais extenso e mais complexo, além disso, o desenvolvimento nessa linguagem torna-se mais lento por conta de sua natureza detalhada, e pelo fato de conter estruturas de códigos mais robustas.



#### 3. Mysql vs Redis

###### Mysql: ele oferede transações ACID com atomicidade, consistencia, isolamento e durabilidade que garante que as operaçoes do banco  de dados sejam executados de forma consistente e confiável, e a integridade referencial é mantida por chaves primárias e estrangeiras, que garantem a correção de dados ao longo das tabelas; além disso, permitem execução de consultas SQL complexas, podendo filtrar os dados das tabelas, e também sua linguagem SQL é poderosa, expressiva e ideal para relatórios complexos e análises de dados. Entretanto, sua escala vertical que aumenta a capacidade do servidor pode tornar seu uso mais caro e limitado, além de prejudixar seu desempenho em cenários de alta concorrencia e grande volumes de dados. Além disso, também nao é a melhor escolha para aplicativos que exigem desempenho em tempo real, pois os dados sao armazenados em discos e tornam as operaçoes mais lentas.


###### Redis: Apresenta alto desempenho pois a redis armazena todos os dados na memória e sua latencia é baixa; e tambem suporta sharding e clustering que mantém a distribuiçao de dados por diversos nós e melhoram a escala horizontal, e podem lidar de forma eficiente  com cargas de trabalho pesadas aumentando a capacidade de processamento. No entretanto, ela nao tem o foco principal na persistencia de dados e nao é confiavel para o armazenamento a longo prazo de dados e em caso de falhas pode ocorrer perda de dados. Além disso não é projetado para consultas SQL complexas ou relacionamento de dados por conta da falta de suporte a SQL.





## Atividade 3: Trade offs de uma arquitetura

#### Arquitetura de softwares do Twitter

<img width="728" alt="Arquitetura do Twitter" src="https://github.com/user-attachments/assets/815864a9-48cb-493d-96ab-3026541a4b00">



#### Estrutura da arquitetura do Twitter

###### De maneira geral, a arquitetura do Twitter é formada por diferentes componentes de softwares que executam as funções de filtrar e selecionar os conteúdos que respeitam as regras de privacidade e os interesses do usuário, para que sejam preparados e entregues ao usuário os tweets mais relevantes para ele. É dessa forma, que os componentes escolhem os conteudos que serão exibidos no feed inicial do usuario e também ajudam na interação com usuario por meio de uma interface. Esse processo é possiblitado por diferentes componentes da arquitetura da rede social que interagem com os softawares para realizar suas respectivas funcçoes.


###### Twitter Frontend (TFE): O frontend é responsável por fornecer a interface de usuário para diferentes plataformas (web, iPhone, Android). Ele se comunica com outros serviços por meio de APIs e protocolos HTTP.

###### Federated Strato Column: Este serviço é usado para a hidratação de conteúdo de tweets e usuários, além de aplicar filtros de visibilidade. Ele usa GraphQL para se comunicar com outros serviços, como o "People Discovery Service" e o "Ad Mixer".

###### Timeline Mixer: É um componente central que injeta anúncios, sugere quem seguir, e realiza a paginação e a deduplicação de tweets. Ele se conecta a vários serviços, incluindo o "Ad Mixer", "People Discovery Service", "Onboarding Service" e "Timeline Scorer", para enriquecer a experiência do usuário.

###### Home Mixer: Responsável pela integração com outros serviços, como Manhattan, Gizmoduck, Social Graph e Tweety Pie, para construir o feed personalizado do usuário.

###### Candidate Fetch, Feature, Scoring: Essas etapas fazem parte da seleção de conteúdo, onde diferentes fontes de candidatos (CrMixer, EarlyBird, Utag, Space, Communities) são avaliadas para escolher o melhor conteúdo para apresentar ao usuário.

###### Prediction Service: Auxilia no processo de seleção, usando modelos de previsão para determinar o conteúdo mais relevante para o usuário.

###### Home Scorer e Home Ranker: O "Home Scorer" avalia os candidatos e passa as informações para o "Home Ranker", que ordena os tweets no feed do usuário.


#### Trade-offs da arquitetura do twitter

###### Performance vs. Personalização: Para fornecer um feed altamente personalizado, o Twitter precisa processar grandes quantidades de dados em tempo real. Isso pode afetar a performance, causando possíveis atrasos ou lentidão no carregamento do feed, especialmente em dispositivos com menos capacidade.

###### Complexidade vs. Escalabilidade: A arquitetura do Twitter é bastante complexa, com muitos serviços e componentes interconectados. Essa complexidade permite uma alta personalização e recursos avançados, mas também pode dificultar a escalabilidade e a manutenção do sistema, exigindo mais recursos para operar e atualizar.

###### Privacidade vs. Relevância: O Twitter coleta e utiliza dados do usuário para melhorar a relevância do conteúdo mostrado no feed. No entanto, isso levanta preocupações sobre a privacidade dos usuários, já que o uso extensivo de dados pessoais pode comprometer a confiança dos usuários na plataforma.

###### Custo vs. Benefício: Manter a infraestrutura e a tecnologia necessárias para executar a arquitetura complexa do Twitter requer investimentos significativos. A plataforma deve equilibrar esses custos com os benefícios proporcionados aos usuários, como a relevância do conteúdo e a experiência do usuário.

###### Consistência vs. Atualidade: O Twitter enfrenta o desafio de manter um feed consistente, que não mude abruptamente, versus a necessidade de fornecer informações atualizadas e relevantes em tempo real. Isso pode resultar em uma experiência onde o conteúdo mais recente não é imediatamente visível, ou mudanças frequentes na timeline do usuário.

## Atividade 4: Diagrama de UML

    import java.utli.List;
    import java.util.LinkedList;
    
    public class Time {
      private List<Jogador> jogadores = newLinkedList<Jogador>();
      public void adicionarJogador(Jogador jogador){
      jogadores.add(jogador);
      }
      public List<Jogador> buscarJogadorPorNome(String Nome){
        List<Jogador> encontrados = newLinkedList(Jogador>();
        for(Jogador jogador: jogadores){
           if(jogador.getNome().equals(Nome)encontrados.add(Produto);
             encontrados.add(Jogador);
       }
       return encontrados;
             }
    }
    
    Time
    -jogadores: List<Jogador>
    
    --------------------------------
    +adicionarJogador(Jogador)
    +buscarJogadorPorNome(String): List<Produto>
    
    
    
    Jogador
    -Nome: String
    -Posição: String 
    
    ---------------------------
    +getNome(): String
    +setNome(String)
    +getPosição():String
    +setPosição(String)
