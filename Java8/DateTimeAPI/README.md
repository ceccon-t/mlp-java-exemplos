# DateTime API

Exemplo da feature DateTime API. Mais informações em: https://openjdk.java.net/jeps/150

O arquivo `DateTimeAPI.java` possui no seu método main uma conversão da data atual do sistema no formato `yyyy-MM-dd` e converte novamente para um objeto do tipo `LocalDate`.

## Compilando e rodando features preview

Para esse exemplo, ter em mente que a feature foi introduzida em modo Preview, o que significa que para ser usada é preciso compilar e executar o código com flags habilitando features em preview.

### Compilando
Para compilar o código, use:

```
javac --release 8 --enable-preview DateTimeAPI.java
```

### Rodando
Para rodar o código, (após tê-lo compilado) use:

```
java --enable-preview DateTimeAPI
```
