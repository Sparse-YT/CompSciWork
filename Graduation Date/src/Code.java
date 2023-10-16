import java.util.Scanner;

class Code{



public static final Scanner input = new Scanner(System.in);

public void inputDays(){
    System.out.println("In how many days will you graduate? ");
    int days = input.nextInt();

    double months = days / 30;
    double weeks = (days % 30) / 7;
    double days2 = (days % 30) % 7;
    String dayString = "Day";
    String daysString = "Days";
    String weekString = "Week";
    String weeksString = "Weeks";
 

    System.out.print(months + " Months " + weeks);

    if (weeks > 1){
    System.out.print(weeksString);
    }else if (weeks == 1){
    System.out.print(weekString);
    }else {
     System.out.print(weeksString);
    }
    
    System.out.print(" "+days2 + " ");

       if (days2 > 1){
    System.out.print(daysString);
    }else if (days2 == 1){
    System.out.print(dayString);
    }
    System.out.print(" are left till graduation.");
}


}