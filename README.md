# Projeto de Avaliação Samsung SDS - Backend API

Este é o repositório do backend da aplicação desenvolvida como parte do processo seletivo para a posição na Samsung SDS.

## Descrição

Este projeto backend foi desenvolvido utilizando o Java Spring Boot. Ele fornece uma API RESTful que serve documentos
relacionados a finanças ou contabilidade em um contexto multi-moeda.

## Endpoints

1. **Moedas**:
    - **GET /currency**: Recupera a descrição de cada moeda.

2. **Documentos**:
    - **GET /documents**: Recupera uma lista de documentos baseada em parâmetros
      como `documentNumber`, `currencyCode`, `startDate` e `endDate`.

3. **Cotações**:
    - **GET /currencies**: Fornece uma lista de moedas disponíveis.
    - **GET /currencies/quotations**: Fornece uma lista de cotações disponíveis ordenadas por data.

## Deployment da Aplicação

A aplicação está atualmente hospedada e pode ser acessada online:

- **Frontend**: A interface de usuário foi hospedada através do Firebase e está disponível no seguinte
  link: https://samsung.thomasar.dev.

- **Backend**: A API do backend está sendo executada em uma instância AWS EC2 e pode ser acessada através do seguinte
  link: https://api.samsung.thomasar.dev.

Recomendamos que acessem os links fornecidos para ver a aplicação em ação em um ambiente de produção.

## Repositório Frontend

O frontend desta aplicação foi desenvolvido usando Angular e está hospedado em um repositório separado. Você pode
acessar e revisar o código do
frontend [Link para o repositório](https://github.com/thomasreichmann/samsung-evaluation-api).
