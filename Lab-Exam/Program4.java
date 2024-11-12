import java.util.Arrays;

class Program4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 32;
        arr[3] = 6;
        arr[4] = 9;

        System.out.println("Before: " + Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        System.out.println("After: " + Arrays.toString(arr));
    }
}