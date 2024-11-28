// Q.12.	Write a Java program to insert value at a particular position of an array.

class Test {
  public static void main(String[] args) {
  int[] arr = {10, 15, 16, 47};
  int[] newArr = new int[5];
  
  int val = 20;
  int pos = 3;

  for (int i = 0; i < pos; i ++) {
    newArr[i] = arr[i];
  }

  newArr[pos] = val;

  for (int i = pos + 1; i < newArr.length; i++) {
    newArr[i] = arr[i-1];
  }

  System.out.print("Output Array: ");
  for (int newVal: newArr) {
    System.out.print(newVal + " ");
  }
  }
}