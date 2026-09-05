import java.util.Scanner;
public class task167 {//mirror of a matrix
    public static void main(String[] args) {
        int a[][] = new int[3][3];
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
        System.out.println("Mirror Matrix:\n");
        for (int i = 0; i <=1; i++) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
  
}
