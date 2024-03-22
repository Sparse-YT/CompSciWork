public class test {
    public static void main(String[] args) {
        double rng = ((Math.random() * 4));
        while(rng != 4){
System.out.println(rng);
        }
        if(rng == 4){
            System.out.println(rng);
        }
    }

}

if(rng == rngCount) {
    while(rng == rngCount){
      rng = (int)((Math.random() * 4));
    }  
  }rng = (int)((Math.random() * 4));
  //System.out.println(rng);
//q2
  count2 = 4;
  rng = (int)((Math.random() * count2 ));
  System.out.println("The answers are case sensitive!");
  System.out.println(q2);
  for(int i = 0; i < 4; i ++ ){
      System.out.println(answers2.get(rng));
      answers2.remove(rng);
      //System.out.println(rng);
      count2 --;
      rng = (int)((Math.random() * count2 ));
       

  }

  //q1

  for(int i = 0; i < 4; i ++ ){
    System.out.println(answers1.get(rng));
    answers1.remove(rng);
    //System.out.println(rng);
    count2 --;
    rng = (int)((Math.random() * count2 ));
     

}

