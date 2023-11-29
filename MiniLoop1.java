import java.util.Scanner;

public class MiniLoop1 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
int number = 0;
int count2 = 0;
int sum = 0;
int shiny = (int)(Math.random()*8193);
int sID = (int)(Math.random()*8193);
       if(shiny == sID){
   System.out.println("You have unlocked the secrets of the universe, and the meaning of life");
}else{
            for(int count = 10; count > 0 ; count--){
            System.out.println("Enter a number | ");
            number = keyboard.nextInt();
            if (number == 0){
                count = 0;
                count2 = count;
            }
            sum += number;


            }
            
                       

            if(count2 == 0 ){
                System.out.println("The sum is " + sum);
            }
        }

        }
    }
}
