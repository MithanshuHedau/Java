public class ClimbingStair {
  public static void stair(int curr, int n, String ans) {
    if (curr == n) {
      System.out.println(ans);
      return;
    }
    if (curr > n) {
      return;
    }
    stair(curr + 1, n, ans + 1);
    stair(curr + 2, n, ans + 2);
  }

  public static void main(String[] args) {
    // int s
    stair(0, 5, " ");
  }
}