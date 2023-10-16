class Pig {
                private int penSize;
                private double weight;
                private String color;
                private boolean muddy;

                     public Pig()
                     {
                     penSize = 10;
                     weight = 500.0;
                     color = "Unkown";
                     muddy = false;
                     
               }

               public Pig(int a, double w, String c, boolean g){
                     penSize = a;
                     weight = w;
                     color = c;
                     muddy = g;
               } 
            
               public void upgradePenSize(int penSize){
                 System.out.println("The pen has increesed in size to doubled in size from " + penSize + " it is now " + penSize * 2);
               }

              public void makeNoise()
              {

                   System.out.println("Onik!" );
                                
                                 } 
              

                                            
              public void display() {
                System.out.println("Color: " + color + ", pen size: " + penSize + ", weight: " + weight + " muddy: " + muddy );

                
                            }
                        }