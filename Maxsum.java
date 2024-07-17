import java.util.ArrayList;
import java.util.*;
public class Maxsum {
    
  public static int Water(ArrayList<Integer> heights) {
    int maxsum = 0 ;
    for (int i = 0 ; i < heights.size() ; i++ ) {
      for (int j = i + 1; j < heights.size(); j++){
        int sum = heights.get(i) + heights.get(j);
        maxsum = Math.max(maxsum, sum);
      }
    }
    return maxsum;
  }

  public static void main(String[] args) {
    ArrayList<Integer> heights = new ArrayList<>();
    heights.add(1);
    // heights.add(8);
    // heights.add(6);
    heights.add(2);
    // heights.add(5);
    heights.add(4);
    // heights.add(8);
    heights.add(3);
    // heights.add(7);
    int result = Water(heights);
    System.out.println(result);
  }
}



// For  Finding the pair of that sum 
// import java.util.ArrayList;
// import java.util.*;

// public class Maxsum {

//   public static int[] Water(ArrayList<Integer> heights) {
//     int maxsum = 0;
//     int[] pair = new int[2];
//     for (int i = 0; i < heights.size(); i++) {
//       for (int j = i + 1; j < heights.size(); j++) {
//         int sum = heights.get(i) + heights.get(j);
//         if (sum > maxsum) {
//           maxsum = sum;
//           pair[0] = heights.get(i);
//           pair[1] = heights.get(j);
//         }
//       }
//     }
//     return pair;
//   }

//   public static void main(String[] args) {
//     ArrayList<Integer> heights = new ArrayList<>();
//     heights.add(1);
//     // heights.add(8);
//     // heights.add(6);
//     heights.add(2);
//     // heights.add(5);
//     heights.add(4);
//     // heights.add(8);
//     heights.add(3);
//     // heights.add(7);
//     int[] result = Water(heights);
//     System.out.println("Pair is " + result[0] + " , " + result[1]);
//   }
// }

