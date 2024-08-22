package BinarySearch;

import java.util.Arrays;

public class UpperBound {
  public static void main(String[] args) {
    int arr[] = { 19, 15, 8, 5, 3 };
    Arrays.sort(arr);
    int target = 14;
    int low = 0;
    int high = arr.length - 1;
    int ans = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] > target) {
        ans = arr[mid];
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    System.out.println(ans);

  }
}
