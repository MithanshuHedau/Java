package Arrays;

import java.util.HashSet;

public class RemoveDuplicate {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
    System.out.println(" ");
    duplicatElement(arr);
  }

  public static void duplicatElement(int arr[]) {
    HashSet<Integer> hash = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      hash.add(arr[i]);
    }
    System.out.println(hash);
  }
}
