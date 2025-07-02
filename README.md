# SpringLoginApp

Um sistema simples de autenticação com Spring Boot, Spring Security e HTML via Thymeleaf.  
Ideal para fins didáticos, estudo de segurança em aplicações Java e demonstração de arquitetura MVC com Spring.

## 🔐 Funcionalidades

- Autenticação de usuário com Spring Security
- Validação de credenciais criptografadas (BCrypt)
- Acesso restrito a páginas autenticadas
- Logout seguro
- Banco de dados H2 em memória
- Estrutura MVC (Model-View-Controller)
- Templates dinâmicos com Thymeleaf

## 🛠️ Tecnologias Usadas

- Java 17
- Spring Boot 3
- Spring Security
- Spring Data JPA
- H2 Database
- Thymeleaf
- Maven

## 🧪 Usuário de Teste

Durante a inicialização, um usuário padrão é criado automaticamente:

Usuário: admin
Senha: 123456


> A senha é armazenada criptografada com BCrypt.

## 🚀 Como rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/SpringLoginApp.git
   cd SpringLoginApp

  Rode a aplicação com o IntelliJ ou com:

    ./mvnw spring-boot:run

Acesse no navegador:

    http://localhost:8080/login

📂 Estrutura do Projeto

src/<br>
├── controller/<br>
├── model/<br>
├── repository/<br>
├── security/<br>
└── templates/<br>

📝 Licença

Este projeto é livre para fins de estudo e demonstração.
