# 🏢 Sistema de Gerenciamento de Recursos Humanos (RH)

Este é um sistema de gerenciamento de Recursos Humanos desenvolvido em **Java** com **Spring Boot**. O projeto foi estruturado utilizando o padrão arquitetural em camadas para fornecer uma API REST escalável e eficiente para o controle de colaboradores, cargos, departamentos e processamento de folhas de pagamento.

---

## 🚀 Funcionalidades Principais

* **Gestão de Colaboradores (CRUD):** Cadastro, listagem, atualização e remoção de funcionários.
* **Estrutura Organizacional:** Controle de departamentos e gerenciamento de cargos/faixas salariais.
* **Folha de Pagamento:** Lógica para cálculo automatizado de salários e benefícios.
* **Arquitetura Limpa:** Separação clara de responsabilidades entre controladores, serviços e repositórios.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Framework:** Spring Boot (Spring Web, Spring Data JPA)
* **Banco de Dados:** PostgreSQL / MySQL (ou H2 para testes)
* **Gerenciador de Dependências:** Maven

---

## 📐 Estrutura do Projeto
```text
src/main/java/com/projeto/rh
├── controllers/     # Endpoints da API (Rotas HTTP)
├── dtos/            # Objetos de transferência de dados
├── models/          # Entidades do banco de dados (Classes Principais)
├── repositories/    # Interfaces de comunicação com o banco (JPA)
└── services/        # Regras de negócio e lógica do sistema
