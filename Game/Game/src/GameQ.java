import java.util.Scanner;
import java.util.ArrayList;





public class GameQ {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {
            ArrayList<State> states = new ArrayList<State>();
            states.add(new State("Alabama", "AL", 4949697, 30));
            states.add(new State("Alaska", "AK", 720763, 1));
            states.add(new State("Arizona", "AZ", 7640796, 6));
            states.add(new State("Arkansas", "AR", 3042017, 29));
            states.add(new State("California", "CA", 39664128, 3));
            states.add(new State("Colorado", "CO", 5961083, 8));
            states.add(new State("Connecticut", "CT", 3546588, 48));
            states.add(new State("Delaware", "DE", 998619, 49));
            states.add(new State("Florida", "FL", 22177997, 22));
            states.add(new State("Georgia", "GA", 10936299, 24));
            states.add(new State("Hawaii", "HI", 1401709, 43));
            states.add(new State("Idaho", "ID", 1896652, 14));
            states.add(new State("Illinois", "IL", 12518071, 25));
            states.add(new State("Indiana", "IN", 6842385, 38));
            states.add(new State("Iowa", "IA", 3174426, 26));
            states.add(new State("Kansas", "KS", 2919179, 15));
            states.add(new State("Kentucky", "KY", 4487233, 37));
            states.add(new State("Louisiana", "LA", 4616106, 31));
            states.add(new State("Maine", "ME", 1359677, 39));
            states.add(new State("Maryland", "MD", 6075314, 42));
            states.add(new State("Massachusetts", "MA", 6922107, 44));
            states.add(new State("Michigan", "MI", 9995212, 11));
            states.add(new State("Minnesota", "MN", 5739781, 12));
            states.add(new State("Mississippi", "MS", 2961536, 32));
            states.add(new State("Missouri", "MO", 6184843, 21));
            states.add(new State("Montana", "MT", 1093117, 4));
            states.add(new State("Nebraska", "NE", 1960790, 16));
            states.add(new State("Nevada", "NV", 3238601, 7));
            states.add(new State("New Hampshire", "NH", 1378449, 46));
            states.add(new State("New Jersey", "NJ", 8870685, 47));
            states.add(new State("New Mexico", "NM", 2109093, 5));
            states.add(new State("New York", "NY", 19223191, 27));
            states.add(new State("North Carolina", "NC", 10807491, 28));
            states.add(new State("North Dakota", "ND", 774008, 19));
            states.add(new State("Ohio", "OH", 11727377, 34));
            states.add(new State("Oklahoma", "OK", 4007179, 20));
            states.add(new State("Oregon", "OR", 4325290, 9));
            states.add(new State("Pennsylvania", "PA", 12805190, 33));
            states.add(new State("Rhode Island", "RI", 1062583, 50));
            states.add(new State("South Carolina", "SC", 5342388, 40));
            states.add(new State("South Dakota", "SD", 902542, 17));
            states.add(new State("Tennessee", "TN", 7001803, 36));
            states.add(new State("Texas", "TX", 30097526, 2));
            states.add(new State("Utah", "UT", 3363182, 13));
            states.add(new State("Vermont", "VT", 622882, 45));
            states.add(new State("Virginia", "VA", 8638218, 35));
            states.add(new State("Washington", "WA", 7887965, 18));
            states.add(new State("West Virginia", "WV", 1755715, 41));
            states.add(new State("Wisconsin", "WI", 5867518, 23));
            states.add(new State("Wyoming", "WY", 582233, 10));
            



            

            int rngS = (int) ((Math.random() * 50 ));
            int rngA = (int) ((Math.random() * 50 ));
            State stateA = states.get(rngA);


            String q1 = "Q1: Which state has the highest rank? (highest being Rank 1)";

            String a1 = "Alaska"; // right answer
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String a2 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String a3 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String a4 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            

            String q2 = ("Q2: What state is " + states.get(rngS).getAbiv()+ " ?");

