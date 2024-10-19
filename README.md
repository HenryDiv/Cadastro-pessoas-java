# Cadastro de Pessoa em Java

Este projeto implementa um sistema simples de cadastro de pessoas em Java. Ele permite a entrada e validação de dados pessoais, como CPF, nome, e-mail, endereço e telefone, e exibe os dados cadastrados no final.

## Funcionalidades

- **Validação de CPF**: O CPF é validado para garantir que seja composto por 11 dígitos e que não contenha todos os dígitos iguais.
- **Entrada de Dados**: O usuário pode inserir nome, CPF, e-mail, endereço completo e telefone.
- **Impressão dos Dados**: Após a entrada, o sistema exibe os dados cadastrados no console.

## Classes

### 1. **Main**
A classe principal do programa que coleta as informações do usuário e chama os métodos para exibir os dados cadastrados.

### 2. **Pessoa**
Contém atributos como nome, CPF, e-mail, endereço e telefone. Além disso, possui métodos para validar o CPF e imprimir os dados da pessoa.

### 3. **Endereco**
Representa o endereço da pessoa, contendo atributos como CEP, logradouro, número, complemento, bairro, cidade e estado.

### 4. **Telefone**
Armazena o DDD e o número de telefone da pessoa.

## Como Executar

1. Certifique-se de ter o JDK instalado em sua máquina.
2. Compile os arquivos `.java`:
    ```bash
    javac Main.java Pessoa.java Endereco.java Telefone.java
    ```
3. Execute o programa:
    ```bash
    java Main
    ```
4. Insira os dados solicitados no console, e o sistema imprimirá as informações cadastradas ao final.

## Exemplo de Uso

Ao executar o programa, ele pedirá ao usuário para inserir as seguintes informações:
- Nome
- CPF (com validação)
- E-mail
- Endereço completo (CEP, logradouro, número, complemento, bairro, cidade, estado)
- Telefone (DDD e número)

Em seguida, o sistema exibe os dados da pessoa cadastrada de forma formatada.

## Estrutura do Projeto

- **Main.java**: Contém o ponto de entrada do programa.
- **Pessoa.java**: Define os atributos e métodos da classe `Pessoa`, incluindo a validação de CPF e impressão dos dados.
- **Endereco.java**: Define os atributos do endereço.
- **Telefone.java**: Define os atributos do telefone.

## Requisitos

- Java 8 ou superior


