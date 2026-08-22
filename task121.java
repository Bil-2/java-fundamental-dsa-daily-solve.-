import java.util.Scanner;

public class task121 { // input output
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int firstnum = sc.nextInt();
    System.out.println("You entered: " + firstnum);
    System.out.println("Enter another number: ");
    int secondnum = sc.nextInt();
    System.out.println("You entered: " + secondnum);
     int sum = firstnum + secondnum;
    System.out.println("The sum of the two numbers is: " + sum);
  }
} 
