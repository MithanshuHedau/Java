package Stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class FrameWork {
  
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> arr = new ArrayList<>();
    s.push(1);
    s.add(2);
    s.add(3);
    System.out.print(s);

    System.out.println("");
    Collections.reverse(s);
    System.out.print(s);

    System.out.println(" ");
    s.add(4);
    System.out.print(s);
    System.out.println(" ");
    Collections.reverse(s);
    System.out.print(s);
    System.out.println(s.size());
  }
}
