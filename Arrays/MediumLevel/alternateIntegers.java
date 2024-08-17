package Arrays.MediumLevel;

import java.util.ArrayList;

public class alternateIntegers {
  public static void main(String[] args) {
    int arr[] = { 3, 1, -2, -5, 2, -4 };
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> negos = new ArrayList<>();

      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0)
          pos.add(arr[i]);
        else
          negos.add(arr[i]);
      }

      
    for (int i = 0; i < arr.length / 2; i++) {
      arr[i * 2] = pos.get(i);
      arr[i * 2 + 1] = negos.get(i);
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
