public class take132 {//take input 5 subject marks and calculate the total, average and percentage//
  public static void main(String[] args) {
    int subject1 = 8545565;
    int subject2 = 9035356;
    int subject3 = 7845353;
    int subject4 = 9235566;
    int subject5 = 8834221;

    int totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
    double averageMarks = totalMarks / 5.0;
    double percentage = (totalMarks / 500.0) * 100;

    System.out.println("Total Marks: " + totalMarks);
    System.out.println("Average Marks: " + averageMarks);
    System.out.println("Percentage: " + percentage + "%");
  }
}