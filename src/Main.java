public class Main {
  public static void main(String[] args) {
  
   int initialBalans = 100;
      int addend = 1211;

      int bonus = 0;
      if (addend > 1000) {
          bonus = addend / 100;
      }

      int finalBalance = initialBalans + addend + bonus;
      System.out.println("Бонус: " + bonus);
      System.out.println("Итоговый счёт: " + finalBalance);
  }

}