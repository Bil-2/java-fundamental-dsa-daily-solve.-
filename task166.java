import java.util.Scanner;
public class task166 {//transpose of a matrix
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter  Array  Data :");                             
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) 
              {
                a[i][j] = r.nextInt();
              }
        }
        System.out.println("Array Matrix:\n");                
             
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[i][j]  );
            }
        }
        System.out.println("Transposed Matrix:\n");
        for (int i = 0; i <=1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
  
}
