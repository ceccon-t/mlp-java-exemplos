public class DateTimeAPI {
  public static void main(String[] args)
  {
    LocalDate now = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = now.format(formatter);
    LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
  }
}