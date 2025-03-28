# Desafio Controle de Fluxo - DIO

## Descrição

Este desafio faz parte da Trilha Java Básico da Digital Innovation One (DIO). O objetivo é aplicar os conceitos de controle de fluxo em Java, praticando a criação de exceções customizadas e a implementação de laços de repetição.

No cenário proposto, você deverá criar um sistema que recebe dois parâmetros (números inteiros) via terminal e realiza uma contagem. Caso o primeiro parâmetro seja maior que o segundo, uma exceção personalizada deverá ser lançada.

## Requisitos

1. **Receber dois parâmetros inteiros** via terminal.
2. **Contar a diferença** entre os dois números, e realizar a impressão dos números incrementados.
3. **Lançar uma exceção personalizada** chamada `ParametrosInvalidosException` caso o primeiro parâmetro seja maior que o segundo, com a mensagem "O segundo parâmetro deve ser maior que o primeiro".
4. **Imprimir no console**: "Imprimindo o número X" para cada número na contagem.

## Estrutura do Projeto

- **Classe Contador.java**: Esta classe será responsável por receber os parâmetros, validar as condições e realizar a contagem.
- **Classe ParametrosInvalidosException.java**: Esta classe representará a exceção personalizada a ser lançada quando o primeiro parâmetro for maior que o segundo.

## Como Funciona

1. O programa solicita ao usuário dois parâmetros inteiros via terminal.
2. O método `contar` realiza uma validação para garantir que o primeiro parâmetro seja menor que o segundo.
3. Caso o primeiro parâmetro seja maior, a exceção `ParametrosInvalidosException` é lançada com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".
4. Caso a validação seja bem-sucedida, o programa realiza uma contagem entre os dois parâmetros, imprimindo cada número da contagem.

