import java.util.Arrays;

public class Program4 {
    public static int binarySearch(int[] array, int key) {
        int left = 0, right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == key)
                return mid;
            
            if (array[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 7;
        int result = binarySearch(array, key);

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Key: " + key);
        
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
