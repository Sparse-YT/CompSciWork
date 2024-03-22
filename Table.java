import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int row = keyboard.nextInt();
            int col = keyboard.nextInt();

            int[][] multTable = new int[row + 1][col + 1];

            for(int i = 0; i < multTable.length  ; i++){
                multTable[0][i] = i;
                for(int j = 0; j < multTable[i].length  ; j++){
                    multTable[i][0] = i;
                    multTable[i][j] = i * j;

                }
            }
    
            String k = "";

            for(int i = 0; i < multTable.length; i++){
                System.out.println();
                for(int j = 0; j < multTable[i].length; j ++){
                    k = (" " + (multTable[i][j]) );
                    System.out.print(k); 
                } 
                
        }

        }
    }
}