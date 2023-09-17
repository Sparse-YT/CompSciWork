import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Give me any # of seconds | ");
            int time = keyboard.nextInt();

            int hours = time / 3600;
            int minutes = (time / 60) % 60;
            int seconds = time % 60;
            


            System.out.print(hours + "," + minutes + "," + seconds);







            



        
        }


    }
}