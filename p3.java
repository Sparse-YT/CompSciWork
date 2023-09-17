import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Please enter your weight | ");
            double weight = keyboard.nextDouble();



            double mercury = .4 * weight;
            double venus = .9 * weight;
            double mars = .38 * weight;
            double jupitar = 2.3 * weight;
            double saturn = 1.1 * weight;
            double uranus = .92 * weight;
            double neptune = 1.2 * weight;

            


               System.out.println("Planet | Mercury | Venus | Mars | Jupitar | Saturn | Uranus | Neptune |");
               System.out.println("-----------------------------------------------------------------------");
               System.out.println("Weight | "+mercury+" | "+venus+" | "+mars+" | "+jupitar+" | "+saturn+" | "+uranus+" | "+neptune+" |");


        
        }


    }
}