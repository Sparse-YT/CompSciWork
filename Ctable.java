public class Ctable {
    public static void main(String[] args) {
        String ft = "feet";
        String miles = "mile(s)";
        String km = "kilometer(s)";
        int ftI = 5280;
        int milesI = 1;
        int kmI = 1;
        double kmD = 1.609;
        int count = 1;


        System.out.println(ft + "  " + miles + "  " + km + " | " + km + "  " + miles + "  " + ft);
                for(int x = 1; x <= 100; x++)
                {
                    System.out.printf(((ftI * milesI)*count) + "  " + (milesI * count) + "        ");
                    System.out.printf("%.3f", ((kmD * milesI)*count));
                    System.out.print("  |        ");
                    System.out.print((kmI*count) + "            ");
                    System.out.printf("");
                    System.out.printf("%.3f", ((milesI*count) / 1.609));
                    System.out.print("    ");
                    System.out.printf("");
                    System.out.print((3281*count));

                    

                    System.out.println("");
                    count ++;




                }


        }


    }
