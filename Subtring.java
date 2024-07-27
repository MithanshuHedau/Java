public class Subtring {

  public static void main(String[] args) {
    String str = "abcd";
    PrintString(str, " ");

  }

  public static void PrintString(String str, String ans) {

    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    char ch = str.charAt(0);

    PrintString(str.substring(1), ans);
    PrintString(str.substring(1), ans + ch);
  }

  
}