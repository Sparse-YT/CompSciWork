import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {


               System.out.print("Type any # | ");
               double a = keyboard.nextDouble();
               System.out.print("Enter a Symbol 1 = + , 2 = - , 3 = * , 4 = / ,  | ");
               int b = keyboard.nextDouble();
               System.out.print("Type another # | ");
               int c = keyboard.nextDouble();
               System.out.print("Type 5 for the remainder of #/# | ");
               int d = keyboard.nextDouble();

               double z = 0;



               if (b == 1) {
                z = a + c;
               }

               if (b == 2) {
                z = a - c;
               }

               if (b == 3) {
                z = a * c;
               }

               if (b == 4) {
                z = a / c;
               }

               if (d == 5) {
                z = a % c;
               }

             System.out.print(z);
                

        }


    }
}