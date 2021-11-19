public class PatternMatching {
    public static void main(String[] args) {
        Algo algoUm = new Algo(1);
        Algo algoDois = new Algo(2);
        Algo outroAlgoUm = new Algo(1);

        String comparacao;

        System.out.println("==================================================");
        System.out.println("Comparacao usando equals estilo Java 15 ou menos: ");

        comparacao = algoUm.equalsJava15(algoDois) ? "sao iguais" : "sao diferentes";
        System.out.println("Algo Um e Algo Dois " + comparacao);

        comparacao = algoUm.equalsJava15(outroAlgoUm) ? "sao iguais" : "sao diferentes";
        System.out.println("Algo Um e Outro Algo Um " + comparacao);
        System.out.println("");

        System.out.println("==================================================");
        System.out.println("Comparacao usando equals estilo Java 16: ");

        comparacao = algoUm.equalsJava16(algoDois) ? "sao iguais" : "sao diferentes";
        System.out.println("Algo Um e Algo Dois " + comparacao);

        comparacao = algoUm.equalsJava16(outroAlgoUm) ? "sao iguais" : "sao diferentes";
        System.out.println("Algo Um e Outro Algo Um " + comparacao);
        System.out.println("");

        System.out.println("==================================================");
        System.out.println("Comparacao usando equals estilo Java 17: ");

        comparacao = algoUm.equals(algoDois) ? "sao iguais" : "sao diferentes";
        System.out.println("Algo Um e Algo Dois " + comparacao);

        comparacao = algoUm.equals(outroAlgoUm) ? "sao iguais" : "sao diferentes";
        System.out.println("Algo Um e Outro Algo Um " + comparacao);
        System.out.println("");

    }
}
