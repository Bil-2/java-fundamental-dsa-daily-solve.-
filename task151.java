import java.util.Scanner;
public class task151 {//print array in reverse order
  public static void main(String[] args) {
    int a[]= new int  [5];
    Scanner r=new Scanner(System.in);
    System.out.print ("enter elements in array\n ");
    for (int i=0; i<a.length; i++) {
      a[i] = r.nextInt();
    }
    System.out.print ("\narray elements  ");
    for (int i=0 ;i<a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println("array elements in reverse  ");
    for (int i=a.length-1; i>=0; i--) {
      System.out.print(a[i]+" ");
    }
  }
  
}
   