import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
               System.out.print("Please enter in a number between 0 and 255 | ");
               int decimal = keyboard.nextInt();
               int h = (decimal / 255) % 2;
               int g = (decimal / 128) % 2;
               int f = (decimal / 64) % 2;
               int e = (decimal / 32) % 2;
               int d = (decimal / 16) % 2;
               int c = (decimal / 8) % 2;
               int b = (decimal / 4) % 2;
               int a = decimal % 2;
               
               
               System.out.print(g);
               System.out.print(f);
               System.out.print(e);
               System.out.print(d);
               System.out.print(c);
               System.out.print(b);
               System.out.print(a);
               System.out.print(h);

                

        }


    }
}