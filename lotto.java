import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.println("Enter your two digit Number | ");
            int lotto = keyboard.nextInt();

        int lottoNum ;
            lottoNum = (int)(Math.random() * 90) + 10 ;

            String lN = "Your ticket is " + lottoNum;

            

             int sn = (int)(Math.random() * 43) ;
            if (sn == 42 || lotto >= 100){
                System.out.println("You have unlocked the secrets of the universe and the meaning of life. ");
            }else{

                System.out.println(lN);

            if (lotto == lottoNum){
                System.out.println("You won 10,000");
            }

            if(lotto != lottoNum){

          if ((lotto / 10 == lottoNum % 10) && (lotto % 10 == lottoNum / 10)){
                System.out.println("You won 2,000");
          }else if (lotto / 10 == lottoNum % 10 || lotto / 10 == lottoNum / 10 ){
                System.out.println("You won 500");
                
          }else if (lotto % 10 == lottoNum % 10 || lotto % 10 == lottoNum / 10){
                System.out.println("You won 500");
          }

          if ((lotto / 10 == lottoNum % 10 || lotto / 10 == lottoNum / 10 ) || (lotto % 10 == lottoNum % 10 || lotto % 10 == lottoNum / 10) ){
             System.out.print("");

          }else {
                         System.out.println("You didn't win :[");
          }




        }

                //System.out.println(lotto + " | " + lottoNum);
        }
    }
}
}