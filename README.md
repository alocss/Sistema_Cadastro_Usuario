# Sistema de Cadastro de Usuários

O **Sistema de Cadastro de Usuários** permite realizar o cadastro de usuários com nome, e-mail e idade. As informações dos usuários são armazenadas em uma lista, permitindo o acesso rápido enquanto o sistema está em funcionamento. Além disso, o sistema oferece funcionalidades de busca, listagem e exclusão de usuários. Foi implementado utilizando conceitos de **ArrayList**, **Scanner**, getters e setters, e estruturas condicionais como **for**, **if** e **else**.

## Funcionalidades

1. **Cadastro de Usuários**:
   - Permite cadastrar usuários com nome, e-mail e idade.
   - Os dados são armazenados em uma lista dinâmica, permitindo acesso rápido enquanto o sistema estiver em execução.

2. **Busca de Usuários**:
   - Permite buscar usuários pelo nome.
   - Exibe os dados do usuário encontrado.

3. **Listagem de Todos os Usuários**:
   - Exibe todos os usuários cadastrados no sistema.

4. **Exclusão de Usuários**:
   - Permite excluir um usuário a partir do seu nome.
   - O sistema verifica se o usuário existe antes de realizar a exclusão.

## Tecnologias e Métodos Utilizados

- **Java**: Linguagem de programação principal utilizada.
- **ArrayList**: Estrutura de dados utilizada para armazenar os usuários.
- **Scanner**: Usado para capturar entradas do usuário no console.
- **Getters e Setters**: Métodos para acessar e modificar os dados dos usuários.
- **Estruturas Condicionais**: Utilizadas para validações e controle de fluxo no sistema.

## Funcionalidades Futuras

Embora o sistema já seja funcional, existem algumas melhorias que podem ser implementadas para torná-lo mais robusto e amigável:

- **Interface**:
  - Implementação de uma interface gráfica (GUI) para uma interação mais intuitiva com o usuário.

- **Validações de Dados**:
  - Adição de validações para garantir que os dados inseridos sejam válidos, como a verificação do formato de e-mail e idade.
  - Validações mais robustas para exclusão de usuários.

- **Atualização de Cadastro de Usuário**:
  - Funcionalidade para permitir a atualização de dados de um usuário já cadastrado.

## Fluxo de Funcionamento

### 1. Cadastro de Usuário
- O usuário fornece nome, e-mail e idade, que são armazenados em uma lista de usuários.
- O sistema confirma que o cadastro foi realizado com sucesso.

### 2. Busca de Usuário
- O usuário pode buscar um usuário pelo nome. O sistema retorna os dados do usuário, caso ele exista na lista.

### 3. Listagem de Usuários
- O sistema exibe uma lista com todos os usuários cadastrados e seus dados (nome, e-mail e idade).

### 4. Exclusão de Usuário
- O usuário fornece o nome do usuário a ser excluído.
- O sistema verifica se o nome está presente na lista e, caso positivo, realiza a exclusão.

### 5. Atualização de Dados
- O sistema permite que o usuário altere seus dados (nome, e-mail e idade) após o cadastro inicial.

## Estrutura de Dados

O sistema utiliza uma **ArrayList** para armazenar os dados dos usuários, o que permite inserções e remoções dinâmicas enquanto o sistema está em execução.

## Considerações Finais

Este sistema é uma aplicação simples e eficaz para o gerenciamento de informações básicas de usuários. Ele pode ser expandido para incluir funcionalidades como persistência de dados, autenticação e uma interface gráfica mais avançada.

## Possíveis Melhorias Futuras

1. **Persistência de Dados**:
   - Implementar persistência em banco de dados para manter os dados dos usuários mesmo após o sistema ser fechado.

2. **Autenticação**:
   - Adicionar um sistema de autenticação para garantir que apenas usuários autenticados possam acessar ou modificar seus dados.

3. **Interface de Usuário Avançada**:
   - Criar uma interface gráfica mais completa com **Swing** ou **JavaFX** para melhorar a experiência do usuário.

4. **Integração com Web**:
   - Transformar o sistema em uma aplicação web usando frameworks como **Spring Boot**, para acessibilidade remota e maior escalabilidade.

### Explicação das Seções do README:

- **Visão Geral**: Apresenta uma breve descrição do sistema e de como ele funciona.
- **Funcionalidades**: Enumera as principais funcionalidades do sistema.
- **Tecnologias Utilizadas**: Destaca as ferramentas e conceitos utilizados na implementação do sistema.
- **Funcionalidades Futuras**: Sugestões de melhorias que podem ser feitas no sistema.
- **Fluxo de Funcionamento**: Descreve como o sistema funciona de maneira geral.
- **Estrutura de Dados**: Explica a escolha do ArrayList para armazenamento de dados.
- **Considerações Finais**: Observações gerais sobre o sistema e o que pode ser feito para melhorá-lo.
- **Possíveis Melhorias Futuras**: Indica áreas em que o sistema pode ser expandido.

