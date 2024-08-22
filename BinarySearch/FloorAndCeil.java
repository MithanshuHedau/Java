package BinarySearch;
public class FloorAndCeil {
  public static int floor(int arr[], int x) {
    int low = 0, high = arr.length - 1, ans = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] < x) {
        ans = arr[mid];
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return ans;
  }

  public static int ceil(int arr[], int x) {
    int low = 0, high = arr.length - 1, ans = -1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] > x) {
        ans = arr[mid];
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  public static int[] getfloorceil(int arr[], int x) {
    int f = floor(arr, x);
    int c = ceil(arr, x);
    return new int[] { f, c };
  }

  public static void main(String[] args) {
    // floor is largetv in array < x
    // ceil is smallest in narray > x
    int arr[] = { 10, 20, 30, 40, 50 };
    int n = arr.length;
    int result[] = getfloorceil(arr, 25);
    System.out.println("Floor " + result[0] + " Ceil " + result[1]);
  }
}
