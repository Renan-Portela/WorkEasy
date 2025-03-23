# Sistema de Gerenciamento de Usuários, Equipamentos e Empréstimos

Este projeto é um sistema de gerenciamento de usuários, equipamentos e empréstimos, desenvolvido em Java com interfaces gráficas usando Swing.

## Funcionalidades

- Cadastro de Usuários
- Cadastro de Equipamentos
- Registro de Empréstimos
- Listagem de Usuários, Equipamentos e Empréstimos

## Estrutura do Projeto

O projeto contém as seguintes classes principais:

- `Usuario`: Representa um usuário do sistema.
- `Equipamento`: Representa um equipamento disponível para empréstimo.
- `Emprestimo`: Representa um empréstimo de um equipamento por um usuário.
- `GerenciadorUsuarios`: Gerencia a lista de usuários.
- `GerenciadorEquipamentos`: Gerencia a lista de equipamentos.
- `GerenciadorEmprestimos`: Gerencia a lista de empréstimos.
- `UsuarioGUI`: Interface gráfica para cadastro de usuários.
- `EquipamentoGUI`: Interface gráfica para cadastro de equipamentos.
- `EmprestimoGUI`: Interface gráfica para registro de empréstimos.
- `Main`: Classe principal que inicializa as interfaces gráficas.

## Como Usar

### Pré-requisitos

- Java JDK instalado
- IDE de sua preferência (Eclipse, IntelliJ, etc.)

### Passos para Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/Renan-Portela/WorkEasy.git
    ```

2. Abra o projeto na sua IDE.

3. Compile e execute a classe `Main`.

### Interface Gráfica

#### Cadastro de Usuários

1. Preencha os campos `ID`, `Nome`, `CPF` e `Telefone`.
2. Clique no botão `Adicionar Usuário` para adicionar o usuário à lista.

#### Cadastro de Equipamentos

1. Preencha os campos `ID`, `Nome`, `Número de Série` e `Status`.
2. Clique no botão `Adicionar Equipamento` para adicionar o equipamento à lista.

#### Registro de Empréstimos

1. Preencha os campos `ID do Usuário`, `ID do Equipamento`, `Data de Empréstimo` e `Data de Devolução`.
2. Clique no botão `Adicionar Empréstimo` para registrar o empréstimo.
