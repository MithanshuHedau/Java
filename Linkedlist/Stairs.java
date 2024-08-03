package Linkedlist;
public class Stairs {
  public static void main(String[] args) {
    printans(4, 0, "");
  }

  public static void printans(int n, int curr, String ans) {
    if (curr == n) {
      System.out.println(ans);
      return;
    }
    if (curr > n) {
      return;
    }
    printans(n, curr + 1, ans + 1);
    printans(n, curr + 2, ans + 2);
    printans(n, curr + 3, ans + 3);
  }
}
