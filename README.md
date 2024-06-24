# Cardápio Backend

## Descrição

Este projeto é um backend para um sistema de cardápio online desenvolvido em Spring Boot. Ele permite listar e cadastrar itens do cardápio. O banco de dados utilizado é o PostgreSQL e o Flyway é usado para gerenciamento de migrações do banco de dados.

## Funcionalidades

- Listar itens do cardápio
- Cadastrar novos itens no cardápio

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para o desenvolvimento do backend
- **Spring Boot**: Framework utilizado para criar a aplicação
- **PostgreSQL**: Banco de dados utilizado para armazenar os dados do cardápio
- **Flyway**: Ferramenta para versionamento e migrações do banco de dados

## Estrutura do Projeto

O projeto segue a estrutura padrão do Spring Boot:

- **Entity**: Define as entidades do banco de dados
- **Repository**: Define os repositórios que fazem a comunicação com o banco de dados
- **Controller**: Define os endpoints da API
- **DTO**: Define os Data Transfer Objects usados para transferir dados entre as camadas do sistema

## Configuração do Banco de Dados

Para configurar o banco de dados, certifique-se de que o PostgreSQL esteja instalado e em execução. Atualize as configurações de conexão no arquivo `application.properties`:

```properties
server.port= 8083

spring.datasource.url=jdbc:postgresql://localhost:5432/nome_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver

spring.flyway.enabled=true
spring.flyway.locations=classpath:db/migration
```

### Migrações de Banco de Dados
As migrações de banco de dados são gerenciadas pelo Flyway. As migrações estão localizadas no diretório `src/main/resources/db/migration`. Para aplicar as migrações, execute a aplicação e o Flyway cuidará do resto.

### Executando o Projeto
Para executar o projeto, siga os passos abaixo:

1- Clone o repositório:

```bash
git clone https://github.com/seuusuario/online-menu-backend.git
```

2- Navegue até o diretório do projeto:

```bash
cd online-menu-backend
```
3- Execute o projeto utilizando o Maven:

```bash
./mvnw spring-boot:run
```
A aplicação estará disponível em `http://localhost:8083`.

### Endpoints
A seguir, a lista de endpoints disponíveis na API:

#### Listar Itens do Cardápio
- GET /food
- Descrição: Retorna a lista de itens do cardápio

#### Cadastrar Novo Item no Cardápio
- POST /food
- Descrição: Cadastra um novo item no cardápio
- Corpo da Requisição:
```json
{
  "title": "Título do item",
  "image": "url da imagem",
  "price": 19.99
}
```
