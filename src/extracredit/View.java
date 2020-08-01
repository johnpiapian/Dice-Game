package extracredit;

public class View {
    
    public void computerWins(int[] res){
        String result = String.format("Computer wins with %s of a kind(%s)!", res[0], res[1]);
        System.out.println(result);
    }
    
    public void playerWins(int[] res){
        String result = String.format("Player wins with %s of a kind(%s)!", res[0], res[1]);
        System.out.println(result);
    }
    
    public void tie(){
        System.out.println("It's a tie!");
    }
}
