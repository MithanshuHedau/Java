package Stacks;

// push pop peek isempty
import java.util.ArrayList;

public class StacksUsingArraylist {
  static class stack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isempty() {
      if (list.size() == 0) {
        return true;
      } else {
        return false;
      }
    }

    public void push(int data) {
      list.add(data);
    }

    public int pop() {
      if (isempty()) {
        return -1;
      }
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    public int peek() {
      if (isempty()) {
        return -1;
      }
      return list.get(list.size() - 1);
    }

    public void display() {
      for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");
      }
    }
  }

  public static void main(String[] args) {
    stack s = new stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.pop();
    s.pop();
    s.display();
    System.out.println(s.peek());
  }
}
