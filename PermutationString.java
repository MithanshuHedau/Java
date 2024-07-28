public class PermutationString {
  public static void main(String[] args) {
    String str = "abcd";
    String ans = " ";
    permu(str, "");
  }

  public static void permu(String str, String ans) {
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String ss = str.substring(0, i) + str.substring(i + 1);
      permu(ss, ans + ch);
    }
  }
}
