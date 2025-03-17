# Exercícios

1. Crie uma calculadora que faça as operações básicas e trate as exceções como divisão por zero.

2. Utilizando o Exercicio 2 da aula 4 crie a exceção correta para o método consumir tanque.

3. Crie alguns ficheiros numa pasta e crie exceções próprias para os seguintes casos: ficheiro não encontrado, ficheiro sem permissão de escrita, diretório sem permissão de escrita.

4. Crie uma classe abstrata ContaBancaria com um atributo `saldo`. Crie classes filhas `ContaCorrente` e `ContaPoupanca` que herdam de `ContaBancaria`. Crie uma exceção personalizada `SaldoInsuficienteException` (herda de Exception). Implemente os métodos `depositar` e `levantar` em `ContaBancaria`. No método `levantar`, verifique se há saldo suficiente. Se não houver, lance uma `SaldoInsuficienteException`.
