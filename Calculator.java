import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
               System.out.print("Type 1 for decimals , Type 2 for Whole #'s");
               int start = keyboard.nextInt();
               System.out.print("Type any # | ");
               int a = keyboard.nextInt();
               System.out.print("Enter a Symbol 1 = + , 2 = - , 3 = * , 4 = / ,  | ");
               int b = keyboard.nextInt();
               System.out.print("Type another # | ");
               int c = keyboard.nextInt();
               System.out.print("Type 5 for the remainder of a / b")
               int d = keyboard.nextInt();
               int z = 0;

               if (start = 1) {
               a = (double) a; 
             
               } else { 
               a =(int) a;

               }

               if (start = 1) {
               c = (double) c; 
             
               } else { 
                c = (int) c;

               }

               if (b = 1) {
                z = a + c;
               }

               if (b = 2) {
                z = a - c;
               }

               if (b = 3) {
                z = a * c;
               }

               if (b = 4) {
                z = a / c;
               }

               if (d = 5) {
                z %= a / c;
               } else {
                d = 0;
               }


                

        }


    }
}