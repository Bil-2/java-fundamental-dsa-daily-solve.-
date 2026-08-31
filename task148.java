import java.util.Scanner;

public class task148 { // dynamic array
  public static void main(String[] args) {
    Scanner r = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int size = r.nextInt();

    int[] a = new int[size];
    System.out.println("Enter " + size + " elements:");

    for (int i = 0; i < size; i++) {
      a[i] = r.nextInt();
    }

    System.out.print("Array elements: ");
    for (int i = 0; i < size; i++) {
      System.out.print(a[i] + " ");
    }

  
  }
}
