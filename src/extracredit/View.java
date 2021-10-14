package extracredit;

public class View {
    
    private final Model m;
    
    public View(Model m){
        this.m = m;
    }
    
    public void displayResult(){
        System.out.printf("Player: %s:%s\n", m.getPlayerResult()[0], m.getPlayerResult()[1]);
        System.out.printf("Computer: %s:%s\n", m.getComputerResult()[0], m.getComputerResult()[1]);
    }
    
    private void announceWinner(String name, int[] res){
        System.out.println(String.format("%s wins with x%s of a kind[%s]!", name, res[0], res[1]));
    }
    
    public void computerWins(){
        announceWinner("Computer", m.getComputerResult());
    }
    
    public void playerWins(){
        announceWinner("Player", m.getPlayerResult());
    }
    
    public void tie(){
        System.out.println("It's a tie!");
    }
}
