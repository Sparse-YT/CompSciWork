class Cow {
                private int age;
                private double weight;
                private String name;
                private boolean gender;

                     public Cow()
                     {
                     age = 0;
                     weight = 72.5;
                     name = "Unkown";
                     gender = false;
                     
               }

               public Cow(int a, double w, String n, boolean g){
                     age = a;
                     weight = w;
                     name = n;
                     gender = g;
               } 
               
            public void haveBirthday(){
                age++;
                System.out.println("Cow is now " + age + " years old");
            }

            
               

              public void makeNoise()
              {

                  System.out.println("*" + name + "* " + "Moooow!"  );
                }               
                                

                                            
              public void display() {
                System.out.print("Name: " + name + ", age: " + age + ", weight: " + weight + ", boy: " + gender );


                        
                     
              }
            }

