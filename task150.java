import java.util.Scanner;
public class task150 {//find the length of array
  public static void main(String[] args) {
    int a[]= new int[5];
    Scanner r = new Scanner(System.in);
    System.out.println("Enter the elements of the array: ");
    for (int i=0; i<a.length; i++) {
      a[i] = r.nextInt();
    }
    System.out.print ("array elements: ");
    for (int i=0; i<a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println("array length is: " + a.length);   
  }
}
