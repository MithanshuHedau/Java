package BinarySearch;

public class SearchUnsorted {
  public static void main(String[] args) {
    int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
    int target = 9;
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = (low + high) / 2;

      if (arr[mid] == target) {
        System.out.println(target + " found at " + mid);
      }

      if (arr[low] <= arr[mid]) {
        if (arr[low] <= target && target <= arr[high]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (arr[mid] <= target && target <= arr[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
  }
}
