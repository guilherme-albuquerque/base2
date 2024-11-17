```markdown
# Projeto de Automação de Testes com Selenium e JUnit

Este projeto é uma automação de testes utilizando Selenium WebDriver e JUnit. Ele permite a criação e execução de testes automatizados em um navegador web.

## Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

- [Java JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)
```
## Instalação

Siga os passos abaixo para configurar o projeto em sua máquina local:

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
   

2. **Importe o projeto no IntelliJ IDEA:**
    - Abra o IntelliJ IDEA.
    - Selecione `File > Open` e escolha o diretório do projeto clonado.
    - O IntelliJ IDEA irá detectar automaticamente o projeto Maven e baixar as dependências necessárias.

3. **Configure o WebDriver:**
    - Baixe o WebDriver correspondente ao navegador que você deseja usar (por exemplo, [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/)).
    - Adicione o caminho do WebDriver ao `PATH` do seu sistema operacional.

## Estrutura do Projeto

- `src/test/java`: Contém os testes automatizados.
    - `tests`: Contém classes de teste.

## Executando os Testes

Para executar os testes, você pode usar o Maven. No terminal, navegue até o diretório do projeto e execute o seguinte comando:

```sh
mvn test
```

## Dependências

As principais dependências do projeto são:

- Selenium WebDriver
- JUnit
- WebDriverManager

Estas dependências estão listadas no arquivo `pom.xml` e serão baixadas automaticamente pelo Maven.
