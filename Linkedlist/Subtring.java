package Linkedlist;
public class Subtring {

  public static void main(String[] args) {
    String str = "abc";
    ss(str, " ");
  }

  public static void ss(String str, String ans) {
    // base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    // recurrsion case
    char ch = str.charAt(0);
    ss(str.substring(1), ans);
    ss(str.substring(1), ans + ch);
  }
}