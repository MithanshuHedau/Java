import java.util.ArrayList;
import java.util.*;

public class ContainerWithMostWater {

  public static int Water(ArrayList<Integer> heights) {
    int maxsum = 0;
    for (int i = 0; i < heights.size(); i++) {
      for (int j = i + 1; j < heights.size(); j++) {
        int ht = Math.min(heights.get(i), heights.get(j));
        int wt = j - i;
        int area = ht * wt;
        maxsum = Math.max(maxsum, area);
      }
    }
    return maxsum ;
  }

  public static void main(String[] args) {
    ArrayList<Integer> heights = new ArrayList<>();
    heights.add(1);
    heights.add(8);
    heights.add(6);
    heights.add(2);
    heights.add(5);
    heights.add(4);
    heights.add(8);
    heights.add(3);
    heights.add(7);
    int result = Water(heights);
    System.out.println(result);
  }
}
