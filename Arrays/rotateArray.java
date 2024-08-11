package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class rotateArray {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int n = 7;
    int d = 3;
    int temp[] = new int[d];  
    d = d % n;
    for (int i = 0; i < d; i++) {
      temp[i] = arr[i];
    }
    for (int i = d; i < n; i++) {
      arr[i - d] = arr[i];
    }
    for (int i = n - d; i < arr.length; i++) {
      arr[i] = temp[i - (n - d)];
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
