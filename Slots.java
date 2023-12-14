import java.util.Scanner;

public class Slots {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int n1 = (int)(Math.random()*1);
            int n2 = (int)(Math.random()*1);
            int n3 = (int)(Math.random()*1);
            double wallet = 1000;
            String start = "";
            String cos = "";
            int count = 0;


            if (wallet > 0){
                System.out.print("To start type start | ");
                start = keyboard.nextLine();
            while(start.equals("start")){
            n1 = (int)(Math.random()*10);
            n2 = (int)(Math.random()*10);
            n3 = (int)(Math.random()*10);
            System.out.println(n1 + "|" + n2 + "|" + n3 );
            if (n1 == n2 && n1 == n3){
                System.out.println("all three numbers match");
                wallet = wallet + 1000 * .30;
                System.out.println("Your balance is " + wallet);
            }else if ((n1 == n2 && n1 != n3) || (n1 != n2 && n1 == n3)){
                System.out.println("only two numbers match");
                wallet = wallet + 1000 * .15;
                System.out.println("Your balance is " + wallet);
            }else{
                System.out.println("no numbers match");
                wallet = wallet - 1000 * .20;
                System.out.println("Your balance is " + wallet);
                
            }
            if(wallet <= 0){
                System.out.println("Your balance is " + wallet + " you can't play anymore.");
                start = "";
            }
            if (wallet > 0 ){
            
                System.out.print("To continue type continue, to stop type stop | ");
                cos = keyboard.nextLine();
                if (cos.equals("stop") ){
                    start = "";
                    System.out.println("Your balance is " + wallet);
                    System.out.println("");
                }else if (cos.equals("continue")){
                    System.out.println("");
                }else{
                    start = "";
                    System.out.println("ERROR INCORRECT WORD BALANCE IS NOW ZERO");
                    System.out.println("Your balance is " + (wallet - wallet));
                    }
                }
                }
            }
            }

                    

        

            }


        }
    

