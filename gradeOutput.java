import java.util.Scanner;

public class gradeOutput {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.println("Enter in your grade as an integer| ");
            int grade = keyboard.nextInt();





            
        if(grade == 100 || grade >= 98){
            System.out.println("A+ ");

         }
         if(grade >= 93 && grade <= 97){
            System.out.println("A");
         }

         if (grade <= 92 && grade >= 90){
            System.out.print("A-");
         }

         if (grade <= 89 && grade >= 88){
            System.out.println("B+ ");

         }
         if(grade >= 83 && grade <= 87){
            System.out.println("B");
         }

         if (grade <= 82 && grade >= 80){
            System.out.print("B-");
         } 
         if (grade <= 79 && grade >= 78){
            System.out.println("C+ ");

         }
         if (grade <= 77 && grade >= 73){
            System.out.println("C");
         }

         if (grade <= 72 && grade >= 70){
            System.out.print("C-");
         }
         if (grade <= 69 && grade >= 68){
            System.out.println("D+ ");

         }
         if (grade <= 67 && grade >= 63){
            System.out.println("D");
         }

         if (grade <= 62 && grade >= 60){
            System.out.print("D-");
         }
         if (grade <= 59 && grade >= 0){
            System.out.println("F ");
        }
}
}
}