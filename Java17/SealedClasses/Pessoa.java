public abstract sealed class Pessoa permits PessoaFisica, PessoaJuridica {

    /*
        Apenas classes PessoaFisica e PessoaJuridica poderao extender Pessoa
    */
    
    public abstract String mostraIdentificacao();
}
