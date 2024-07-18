import java.util.ArrayList;

public class Kadane {
  public static int maxarray(int[] arr) {
    int maxsum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      maxsum = Math.max(maxsum, sum);
      if (sum < 0) {
        sum = 0;
      }
    }
    return maxsum;
  }

  public static void main(String[] args) {
    int arr[] = { -10, -20, -30, -50, -1 };
    System.out.println(maxarray(arr));
  }

}
