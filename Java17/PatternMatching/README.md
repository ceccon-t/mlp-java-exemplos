# Pattern Matching for switch

Exemplo da feature Pattern Matching para expressões switch. Mais informações em: https://openjdk.java.net/jeps/406 

O arquivo `PatternMatching.java` contém um método main e pode ser executado via linha de comando após ser compilado. Ele instancia objetos da classe `Algo` e printa o resultado da execução das diversas versões do método de comparação de igualdade deles.

O arquivo `Algo.java` é uma classe simples que apenas contém uma propriedade int chamada "id". Ela possui três implementações do método equals, cada uma mostrando uma possível implementação dele em uma versão do Java.

O método `equalsJava15` demonstra uma possível implementação antes da feature de Pattern Matching ter sido incluída na linguagem, notar em especial como é necessário fazer uma checagem de instanceof imediatamente seguida por um casting. 

O método `equalsJava16` demonstra uma possível implementação após a feature Pattern Matching for instanceof ter sido incluída no Java 16. Agora, a checagem e o casting acontecem na mesma linha.

Por fim, o método que se chama apenas `equals` demonstra a feature de Pattern Matching for switch, introduzida no Java 17.

## Compilando e rodando features preview

Para esse exemplo, ter em mente que a feature foi introduzida em modo Preview, o que significa que para ser usada é preciso compilar e executar o código com flags habilitando features em preview.

### Compilando
Para compilar o código, use: 

```
javac --release 17 --enable-preview Algo.java PatternMatching.java
```

### Rodando
Para rodar o código, (após tê-lo compilado) use:

```
java --enable-preview PatternMatching
```