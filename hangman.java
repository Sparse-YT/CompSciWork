import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int gleft = 6;
            int index = 0;
            int rng = (int)((Math.random()*9));
            String w1 = "HOME";
            String w2 = "BANK";
            String w3 = "BLUE";
            String w4 = "BONE";
            String w5 = "BEND";
            String w6 = "SEND";
            String w7 = "SACK";
            String w8 = "GREY";
            String w9 = "WALK";
            String lg = "";
            String gls = "";
            String word = "****"; // make multiple "words" for the words becuase it will fuck up ash 
            String wordrng = "";
            String chara = "";
            String enter = "";

            if(rng == 1){
                wordrng = w1;
            }else if (rng == 2){
                wordrng = w2;
            }else if (rng == 3){
                wordrng = w3;
            }else if (rng == 4){
                wordrng = w4;
            }else if (rng == 5){
                wordrng = w5;
            }else if (rng == 6){
                wordrng = w6;
            }else if (rng == 7){
                wordrng = w7;
            }else if (rng == 8){
                wordrng = w8;
            }else if (rng == 9){
                wordrng = w9;
            }
           


            String start = "";
            System.out.println("Press enter to start.");
            start = keyboard.nextLine();
            if (start.equals("")){
                while(enter == ""){
            System.out.println("enter your guess *one letter at a time");
            chara = keyboard.nextLine();
                
                if(chara.equals(chara.toLowerCase())){
                chara = chara.toUpperCase();
                }
                //wordrng = "FOOD"; //test
                index = wordrng.indexOf(chara);
                if (index == -1 ){
                    lg = lg + chara;
                    gleft--;
                    System.out.println("Wrong you have "+ (gleft) +" guess(s) left");
                    System.out.println(word);
                    System.out.println("You have already guessed " + lg);

                }else{
                    lg = lg + chara;
                    word = word.substring(0,index) + chara + word.substring(index + 1);
                    System.out.println("Your guess was correct!");
                    System.out.println("You have already guessed " + lg);
                    System.out.println("RIGHT!!!");
                    System.out.println(word); 
                }
                if(gleft == 0){
                    enter = "enter";
                }
                if(word.equals(wordrng)){
                    System.out.println("YAY you won have a cookie"); // put cookie script
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠚⣉⡙⠲⠦⠤⠤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⢀⣴⠛⠉⠉⠀⣾⣷⣿⡆⠀⠀⠀⠐⠛⠿⢟⡲⢦⡀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⣠⢞⣭⠎⠀⠀⠀⠀⠘⠛⠛⠀⠀⢀⡀⠀⠀⠀⠀⠈⠓⠿⣄⠀⠀⠀");
                    System.out.println("⠀⠀⠀⡜⣱⠋⠀⠀⣠⣤⢄⠀⠀⠀⠀⠀⠀⣿⡟⣆⠀⠀⠀⠀⠀⠀⠻⢷⡄⠀");
                    System.out.println("⠀⢀⣜⠜⠁⠀⠀⠀⢿⣿⣷⣵⠀⠀⠀⠀⠀⠿⠿⠿⠀⠀⣴⣶⣦⡀⠀⠰⣹⡆");
                    System.out.println("⢀⡞⠆⠀⣀⡀⠀⠀⠘⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣶⠇⠀⢠⢻⡇");
                    System.out.println("⢸⠃⠘⣾⣏⡇⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⣠⣤⣤⡉⠁⠀⠀⠈⠫⣧");
                    System.out.println("⡸⡄⠀⠘⠟⠀⠀⠀⠀⠀⠀⣰⣿⣟⢧⠀⠀⠀⠀⠰⡿⣿⣿⢿⠀⠀⣰⣷⢡⢸");
                    System.out.println("⣿⡇⠀⠀⠀⣰⣿⡻⡆⠀⠀⠻⣿⣿⣟⠀⠀⠀⠀⠀⠉⠉⠉⠀⠀⠘⢿⡿⣸⡞");
                    System.out.println("⠹⣽⣤⣤⣤⣹⣿⡿⠇⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⣽⠀");
                    System.out.println("⠀⠙⢻⡙⠟⣹⠟⢷⣶⣄⢀⣴⣶⣄⠀⠀⠀⠀⠀⢀⣤⡦⣄⠀⠀⢠⣾⢸⠏⠀");
                    System.out.println("⠀⠀⠘⠀⠀⠀⠀⠀⠈⢷⢼⣿⡿⡽⠀⠀⠀⠀⠀⠸⣿⣿⣾⠀⣼⡿⣣⠟⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⣆⠑⠋⠀⢀⣀⠀⠀⠀⠀⠈⠈⢁⣴⢫⡿⠁⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⣧⣄⡄⠴⣿⣶⣿⢀⣤⠶⣞⣋⣩⣵⠏⠀⠀⠀⠀⠀");
                    System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢺⣿⢯⣭⣭⣯⣯⣥⡵⠿⠟⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀");
                    enter = "enter";
                    gleft = -1;
                }

                if(gleft == 5){
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("----------");
                }else if(gleft == 4){
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("----------");
                    System.out.println("    |");
                    System.out.println("    |");
                    System.out.println("    |");
                    System.out.println("    |");
                }else if(gleft == 3){
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("----------");
                    System.out.println("    |");
                    System.out.println("----|");
                    System.out.println("    |");
                    System.out.println("    |");
                }else if(gleft == 2){
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("----------");
                    System.out.println("    |");
                    System.out.println("----|----");
                    System.out.println("    |");
                    System.out.println("    |");
                }else if(gleft == 1){
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("----------");
                    System.out.println("    |");
                    System.out.println("----|----");
                    System.out.println("    |");
                    System.out.println("____|");
                }else if(gleft == 0){
                    System.out.println("----------");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("|        |");
                    System.out.println("----------");
                    System.out.println("    |");
                    System.out.println("----|----");
                    System.out.println("    |");
                    System.out.println("____|____");
                }else if(gleft < 0){
                    
                }

                if(gleft == 0){
                    System.out.println("You lose :(");
                    System.out.println("Your word was " + wordrng);
                }
            
            }

                //System.out.println(rng);
                //System.out.println("Crash");
            }else{
                enter = "enter";
                //System.out.println("Mode");
            }

            



            }
            }
        }
    