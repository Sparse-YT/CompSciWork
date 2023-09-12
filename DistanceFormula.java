import java.util.Scanner;

public class DistanceFormula {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
               System.out.print("Enter x coordinate of the first point | ");
               int x1 = keyboard.nextInt();
               System.out.print("Enter x coordinate of the second point | ");
               int x2 = keyboard.nextInt();
               System.out.print("Enter y coordinate of the first point | ");
               int y1 = keyboard.nextInt();
               System.out.print("Enter y coordinate of the second point | ");
               int y2 = keyboard.nextInt(); 
                
               double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 - y1));

                

               
            
               
                    

               System.out.println("The first point is : (" + x1 + " , " + y1 + ")");
               System.out.println("The first point is : (" + x2 + " , " + y2 + ")");
               System.out.println("The distance between the points is : " + d);
        }


    }
}
