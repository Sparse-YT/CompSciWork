


public class Farm{
    
                            public static void main (String [] args) {
                    

                                

                             Cow cow = new Cow (2, 200.2, "betty", false);
                                 cow.display();
                                 cow.haveBirthday();
                                 cow.makeNoise();
                                 System.out.println();
                             Chicken chicken = new Chicken( 1, 70.5,"Silkie", true);
                                chicken.makeNoise(); 
                                chicken.display();
                                chicken.eatFood();
                                 System.out.println();
                             Pig pig = new Pig( 3, 800.4, "pink", false );
                                pig.upgradePenSize(200);
                                   pig.display();
                                   pig.makeNoise();

                                 
                                    



                            } 
                        }