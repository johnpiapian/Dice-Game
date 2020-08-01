package extracredit;

public class View {
    
    public void computerWins(int kind){
        System.out.println("Computer has won with "+ kind +" same kinds!");
    }
    
    public void playerWins(int kind){
        System.out.println("Player has won with "+ kind +" same kinds!");
    }
    
    public void tie(){
        System.out.println("It's a tie!");
    }
}
