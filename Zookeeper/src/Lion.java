class Lion {
                private int age;
                private double weight;
                private String name;
                private boolean dead;

                     public Lion()
                     {
                     age = 0;
                     weight = 0.0;
                     name = "Unkown";
                     dead = false;
                     
               }

               public Lion(int a, double w, String n, boolean d){
                     age = a;
                     weight = w;
                     name = n;
                     dead = d;
               } 
            

               public void death(){
                     System.out.print("Here lies " + name + " ");                     
                     System.out.print("Age " + age + " ");
                     System.out.print("weight " + weight + " ");

                     dead = true;

                  if (dead = true){
                        System.out.println("Status: Dead");
                     }

               }

              public void roar()
              {
                     System.out.println("*" + name + "*" +" roar!, roar!");
                                 } // roar()
              
              public String giveName(Lion kyle){
                System.out.println("hey I'm "+ name);
                     return name;
              }

                                            
              public void list() {
                System.out.println("Name:" + name + ", age:" + age + ", weight: " + weight + " Dead: " + dead );

                            }
                        }