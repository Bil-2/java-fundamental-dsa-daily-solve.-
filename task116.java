public class task116 {//compound interest//
  public static void main(String[] args) {
    long p =  178978567676767L;
    int t =  50;
    double r =  10.6766;
    double ci = p * (Math.pow((1 + r / 100.0), t) - 1); 
    System.out.println("The compound interest is: " + ci);
  }    
















}