# Exercícios


1. Um sistema de pagamentos precisa suportar diferentes formas de pagamento, como cartão de crédito, Débito, MBWay e PayPal. Crie uma classe abstrata para processar os pagamentos, com duas funções - `Realizar pagamento` e `aplicarTaxa` e um atributo - `taxa` e salve o valor final em um atributo - `valorFinal`. Realize 500 pagamentos e apresente a média do valor gasto em cada um dos tipos de pagamento.

2. Em um sistema de gestão de funcionários, temos `Contratado`, `ReciboVerde` e `Estagiário`. Cada um tem um cálculo de salário diferente, baseado no número de horas. Crie uma interface para os pagamentos, que leve em consideração o número de horas e o salário base de cada um. Crie a folha de pagamento de 4 setores com 10 funcionários cada um.

3. Crie um sistema para uma Concessionária de carros. Esse sistema deve ter uma classe abstrata `Automovel` que tem os métodos e atributos necessários para todos os automóveis que são vendidos. Crie mais duas classes `Ligeiro` e `Moto`, que herda de automóvel mas adiciona os atributos necessários. Crie uma interface `Pagamento` para processar pagamentos de cada carro vendido de duas categorias, `Crédito` e `Debito`. Crie 50 carros e faça 30 vendas, apresentando um relatório de vendas ao final.