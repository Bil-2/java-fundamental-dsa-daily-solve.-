public class task135 {//take input  5 subject marks drop the least one and calculate the overall percentage considering the remaining 4 subjects//
  public static void main(String[] args) {
    int[] marks = {85, 90, 78, 92, 88}; // Example marks for 5 subjects
    int totalMarks = 0;
    int minMark = marks[0];

    // Calculate total marks and find the minimum mark
    for (int mark : marks) {
      totalMarks += mark;
      if (mark < minMark) {
        minMark = mark;
      }
    }

    // Drop the least mark and calculate overall percentage
    totalMarks -= minMark; // Subtract the least mark
    double percentage = (totalMarks / 400.0) * 100; // Assuming each subject is out of 100

    System.out.println("The overall percentage after dropping the least mark (" + minMark + ") is: " + percentage + "%");
  }
  
}
