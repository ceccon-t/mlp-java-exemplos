# Launch Single-File Source-Code Programs

Exemplo da feature Launch Single-File Source-Code Programs. Mais detalhes em http://openjdk.java.net/jeps/330.

Os arquivos `hello` e `HelloWorld.java` contém uma classe HelloWorld que possui o método estático main que recebe um
parâmetro por linha de comando. Sendo que o arquivo `hello` é um arquivo shebang que funciona em sistemas linux, sendo
que talvez seja necessário alterar o path após o `#!` para a instalação do java do seu sistema.

## Rodando

Como não é nessário compilar, para rodar cada um deles basta usar:

```
java HelloWorld.java "Nome Desejado"
```

Para o arquivo shebang, é necessário tornalo executável, usando o comando:

```
chmod +x hello
```

Depois basta executá-lo:

```
./hello "Fulano da Silva"
```
