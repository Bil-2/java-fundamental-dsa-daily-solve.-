public class task138 {//break&continue
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break; // Exit the loop when i is 5
      }
      System.out.println("i: " + i);
    }
    
    for (int j = 1; j <= 10; j++) {
      if (j == 5) {
        continue; // Skip the rest of the loop when j is 5
      }
      System.out.println("j: " + j);
    }
  }
  
}
