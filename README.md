📺 ScreenOne – Consulta de Séries com Spring Boot

Este é um projeto desenvolvido no contexto do Programa ONE – Oracle Next Education, com o objetivo de praticar Java, consumo de APIs, deserialização JSON, boas práticas de organização de pacotes e a estrutura de um app com Spring Boot.

O projeto realiza a consulta de dados de uma série usando a API OMDb (Open Movie Database) e converte a resposta JSON em uma classe Java tipada.

<p align="center"> <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge"/> <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge"/> <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-blueviolet?style=for-the-badge"/> <img src="https://img.shields.io/badge/ONE-Oracle%20Next%20Education-blue?style=for-the-badge"/> </p>
📌 Sobre o Projeto

O ScreenOne é um aplicativo em Java usando Spring Boot que consome a API OMDb para buscar informações sobre séries.
O objetivo é consolidar habilidades como:

🚀 Consumo de APIs externas

🧠 Conversão de JSON em objetos Java

🗂️ Organização de camadas (model, service)

🟩 Uso do Spring Boot com CommandLineRunner

O projeto atualmente busca informações da série Gilmore Girls e imprime no console tanto o JSON quanto o objeto tipado.

🧱 Estrutura do Projeto

```src/main/java/com/br/com/alura/ScreenOne
├── model
│   └── DadosSerie.java        # Classe que representa os dados da série
│
├── service
│   ├── ConsumoAPI.java        # Faz requisições HTTP
│   ├── ConverteDados.java     # Converte JSON para objetos
│   └── IConverteDados.java    # Interface da conversão
│
└── ScreenOneApplication.java  # Classe principal
```
🧩 Tecnologias Utilizadas

    Java 17+

    Spring Boot

    Maven

    Jackson Databind

    API OMDb

▶️ Como Executar o Projeto

1. Clone o repositório
```
git clone https://github.com/seu-usuario/screenone.git
cd screenone
```
2. Execute com Maven
```
mvn spring-boot:run
```
Ou simplesmente rode pela sua IDE.

🔑 Configurar a API Key do OMDb

Este projeto usa a API pública OMDb.
Para gerar sua chave (gratuita):
🔗 https://www.omdbapi.com/apikey.aspx
Depois, altere a URL no método run:
```
var json = consumoAPI.obterDados("https://www.omdbapi.com/?i=gilmore+girls&apikey=SUA_API_KEY");
```

🧠 O que acontece quando o app roda?

O Spring Boot inicia a aplicação.
O método run() é executado automaticamente.
O app chama a API OMDb e retorna um JSON.
Esse JSON é convertido para um objeto DadosSerie.
O console exibe:
 - O JSON bruto
 - O objeto Java convertido

Feito com dedicação no Programa ONE

Este projeto foi desenvolvido como parte do meu aprendizado no Oracle Next Education + Alura.

Se quiser acompanhar minha evolução ou sugerir melhorias, fique à vontade para abrir uma issue ou mandar mensagem! 
