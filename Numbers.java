import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter 2 | ");
               int num1 = keyboard.nextInt();
               System.out.print("Enter 3 | ");
               int num2 = .nextInt();
               System.out.print("Enter 4 | ");
               int num3 = keyboard.nextInt();

                

               double result = ((double)(num1 * num2) / num3);
            
               int rounded = (int)Math.round(result);
                    
                     System.out.println("num1 : " + num1);
                     System.out.println("num2 : " + num2);
                     System.out.println("num3 : " + num3);
                     System.out.println("result : " + result);
                     System.out.println("rounded : " + rounded);
        }


    }
}
