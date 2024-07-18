public class Maximumsumsubarray {

  public static int maxarray(int[] arr) {
    int maxsum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        maxsum = Math.max(maxsum, sum);
      }
    }
    return maxsum;
  }

  public static void main(String[] args) {
    int arr[] = { -10, -20, 30, 50, -1 };
    System.out.println(maxarray(arr));
  }
}
