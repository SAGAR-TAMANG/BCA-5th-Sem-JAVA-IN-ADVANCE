import java.util.Arrays;

class Sort {
  public static void main(String[] args) {
    String user = "upa";

    char[] user_arr = user.toCharArray();
    Arrays.sort(user_arr);
    
    System.out.println("Original: " + user);
    System.out.println("Sorted: " + new String(user_arr));
  }
}