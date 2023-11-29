import java.util.Scanner;

public class MiniLoop2 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
        int rng = (int)(Math.random()*101);
         int shiny = (int)(Math.random()*8193);
        int sID = (int)(Math.random()*8193);
                if(shiny == sID){
            System.out.println("You have unlocked the secrets of the universe, and the meaning of life");
        }else{

        for(int count = 1; count <= 1; count ++){
            System.out.println("Enter a guess | ");
        int guess = keyboard.nextInt();
            if(guess > rng){
                System.out.println("Too High");
            }else if (guess < rng){
                System.out.println("Too Low");

            }else{
                System.out.println("Correct!!! It took you " + count + " guesses");

            }
        }
        }

        




        }
    }
}
