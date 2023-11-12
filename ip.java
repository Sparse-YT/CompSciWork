import java.util.Scanner;

public class ip {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.println("Enter the fisrt octet | ");
            int o1 = keyboard.nextInt();
            System.out.println("Enter the second octet | ");
            int o2 = keyboard.nextInt();
            System.out.println("Enter the third octet | ");
            int o3 = keyboard.nextInt();
            System.out.println("Enter the fourth octet | ");
            int o4 = keyboard.nextInt();

           if ((o1 >= 0 && o1 <= 255) && (o2 >= 0 && o2 <= 255) && (o3 >= 0 && o3 <= 255) && (o4 >= 0 && o4 <= 255) ){
            System.out.println("IP Address: " + o1 + "." + o2 + "." + o3 + "." + o4);
           }
           if (!(o1 >= 0 && o1 <= 255)){
            System.out.println("Octet 1 is incorrect.");
           }
            if (!(o2 >= 0 && o2 <= 255)){
            System.out.println("Octet 2 is incorrect.");
           }
           if (!(o3 >= 0 && o3 <= 255)){
            System.out.println("Octet 3 is incorrect.");
           }
           if (!(o4 >= 0 && o4 <= 255)){
            System.out.println("Octet 4 is incorrect.");
           }

          

        }
    }
}
