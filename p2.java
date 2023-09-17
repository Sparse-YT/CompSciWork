import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Please enter your first name | ");
            String fname = keyboard.nextLine();
            System.out.print("Please enter your middle name | ");
            String mname = keyboard.nextLine();
            System.out.print("Please enter your last name | ");
            String sname = keyboard.nextLine();

               System.out.print(sname + "," + mname + "," + fname);


        
        }


    }
}