            String b1 = "" + states.get(rngS).getName() + ""; // right answer
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String b2 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String b3 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String b4 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));

            rngS = (int) ((Math.random() * 50 ));
            String q3 = ("Q3: Population of " + states.get(rngS).getName() + " is ?");

            String c1 = (""+states.get(rngS).getPop()); // right answer
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String c2 = (""+states.get(rngA).getPop());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String c3 = (""+states.get(rngA).getPop());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String c4 = (""+states.get(rngA).getPop());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));

            rngS = (int) ((Math.random() * 50 ));
            String q4 = ("Q4: Rank " + states.get(rngS).getRank() + " is which state?");

            String d1 = (""+states.get(rngS).getName()); // right answer
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String d2 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String d3 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String d4 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));

            rngS = (int) ((Math.random() * 50 ));
            String q5 = ("Q5: " + states.get(rngS).getPop() + " is the population that belongs to which state ? ");

            String e1 = (""+states.get(rngS).getName()); // right answer
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String e2 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String e3 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));
            String e4 = (""+states.get(rngA).getName());
            rngS = (int) ((Math.random() * 50 ));
            rngA = (int) ((Math.random() * 50 ));

            int count2 = 4;
            int rng = (int)((Math.random() * count2));
            int rg = 0;







            ArrayList<String> answers1 = new ArrayList<String>();
            answers1.add(a1);
            answers1.add(a2);
            answers1.add(a3);
            answers1.add(a4);



            ArrayList<String> answers2 = new ArrayList<String>();
            answers2.add(b1);
            answers2.add(b2);
            answers2.add(b3);
            answers2.add(b4);

            ArrayList<String> answers3 = new ArrayList<String>();
            answers3.add(c1);
            answers3.add(c2);
            answers3.add(c3);
            answers3.add(c4);

            ArrayList<String> answers4 = new ArrayList<String>();
            answers4.add(d1);
            answers4.add(d2);
            answers4.add(d3);
            answers4.add(d4);

            ArrayList<String> answers5 = new ArrayList<String>();
            answers5.add(e1);
            answers5.add(e2);
            answers5.add(e3);
            answers5.add(e4);






            
            int wrong = 0;
            int right = 0;
            String answer;

            int count = 0;
            String answeString = "";
            boolean end = false;
            
            System.out.println("Welcome to the Internet, this is a states quiz game");
            System.out.println("                 Start the game?");
            System.out.println("            Yes: Enter y    No: Enter n");
            String start = keyboard.nextLine();
            boolean str = false;
            if (start.equals("y")) {
                str = true;
            }
            int rngCount ;
            while(str = true & count != 5){
                System.out.println("The answers are case sensitive!");
                System.out.println(q1);
                for(int i = 0; i < 4; i ++ ){
                    System.out.println(answers1.get(rng));
                    answers1.remove(rng);
                    //System.out.println(rng);
                    count2 --;
                    rng = (int)((Math.random() * count2 ));
                     
              
                }
                answer = keyboard.nextLine();
                if(answer.equals(a1)){
                    right ++;
                    count ++;
                }else{
                    wrong ++;
                    count ++;
                }  

//q1
                count2 = 4;
                rng = (int)((Math.random() * count2 ));
                System.out.println("The answers are case sensitive!");
                System.out.println(q2);
                for(int i = 0; i < 4; i ++ ){
                    System.out.println(answers2.get(rng));
                    answers2.remove(rng);
                    //System.out.println(rng);
                    count2 --;
                    rng = (int)((Math.random() * count2 ));
                     
                
                }
                answer = keyboard.nextLine();
                if(answer.equals(b1)){
                    right ++;
                    count ++;
                }else{
                    wrong ++;
                    count ++;
                }  
        
//q2
count2 = 4;
rng = (int)((Math.random() * count2 ));
System.out.println("The answers are case sensitive!");
System.out.println(q3);
for(int i = 0; i < 4; i ++ ){
    System.out.println(answers3.get(rng));
    answers3.remove(rng);
    //System.out.println(rng);
    count2 --;
    rng = (int)((Math.random() * count2 ));
    
     

}
answer = keyboard.nextLine();
if(answer.equals(c1)){
    right ++;
    count ++;
}else{
    wrong ++;
    count ++;
} 
//q3
count2 = 4;
rng = (int)((Math.random() * count2 ));
System.out.println("The answers are case sensitive!");
System.out.println(q4);
for(int i = 0; i < 4; i ++ ){
    System.out.println(answers4.get(rng));
    answers4.remove(rng);
    //System.out.println(rng);
    count2 --;
    rng = (int)((Math.random() * count2 ));
     

}
answer = keyboard.nextLine();
if(answer.equals(d1)){
    right ++;
    count ++;
}else{
    wrong ++;
    count ++;
} 
//q4
count2 = 4;
rng = (int)((Math.random() * count2 ));
System.out.println("The answers are case sensitive!");
System.out.println(q5);
for(int i = 0; i < 4; i ++ ){
    System.out.println(answers5.get(rng));
    answers5.remove(rng);
    //System.out.println(rng);
    count2 --;
    rng = (int)((Math.random() * count2 ));
     

}
answer = keyboard.nextLine();
if(answer.equals(e1)){
    right ++;
    count ++;
}else{
    wrong ++;
    count ++;
} 
//q5

            }
            System.out.println("You got " + right + " right!!!");
            System.out.println("You got " + wrong + " wrong!!!");
            System.out.println("Ending Simulation");

        } 


    }

}
   






