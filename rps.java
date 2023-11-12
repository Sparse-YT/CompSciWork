import java.util.Scanner;

public class rps {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Choose Rock (0) Paper (1) Scissors (2)| ");
            int npc = keyboard.nextInt();

             int cpu = 0;
             String cpuR = "The cpu choice rock";
             String cpuP = "The cpu choice paper";
             String cpuS = "The cpu choice scissors";
             String npcR = "You choice rock";
             String npcP = "You choice paper";
             String npcS = "You choice scissors";
             String win = "you win";
             String lose = "you lose";

            cpu = (int)(Math.random() * 3);

        if (npc > 2){
            System.out.println("INVALID NUMBER");
        }




        if(cpu == npc ){
            System.out.println("Draw");

         }
         if(cpu == 0 && npc == 1){
            System.out.println(cpuR + " " + npcP+ " " + win);
         }

         if(cpu == 1 && npc == 2){
            System.out.println(cpuP + " " + npcS+ "  | " + win);
         }

         if(cpu == 2 && npc == 0){
            System.out.println(cpuS + " " + npcR+ " " + win);
         }
         
         if(npc == 0 && cpu == 1){
            System.out.println(npcR + " " + cpuP+ " " + lose);
         }

         if(npc == 1 && cpu == 2){
            System.out.println(npcP + " " + cpuS+ " " + lose);
         }

         if(npc == 2 && cpu == 0){
            System.out.println(npcS + " " + cpuR+ " " + lose);
         }

        }
    }
}
