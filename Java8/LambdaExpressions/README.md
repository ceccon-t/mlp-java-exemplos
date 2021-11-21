# Lambda Expressions and Virtual Methods

Exemplo da feature Lambda Expressions and Virtual Methods. Mais informações em: https://openjdk.java.net/jeps/126

O arquivo `LambdaExpressions.java` possui no seu método main um array de inteiros e uma chamada ao método `forEach`, passando como parâmetro uma expressão lambda que printa os números no console.

## Compilando e rodando features preview

Para esse exemplo, ter em mente que a feature foi introduzida em modo Preview, o que significa que para ser usada é preciso compilar e executar o código com flags habilitando features em preview.

### Compilando
Para compilar o código, use:

```
javac --release 8 --enable-preview LambdaExpressions.java
```

### Rodando
Para rodar o código, (após tê-lo compilado) use:

```
java --enable-preview LambdaExpressions
```
