// Java program to get length of the String

public class Program1 {
  public static void main(String[] args) {
    String s = "Hello World!";
    System.out.println(s);

    int length = s.length();
    System.out.println("Length: " + length);

    char[] arr = s.toCharArray();
    System.out.println("Length: " + arr.length);
  }
}
