public non-sealed class PessoaFisica extends Pessoa {

    /*
        Classe precisa declarar um dentre [sealed, non-sealed, final] quando extend uma sealed class
        Aqui, declaramos non-sealed para propositos de demonstracao
    */

    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    @Override 
    public String mostraIdentificacao() {
        return "CPF: " + this.cpf;
    }
}
