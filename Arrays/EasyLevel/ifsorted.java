package Arrays.EasyLevel;
// if sorted 
// checking here 
public class ifsorted {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int n = 5;
    System.out.println(checksort(arr, n));
  }

  public static boolean checksort(int[] arr, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i]) {
          return false;
        }
      }
    }
    return true;
  }
}
