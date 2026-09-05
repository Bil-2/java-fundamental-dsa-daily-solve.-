import java.util.Scanner;
public class task165 {//sum of two matrices
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) { 
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = r.nextInt();
            }
        }

        // Adding two matrices
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Displaying the resultant matrix
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
  
}
