public class task128 {//switch statement to print the name of the day based on the number input//
  public static void main(String[] args) {
    int day = 6;
    String dayName;
    switch (day) {
      case 1:
        dayName = "Monday";
        break;
      case 2:
        dayName = "Tuesday";
        break;
      case 3:
        dayName = "Wednesday";
        break;
      case 4:
        dayName = "Thursday";
        break;
      case 5:
        dayName = "Friday";
        break;
      case 6:
        dayName = "Saturday";
        break;
      case 7:
        dayName = "Sunday";
        break;
      default:
        dayName = "Invalid day number";
    }
    System.out.println("The name of the day is: " + dayName);
  }
  
}
