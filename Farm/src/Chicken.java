class Chicken {
                private int eggsInADay;
                private double weight;
                private String breed;
                private boolean mean;

                     public Chicken()
                     {
                     eggsInADay = 1;
                     weight = 7.5;
                     breed = "Australorp";
                     mean = false;
                     
               }

               public Chicken(int e, double w, String b, boolean m){
                     eggsInADay = e;
                     weight = w;
                     breed = b;
                     mean = m;
               } 
            


               

              public void makeNoise()
              {

                  System.out.println("*" + breed + "* " + "Bawk!"  );
            
                                 
                                }
              
              public void eatFood(){
                weight ++;
                System.out.println("The " + breed + " has eaten and is now " + weight + "lbs");
              }
              

                                            
              public void display() {
                System.out.println("Breed: " + breed + ", egg in a day: " + eggsInADay + ", weight: " + weight + "lbs" + " mean: " + mean );

                
                            }
                        }