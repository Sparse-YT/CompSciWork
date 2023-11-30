import java.util.Scanner;

public class MiniLoop3 {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
int sum = 0;
int neg = 0;
int pos = 0;
int number = 0;
double av = 0;
int count = 0;

         int shiny = (int)(Math.random()*8193);
        int sID = (int)(Math.random()*8193);
                if(shiny == sID){
            System.out.println("You have unlocked the secrets of the universe, and the meaning of life");
        }else{

System.out.println("Enter a integer | ");
            number = keyboard.nextInt();
            if (number > 0){
                pos++;
            }else{
                neg++;
            }
                            sum = sum + number;
            for(count = 1; number != 0; count++){
                System.out.println("Enter a integer | ");
            number = keyboard.nextInt();
                sum = sum + number;

            if(number > 0){
             pos++;
            }
            if(number < 0){
             neg++;
            }
             
              

         
            }
count --;

            System.out.println(number);
            System.out.println(sum);
            System.out.println(count);
                   av = (double)sum/(double)count;
System.out.println("You entered " + pos + " positive number(s)");
System.out.println("You entered " + neg + " negative number(s)");
System.out.println("Your average is " + av);

            
        }

        




        }
    }
}
