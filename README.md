# Projeto Java JDBC - CRUD CLIENTES

Este repositório contém um projeto Java local que demonstra um exemplo de aplicação com conexão a um banco de dados. A seguir, são fornecidas informações sobre as especificações do projeto e um script SQL que deve ser executado para configurar o banco de dados.

## Especificações do Projeto

Este é um projeto Java local que visa demonstrar a realização de conexão com banco de dados PostGreSQL e as operações de CRUD (Cadastro,consulta,edição e exclusão) de clientes.

### Requisitos

- Java JDK 11
- [Eclipse](https://www.eclipse.org/) ou a IDE de sua preferência
- [PostgreSQL](https://www.postgresql.org/) (versão 14) como banco de dados
- [Maven](https://maven.apache.org/) para gerenciamento de dependências

### Configuração

1. Clone este repositório em sua máquina:
2. Abra o projeto no Eclipse.
3. Adicione a biblioteca .JAR contendo o driver do PostGreSQL.
4. Crie um banco de dados no PostGreSQL e execute o script abaixo:

- Nome do banco de dados: `nome_do_banco`
- Usuário: `seu_usuario`
- Senha: `sua_senha`

3. Execute o seguinte script SQL para criar a tabela necessária no banco de dados:

```sql
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    email VARCHAR(50) NOT NULL,
    telefone VARCHAR(15),
    CPF VARCHAR(11)
);

```
