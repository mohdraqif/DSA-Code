import java.util.Scanner;

public class PrimeInRange {
  static boolean isNumberPrime(int number) {
    for(int i=2; i<=Math.sqrt(number); i++) {
      if(number == 2) return true;
      if((number % i) == 0) {
        return false;
      }
    }
    return true;
  }

  static void primeInRange(int range) {
    for(int i=2; i<=range; i++) {
      if(isNumberPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int range = sc.nextInt();
      primeInRange(range);
  }
}
