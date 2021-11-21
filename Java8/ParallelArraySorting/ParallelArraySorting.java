import java.util.Arrays;

public class ParallelArraySorting {
  public static void main(String[] args)
  {
    int numbers[] = { 2, 0, 9, 1, 15, 7, 6, 23 };
    Arrays.parallelSort(numbers);
  }
}