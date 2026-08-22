public class task120 {//factorial of a number//
  public static void main(String[] args) {
    long n = 1000L;
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }
    System.out.println("The factorial of " + n + " is: " + factorial);
  }
}
