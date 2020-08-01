package extracredit;

public class Controller {
    
    private final Model model;
    private final View view;
    
    public Controller(Model m, View v){
        this.model = m;
        this.view = v;
    }
    
    public void start(){
        model.generateThrows();
        
        int[] computer = model.getMostCommontKind(model.getComputerScore());
        int[] player = model.getMostCommontKind(model.getPlayerScore());
        
        
        // Determine winner 1) by repeated times 2) if tie by value
        if(computer[0] > player[0]){ // by no of times repeatead
            view.computerWins(computer);
        }else if(player[0] > computer[0]){
            view.playerWins(player);
        }else{
            if(computer[1] > player[1]){ // by value of the kind
                view.computerWins(computer);
            }else if(player[1] > computer[1]){
                view.playerWins(player);
            }else{
               view.tie(); 
            }
        }
        
        // Important for debugging
        //System.out.println("Computer: " + computer[0] + ":" + computer[1]);
        //System.out.println("Player: " + player[0] + ":" + player[1]);
    }

}
