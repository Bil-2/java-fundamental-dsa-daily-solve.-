import java.util.Scanner;
public class task164 {//matrix of 2D array
    public static void main(String[] args) {
        int a[][]  = new int[3][5];
        System.out.println("Enter 2D Array Elements :");
        Scanner r = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {//rows
            for (int j = 0; j < a.length; j++) {//columns
                a[i][j] = r.nextInt();
            }
        }
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
  
}
