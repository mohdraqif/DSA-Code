public class PrimeOrNotOptimised {
  static boolean isPrime(int number) {
    if(number == 2) {
      return true;
    } else {
      // check for any factors other than 1 and number itself
      for(int i=2; i<=Math.sqrt(number); i++) {
        if((number % i) == 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    if(isPrime(11)) {
      System.out.println("Prime number");
    } else {
      System.out.println("Not a prime number");
    }
  }
}
