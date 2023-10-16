public class TaskThreeConcatenateAString {
    public static void main(String[] args) {
        String name = "Gabriel Suarez"; 

        String a = name.substring(0,2) ;
        
        String b = name.substring(10,13);

        String c = name.substring(8, 9);

        String d = c.toLowerCase();


        
        System.out.println(a + d + " prices " + b + " too high!");
    }
}





