
# PlayStore API 🛒

Esta é uma API RESTful desenvolvida em Java com Spring Boot para simular o back-end de um e-commerce (PlayStore). O sistema gerencia o cadastro e a listagem de usuários, produtos, pedidos e categorias.

## Tecnologias Utilizadas

* **Java 17**
* **Spring Boot** (Web, Data JPA)
* **Banco de Dados:** H2 Database (em memória para o perfil de testes)
* **Maven** para gerenciamento de dependências

## Arquitetura

O projeto foi construído seguindo o padrão de camadas:
* **Entities:** Representação das tabelas do banco de dados.
* **Repositories:** Comunicação com o banco de dados via Spring Data JPA.
* **Services:** Regras de negócio da aplicação (ex: filtros de estoque).
* **Resources (Controllers):** Exposição dos endpoints da API REST.

## Funcionalidades
- Cadastro de dados
- Listagem
- Atualização
- Exclusão

## 🛠️ Como rodar o projeto localmente

1. Clone o repositório:
   ```bash
   git clone [https://github.com/PatriciaReghine/playStore.git](https://github.com/PatriciaReghine/playStore.git)
