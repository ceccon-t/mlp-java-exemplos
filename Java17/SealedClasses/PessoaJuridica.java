public final class PessoaJuridica extends Pessoa {
    
    /*
        Classe precisa declarar um dentre [sealed, non-sealed, final] quando extend uma sealed class
        Aqui, declaramos final para propositos de demonstracao
    */

    private String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override 
    public String mostraIdentificacao() {
        return "CNPJ: " + this.cnpj;
    }
}
