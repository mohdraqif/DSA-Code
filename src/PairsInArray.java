public class PairsInArray {
  static void pairsOfAnArray(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      for(int j=i+1; j<arr.length; j++) {
        System.out.printf("(%d,%d)", arr[i], arr[j]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int numbers[] = {1,2,3,4,5,6,7};
    pairsOfAnArray(numbers);
  } 
}
