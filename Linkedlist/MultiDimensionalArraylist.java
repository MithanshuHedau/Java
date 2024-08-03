package Linkedlist;
import java.util.*;

public class MultiDimensionalArraylist {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
    ArrayList<Integer> subList1 = new ArrayList<>();
    ArrayList<Integer> sublist3 = new ArrayList<>();
    ArrayList<Integer> subList2 = new ArrayList<>();

    subList1.add(1);
    subList1.add(2);
    mainlist.add(subList1);

    subList2.add(3);
    subList2.add(4);
    mainlist.add(subList2);

    sublist3.add(5);
    sublist3.add(6);
    mainlist.add(sublist3);

    for (int i = 0; i < mainlist.size(); i++) {
      ArrayList<Integer> currlist = mainlist.get(i);
      for (int j = 0; j < currlist.size(); j++) {
        System.out.print(currlist.get(j) + " ");
      }
      System.out.println();
    }

    System.out.println(mainlist);
  }
}