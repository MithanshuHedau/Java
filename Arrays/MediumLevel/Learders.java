package Arrays.MediumLevel;
import java.util.HashSet;

public class Learders {
  public static void main(String[] args) {
    int arr[] = { 10, 22, 12, 3, 0, 6 };
    HashSet<Integer> hash = new HashSet<>();
    int maxi = Integer.MIN_VALUE;

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] > maxi) {
        hash.add(arr[i]);
      }
      maxi = Math.max(maxi, arr[i]);
    }
    System.out.println(hash);
  }
}
