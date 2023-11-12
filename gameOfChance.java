import java.util.Scanner;
public class gameOfChance {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
            // variables 
            int dice = 0;
            int coin = 0;
            int wheel = 0;
            String bCoin = ("");
            String sWheel = ("");
            boolean dC;
            boolean cC;
            boolean wC;
            String colorWheel = (""); 
            String coinFlip = ("");

            // inputs

               System.out.println("Enter your guess fo the coin flip, Heads (h) or Tails (t) | ");
               String cFlip = keyboard.nextLine();
               System.out.println("Enter your guess for the Colour wheel, Yellow (y) Red (r) Blue (b) Green (g) | ");
               String cWheel = keyboard.nextLine();
               System.out.println("Enter your guess for the dice roll, 1 to 6  | ");
               int dRoll = keyboard.nextInt();
               

             // Math
            dice = (int)(Math.random() * 6) + 1;
            coin = (int)(Math.random() * 2);
            wheel = (int)(Math.random() * 3) + 1;

            // If statments 

            //coin
            if(coin == 1){
                coinFlip = "heads";
            }else {
                coinFlip = "tails";
            }

            if (coin == 1){
                bCoin = "h";
            }else {
                bCoin = "t";
            }
            if(cFlip.equals(bCoin)){
              cC = true;
            }else{
                cC = false;
            }

            // wheel
            if (wheel == 1){
                sWheel = "y";
            }else if (wheel == 2){
                sWheel = "r";
            }else if (wheel == 3){
                sWheel = "b";
            }else if(wheel >= 4){
                sWheel = "g";
            }

            if (sWheel.equals(cWheel)){
                wC = true;
            }else{
               wC = false;
            }

            if (sWheel.equals("y")){
                colorWheel = "yellow";
            }
            if (sWheel.equals("r")){
                colorWheel = "red";
            }
            if (sWheel.equals("b")){
                colorWheel = "blue";
            }
            if (sWheel.equals("g")){
                colorWheel = "green";
            }
            

            // dice 
            if (dice == dRoll){
               dC = true ;
            }else {
                dC = false;
            }
            




               System.out.println("");
               System.out.println(" you landed on " + coinFlip + ".");
               System.out.println(" you spun a " + colorWheel + ".");
               System.out.println(" you rolled a " + dice + ".");
               System.out.println("");


        
             // closing if statments 

             if(cC && (wC && dC)){
                System.out.println("Your guess are all correct!!! ");

             }
             if(!cC && (!wC && !dC)){
                System.out.println("All your guesses are WRONG!!! ");
             }

             if (cC == true){
                System.out.print("your coin flip guess is correct,");
             }else{
                System.out.print("");
             }

            if (wC == true){
                System.out.print("your colour wheel guess is correct,");
             }else{
            System.out.print("");
             }

             if (dC == true){
                System.out.print("your dice roll guess is correct,");
             }else{
                System.out.print("");
             }




        }
    }
}