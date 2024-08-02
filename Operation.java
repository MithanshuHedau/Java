public class Operation {
    class Node {
      int data;
      Node next;
    }
  
    private Node head;
    private Node tail;
    private int size;
  
    public void addfirst(int item) {
      Node nn = new Node();
      nn.data = item;
      if (size == 0) {
        head = tail = nn;
        size++;
      } else {
        nn.next = head;
        head = nn;
        size++;
      }
    }
  
    public void display() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
    }
  
    public void addlast(int item) {
      Node nn = new Node();
      nn.data = item;
      if (size == 0) {
        head = tail = nn;
        size++;
      } else {
        tail.next = nn;
        tail = nn;
        size++;
      }
    }
  
    public void addmiddle(int item, int index) {
      int i = 0;
      Node nn = new Node();
      nn.data = item;
      if (size == 0) {
        head = tail = nn;
        size++;
      } else {
        Node temp = head;
        while (i < index - 1) {
          temp = temp.next;
          i++;
        }
        nn.next = temp.next;
        temp.next = nn;
        size++;// 
      }
    }
  
    public void deletefirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else {
        head = head.next;
        size--;
      }
    }
  
    public void deletelast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else {
        Node temp = head;
        while (temp.next != tail) {
          temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
      }
    }
  
    public void deletemiddle(int item) {
      int i = 0;
      Node temp = head;
      if (size == 0) {
        System.out.println("List is empty");
      } else {
        while (i != item - 1) {
          temp = temp.next;
          i++;
        }
        temp.next = temp.next.next;
        size--;
      }
    }
  
    public static void main(String[] args) {
      linkedlist ll = new linkedlist();
      ll.addfirst(1);
      ll.addfirst(2);
      ll.addfirst(3);
      ll.display();
      System.out.println(" ");
      ll.addlast(4);
      ll.addlast(5);
      ll.display();
      System.out.println(" ");
      ll.addmiddle(10, 3);
      ll.display();
      System.out.println(" ");
      ll.deletefirst();
      ll.display();
      System.out.println(" ");
      ll.deletelast();
      ll.display();
      System.out.println(" ");
      ll.deletemiddle(2);
      ll.display();
    }
  }
  

