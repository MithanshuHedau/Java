package Arrays.EasyLevel;

public class Converting {
  public static void main(String[] args) {
    int num = 5;
    String result = "";
    int finalans;
    String str = Integer.toBinaryString(num);
    System.out.println(str);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '0') {
        result += "1";
      } else {
        result += "0";
      }
    }
    System.out.println(result);
    finalans = Integer.parseInt(result, 2);

    System.out.println(finalans);
  }
}
