import java.util.Arrays;

public class LambdaExpressions {
  public static void main(String[] args)
  {
    List<Integer> numbers = { 2, 0, 9, 1, 15, 7, 6, 23 };
    numbers.forEach( n -> System.out.println(n) );
  }
}