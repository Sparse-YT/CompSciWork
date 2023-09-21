public class PotatoHead {
    private Stirng name;
    private String backStory;                       // making object base
    private String job;

    public PotatoHead() {
        name = "N/A";
        backStory = "N/A";           // Default varibale when not defined later
        job = "N/A";
    }

    public PotatoHead(String n, String b, String j) {                 // making variables
        name = n;
        backStory = b;                                           // Decalring said variables
        job = j;                        
    }

    public void speak(){     // making What the object can do
        System.out.print("The storm that wipes out the pathetic little thing you call your life. You're frickin dead, kid. I can be anywhere, anytime, and I can kill ");
    }

    public void tellBackStory(){
        System.out.print("What the heck did you just frickin’ say about me, you little whiner? I’ll have you know I graduated top of my class in the Navy Seals, and I’ve been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. ");
    }

    public void work(){
        System.out.print("*Goes to work at a cvs*");
    }

    PotatoHead bond = new PotatoHead("bond", "navy seal", "CVS Janitor");


    
}