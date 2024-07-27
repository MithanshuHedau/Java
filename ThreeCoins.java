public class ThreeCoins {

  public static void main(String[] args) {
    int n = 3;
    coins(n, "");
    System.out.println(count);
  }

  static int count = 0;
  public static void coins(int n, String current) {
    if (n == 0) {
      System.out.println(current);
      count++;
      return;
    }

    if (current.isEmpty() || current.charAt(current.length() - 1) != 'H') {
      coins(n - 1, current + "H");

    }

    coins(n - 1, current + "T");

  }
}