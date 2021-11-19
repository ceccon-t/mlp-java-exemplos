public final class Estudante extends Pessoa {

    /*
        Compilar essa classe NAO funciona. Gera seguinte erro do compilador:
        Estudante.java:1: error: class is not allowed to extend sealed class: Pessoa (as it is not listed in its permits clause)
    */

    private String matricula;

    public Estudante(String matricula) {
        this.matricula = matricula;
    }

    @Override 
    public String mostraIdentificacao() {
        return "Matricula: " + this.matricula;
    }

    
}
