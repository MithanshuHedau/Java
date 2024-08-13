package Arrays.EasyLevel;

import java.util.ArrayList;
import java.util.HashSet;

public class missingnumber {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5 };
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();

    for (int ar : arr) {
      set.add(ar);
    }

    for (int i = 1; i < set.size(); i++) {
      if (!set.contains(i)) {
        list.add(i);
      }
    }
    System.out.println(list);
  }
}
