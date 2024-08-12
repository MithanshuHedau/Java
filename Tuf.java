import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Tuf {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5 };
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();

    for (int num : arr) {
      set.add(num);
    }
    // missing number
    for (int i = 1; i < arr.length; i++) {
      if (!set.contains(i)) {
        list.add(i);
      }
    }
    System.out.println(list);
  }
}
