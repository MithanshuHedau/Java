package Arrays.EasyLevel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class moveZerotoRight {
  public static void main(String[] args) {
    int arr[] = { 1, 0, 3, 0, 5 };
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      array.add(arr[i]);  
    }
    int count = 0;
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i) == 0) {
        array.remove(array.get(i));
        count++;
      }
    }
    for (int i = 0; i < count; i++) {
      array.add(0);
    }
    for (int i = 0; i < array.size(); i++) {
      arr[i] = array.get(i);
    }
    for (int i = 0; i < array.size(); i++) {
      System.out.print(arr[i]+" ");
    }
    System.out.println(" ");
    System.out.println(array);
  }
}
