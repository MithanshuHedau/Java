package Linkedlist;
public class Subsets {
  public static void findsubstring(String str, String ans, int i) {
    // base case
    if (i == str.length()) {
      System.out.println(ans);
      return;
    }

    // recurrsion
    // yes case
    findsubstring(str, ans + str.charAt(i), i + 1);// agar char ko lena haistring mese yani ki yes hai , to usko initial ans me add karo and i ko increment karo

    // no case
    findsubstring(str, ans, i + 1); // agar lena nahi chahta toh us ans ko vaise he rakho and i ko increment karo
  }

  public static void main(String[] args) {
    String str = "abcd";
    findsubstring(str, "", 0);
  }

}
