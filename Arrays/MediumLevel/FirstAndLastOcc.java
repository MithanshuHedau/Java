package Arrays.MediumLevel;
public class FirstAndLastOcc {
  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
    int target = 8;
    int count = 0;
    int first = -1;
    int last = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        if (first == -1) {
          first = i;
        }
        last = i;
      }
    }
    System.out.println(first + " " + last);
  }
}
