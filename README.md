# 💱 Conversor de Moedas em Java

📌 Projeto de estudo para práticas com API, JSON e Java moderno.

Um projeto simples feito em Java para conversão de moedas em tempo real, utilizando a API [ExchangeRate API](https://www.exchangerate-api.com/), com exportação automática do resultado em arquivos `.json` organizados.

---

## 📌 Funcionalidades

- Consulta de câmbio entre moedas:
  - Dólar ⇄ Real
  - Dólar ⇄ Peso Argentino
  - Dólar ⇄ Euro
- Conversão com valor inserido pelo usuário.
- Geração de arquivos `.json` com os detalhes da conversão:
  - Moeda de origem
  - Moeda de destino
  - Valor original
  - Taxa de câmbio
  - Valor convertido
- JSON formatado com indentação (modo leitura humana).

  <img width="197" height="171" alt="image" src="https://github.com/user-attachments/assets/d7bf1a5c-dc58-46ee-8576-0af1517b16a4" />

---

## 🛠️ Tecnologias e Bibliotecas Utilizadas

- Java 11+  
- `HttpClient` nativo do Java (para consumo da API)  
- [Gson](https://github.com/google/gson) – biblioteca para manipulação de JSON

---

## 🚀 Como Executar o Projeto

1. **Clone este repositório** ou baixe os arquivos:

```bash
git clone https://github.com/seu-usuario/conversor-moedas-java.git
cd conversor-moedas-java
```

2. Adicione o GSON ao projeto:

  - Baixe o .jar do Gson aqui:
  - 👉 https://mvnrepository.com/artifact/com.google.code.gson/gson

  - No IntelliJ IDEA:
  - File > Project Structure > Libraries > + > Java > Selecione o gson-X.X.X.jar

3. Compile e execute no terminal:
``` bash
javac *.java
java Principal
```

📄 Exemplo de Saída JSON
Ao converter um valor, será criado um arquivo .json com os dados formatados, como este:
``` bash
{ 
  "de": "USD",
  "para": "BRL", 
  "valorOriginal": 100.0,
  "taxa": 5.42,
  "convertido": 542.0 
}
```

O nome do arquivo segue o padrão da conversão, como:

dolar_para_real.json

euro_para_dolar.json
