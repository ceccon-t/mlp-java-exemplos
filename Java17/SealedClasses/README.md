# Sealed Classes

Exemplo da feature Sealed Classes. Mais informações em: https://openjdk.java.net/jeps/409

O arquivo `SealedClasses.java` possui o método main e pode ser rodada via linha de comando após ser compilada. Ela apenas instancia dois objetos de Pessoa (um de cada classe permitida) e printa o resultado do método `mostraIdentificao()` para cada.

O arquivo `Pessoa.java` é uma sealed class abstrata, que permite ser estendida por apenas duas outras classes: PessoaFisica e PessoaJuridica.

Os arquivos `PessoaFisica.java` e `PessoaJuridica.java` mostram exemplos válidos de classes estendendo uma sealed class.

O arquivo `Estudante.java` mostra um exemplo inválido, com uma classe não-permitida tentando estender uma sealed class. Tentar compilar essa classe resulta em um erro de compilação.
