# Nest-Based Access Control

Exemplo da feature Nest-Based Access Control. Mais detalhes em https://openjdk.java.net/jeps/181.

O arquivo `ClasseExterna.java` contém um exemplo do uso de reflexão em classes internas para acessar métodos privados uma da outra.

Esse recurso não era permitido nas versões anteriores do Java e foi incluído na JDK 11.

## Rodando

Basta utilizar o comando:

```
java ClasseExterna.java
```

É possível verificar que em versões anteriores acontecia uma exceção ao tentar rodar o código compilado dessa classe. Para verificar esse comportamento, basta compilar em uma versão anteriror, por exemplo:

```
javac --release 10 ClasseExterna.java
```

E depois rodar o código compilado com:

```
java ClasseExterna
```

Que deve gerar uma `IllegalAccessException`.

## Usando `run.sh`

Os dois casos podem ser testados usando o script incluso nesse diretório.

Para o caso correto:

```
./run.sh -c
```

Para o caso com exceção:

```
./run.sh -e
```
