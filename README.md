# Spring-ia-audio-to-text-OpenAI

## 🎙️ Projeto de Transcrição de Áudio com Spring Web, Spring AI e React

## 📌 Descrição

Este projeto foi desenvolvido com o objetivo de **aprender a integrar
aplicações back-end e front-end** para consumir os modelos de **IA de
áudio da OpenAI**.\
De forma simples, ele permite enviar um arquivo de áudio no formato
**MP3** para um endpoint no back-end em **Java**, que faz a transcrição
do áudio para texto utilizando a API da **OpenAI**.

O resultado da transcrição é exibido no front-end, desenvolvido em
**React**.

------------------------------------------------------------------------

## 🏗️ Estrutura do Projeto

A estrutura do diretório é organizada da seguinte forma:

    |
    |- api-client   (front-end em React)
    |
    |- project      (back-end em Java com Spring)

------------------------------------------------------------------------

## ⚙️ Back-End (Spring Boot + Spring AI)

-   **Tecnologias**:
    -   Java\
    -   Spring Boot\
    -   Spring Web\
    -   Spring AI
-   **Funcionalidade**:
    -   Disponibiliza um endpoint REST para receber arquivos de áudio
        (`.mp3`).\
    -   O arquivo é enviado para a **API da OpenAI**.\
    -   Retorna como resposta a transcrição em **texto**.
-   **Endpoint**:
    -   **URL**: `http://localhost:8080/ia/transcribe`\
    -   **Parâmetro HTTP**: arquivo `.mp3` enviado via
        `multipart/form-data`.

------------------------------------------------------------------------

## 💻 Front-End (React + Vite)

-   **Tecnologias**:
    -   React\
    -   Vite\
    -   Axios
-   **Funcionalidade**:
    -   Página **index** com:
        -   Campo **input** para selecionar o arquivo de áudio
            (`.mp3`).\
        -   Um **botão** para enviar o arquivo ao back-end.\
        -   Um campo de **parágrafo** para exibir o resultado da
            transcrição retornada pela API.\
    -   Comunicação com o back-end feita via **Axios**.

------------------------------------------------------------------------

## 🎯 Objetivo do Projeto

Este projeto tem caráter **educacional** e foi desenvolvido para:\
- Aprender a **criar endpoints em Java com Spring Boot**.\
- Integrar um **front-end em React** com um **back-end em Java**.\
- Consumir os **modelos de IA de áudio da OpenAI**.\
- Entender o fluxo completo de **upload de arquivo → processamento no
back-end → resposta no front-end**.

------------------------------------------------------------------------

## 🚀 Como Executar

### Back-End

1.  Acesse o diretório `project`.\
2.  Rode a aplicação Spring Boot.\
3.  O servidor estará disponível em `http://localhost:8080`.

### Front-End

1.  Acesse o diretório `api-client`.\

2.  Instale as dependências:

    ``` bash
    npm install
    ```

3.  Inicie a aplicação:

    ``` bash
    npm run dev
    ```

4.  O front estará disponível em `http://localhost:5173`.

------------------------------------------------------------------------

## ✅ Conclusão

Este é um projeto simples que integra **Java + Spring AI** no back-end
com **React** no front-end para demonstrar como consumir serviços de
**IA de áudio da OpenAI**.\
Ele serve como uma base para aprendizado e pode ser expandido com novas
funcionalidades futuramente.

