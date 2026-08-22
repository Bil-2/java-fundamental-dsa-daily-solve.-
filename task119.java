public class task119 {
  public static void main(String[] args) {
    long num = 202020202020202020L;
    boolean prime = num > 1;
    for (int i = 2; prime && i * i <= num; i++)
      prime = num % i != 0;
    System.out.println(num + (prime ? " is a prime number." : " is not a prime number."));
  }
}