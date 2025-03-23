
import java.util.Arrays;

public class BinarySearch {
  // O(log n)
  static int binarySearch(int arr[], int key) {
    int start = 0, end = arr.length-1;

    while(start <= end) {
      int mid = (start+end)/2;
      if(key == arr[mid]) return mid; 
      if(arr[mid] < key) start = mid + 1;
      else end = mid - 1;
    }
    return -1;
  }

  public static void main(String[] args) {
    int numbers[] = {3,7,2,4,4,9,22,5,6};
    // Binary search works only with sorted arrays
    Arrays.sort(numbers);
    
    int foundIndex = binarySearch(numbers, 2);
    if(foundIndex == -1) {
      System.out.println("Key not present in the array");
    } else {
      System.out.println("Element found at index: " + foundIndex);
    }
  }
}
