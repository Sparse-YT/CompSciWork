public class State{
    private String name;
    private String abiv; 
    private int pop;     
    private int rank; 
    State(String name,String abiv, int pop, int rank){
        this.name = name;
        this.abiv = abiv;
        this.pop = pop;
        this.rank = rank;
    }
    public String getAbiv() {
        return abiv;
    }

    public String getName() {
        return name;
    }
    public int getPop() {
        return pop;
    }
    public int getRank() {
        return rank;
    }
}
