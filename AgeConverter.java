import java.util.Scanner;

public class AgeConverter {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
               int years = 12;
               int hours = 24; 
               int seconds = 3600;
               int cYear = 2022;
               int cMonth = 12;
               int cDay = 31;
               int oHours = hours * (years * 365) ;
               int oSeconds = seconds * (years * 365) ;


               System.out.print("Enter your birthyear | ");
               int bYear = keyboard.nextInt();
               System.out.print("Enter your birthmonth | ");
               int bMonth = keyboard.nextInt();
               System.out.print("Enter your birthday (just the day of the month) | ");
               int bDay = keyboard.nextInt();


               int zyears = cYear - bYear;
               int months = cMonth - bMonth;
               int days = cDay - bDay;

               

            System.out.println(" -You are " + zyears + " years old as of December 31, 2022.");
            System.out.println("  -You have lived for a total of " + zyears + " Years, " + months + " month(s), and " + days + " day(s).");
            System.out.println("   -That is a total of " + years * 365 + " days.");
            System.out.println("    -That is a total of " + oHours + " hours.");
            System.out.println("     -That is a total of " + oSeconds + " seconds.");


        }
    }
}