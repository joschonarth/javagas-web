# 💼 Javagas

A interface web do **Javagas**, uma plataforma completa de gestão de vagas de emprego. Essa aplicação permite que **candidatos** criem perfis, se candidatem a oportunidades e acompanhem suas candidaturas, enquanto **empresas** podem publicar vagas, gerenciar seus anúncios e visualizar os perfis dos candidatos. O front-end foi desenvolvido com **Java**, **Spring Boot**, **Thymeleaf** e estilizado com **TailwindCSS** para uma experiência fluida e responsiva.

<p align="center">
  <img src="./assets/candidate-login.png" alt="Visualização de Vagas" width="90%">
</p>

> 🔗 Este repositório representa a **camada de apresentação (front-end)** da aplicação Javagas. Para acessar o back-end, [clique aqui](https://github.com/joschonarth/javagas-api).

## 🛠️ Tecnologias Utilizadas

- ☕ **Java** - Linguagem base da aplicação.
- 🌱 **Spring Boot** - Estrutura principal do projeto.
- 🌸 **Thymeleaf** - Template engine para renderização de páginas dinâmicas.
- 🎨 **TailwindCSS** - Framework utilitário para estilização moderna e responsiva.
- 🔐 **Spring Security** - Para controle de acesso na interface.
- 📦 **Maven** - Gerenciador de dependências.


## ⚙️ Funcionalidades

### 🧑‍💻 Candidato

- 👤 **Criar um candidato**: Registra um novo candidato na plataforma.
- 🔐 **Autenticar candidato**: Realiza o login de um candidato.
- 🔎 **Buscar perfil de um candidato**: Retorna as informações do candidato autenticado.

### 🏢 Empresa

- 🏢 **Criar empresa**: Cadastra uma nova empresa no sistema.
- 🔐 **Autenticar empresa**: Permite que empresas realizem login.

### 💼 Vagas

- 📝 **Criar vaga**: Publica uma nova oportunidade de emprego.
- 📋 **Listar vagas**: Retorna todas as vagas disponíveis na plataforma.

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/joschonarth/javagas-web.git
   ```

2. **Entre no diretório do projeto:**

   ```bash
   cd javagas-web
   ```

3. **Inicie a aplicação:**

   ```bash
   mvn spring-boot:run
   ```

    - 🚀 A aplicação estará disponível em [http://localhost:8082](http://localhost:8082).

> ⚠️ Certifique-se de que a API (back-end) está rodando corretamente antes de iniciar o front-end.

## 🌐 Back-End

O front-end do **Javagas** se comunica com a API back-end, que é responsável pelo processamento das requisições, regras de negócio, autenticação e persistência de dados. Você pode acessar o repositório do back-end aqui:

👉 [Javagas - Back-End](https://github.com/joschonarth/javagas-server)

A API permite operações como autenticação de usuários, cadastro de candidatos e empresas, criação de vagas e gerenciamento de candidaturas.


## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com melhorias ou correções.

## 📞 Contato

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/joschonarth/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:joschonarth@gmail.com)