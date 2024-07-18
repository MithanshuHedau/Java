public static int[] sums(int[] arr, int target) {
  int[] pair = new int[2];
  int sum = 0;
  for (int i = 0; i < arr.length; i++) {
  for (int j = i + 1; j < arr.length; j++) {
  sum = arr[i] + arr[j];
  if (sum == target) {
  pair[0] = arr[i];
  pair[1] = arr[j];
  }
  }
  }
  return pair;
  }

  public static void main(String[] args) {
  int[] arr = { 3,1,5 };
  int target = 8;
  int[] result = sums(arr, target);
  System.out.println(result[0] + " " + result[1]);
  }