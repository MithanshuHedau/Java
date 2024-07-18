import java.util.ArrayList;

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

  // public static int subarray(ArrayList<Integer> arr) {
  // int max = Integer.MIN_VALUE;
  // for (int i = 0; i < arr.size(); i++) {
  // int sum = 0;
  // for (int j = i; j < arr.size(); j++) {
  // sum = sum + arr.get(j);
  // max = Math.max(max, sum);
  // }
  // }
  // return max;
  // }

  // public static void main(String[] args) {
  // ArrayList<Integer> arr = new ArrayList<>();
  // arr.add(1);
  // arr.add(2);
  // arr.add(3);
  // arr.add(4);
  // arr.add(5);
  // int res = subarray(arr);
  // System.out.println(res);
  // }
}
