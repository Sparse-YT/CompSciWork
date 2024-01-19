import java.util.Scanner;

public class Arrays{

    public static void main(String[] args){
        int[] newARR = new int[5]; // Syntax
        String[] newSARR = new String[5]; // can't add values past the ["Value"] 
        double[] newDARR = new double[5]; // Ex. can have 5 seprate values but not a 6th one 
        // Values are set to null if they aren't atribuetid to any thing

        // how to add values/ index values // allocating valus/indexs
        //{"hello", "hi", "who", "why", "what"}
        // pos 1 | pos 2 | pos 3 | pos 4 | pos 5
        // pos 1 == value/index of 0
        //
        newSARR[0] = "hello";
        newSARR[1] = "he";
        newSARR[2] = "hel";
        newSARR[3] = "hell";
       // newSARR[4] = "hello2" // remove // to see what changes

        String x = newSARR[0];
        String y = newSARR[4];
        System.out.println(x); // you get hello
        System.out.println(y); // you get null

        // second way to add to an array if you're just adding a bunch of numbers
        int[] nums = {0,1,2,3,4,5};
        int xI = nums[0];
        System.out.println(xI); // you get 0

        double[] nums2 = {3.0, 2.0, 1.0, 0.0};
        double yD = nums2[2];
        System.out.println(yD); // you get 1.0

        // for loop to cycle through an array

        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]); // you cycles and prints through nums
        }


    }
}