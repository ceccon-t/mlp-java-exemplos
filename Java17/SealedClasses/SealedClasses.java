public class SealedClasses {

    public static void main(String[] args) {
        Pessoa fisica = new PessoaFisica("217.111.987-52");
        Pessoa juridica = new PessoaJuridica("04.075.727/0001-99");

        System.out.println(fisica.mostraIdentificacao());
        System.out.println(juridica.mostraIdentificacao());
    }

}
