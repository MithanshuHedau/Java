package Stacks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class NextGreaterElement {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 1, 2, 4, 6, 7, 5 };
    int size = arr.length;
    int k;
    k = sc.nextInt();
    findSecondLargest(arr, size, k);
  }

  public static void findSecondLargest(int[] arr, int n, int k) {
    Arrays.sort(arr);
    if (k <= 0 || k > n) {
      System.out.println("Invalid value of k");
      return;
    }
    int large = arr[n - k];
    System.out.println(large);
  }
}
