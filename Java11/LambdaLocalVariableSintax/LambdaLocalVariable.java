import java.util.Arrays;

public class LambdaLocalVariable {
    public static void main(String[] args) {
        var arrInteger = new Integer[]{5, 9, 3, 6, 2, 4, 8, 7, 1};
        long cnt = Arrays.stream(arrInteger).filter(
                /*  Nesse caso pode ser útil usar o var em expressões lambda para fazer anotações
                    como (@Nonnull var a) -> ...
                    Aqui no exemplo isso não foi feito pois o modulo Java Common Annotations foi depreciado na JDK 11
                    Mas em um projeto real, o módulo pode ser importado como dependencia para poder ser usado. */
                (var a) -> (a > 5)).count();
        System.out.println(cnt);
    }
}
