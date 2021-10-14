package extracredit;

public class Controller {
    
    private final Model model;
    private final View view;
    
    public Controller(Model m, View v){
        this.model = m;
        this.view = v;
    }
    
    public void start(){
        int[] computer = model.getComputerResult();
        int[] player = model.getPlayerResult();
        
        view.displayResult();
        
        // Determine winner 1) by repeated times 2) if tie by value
        if(computer[0] > player[0]){ // compare by the no. of times repeatead
            view.computerWins();
        }else if(player[0] > computer[0]){
            view.playerWins();
        }else{ // compare by the value of the kind
            if(computer[1] > player[1]){ 
                view.playerWins();
            }else if(player[1] > computer[1]){
                view.computerWins();
            }else{
               view.tie(); 
            }
        }
        
        // Testing/debugging
        //System.out.println("Computer: " + computer[0] + ":" + computer[1]);
        //System.out.println("Player: " + player[0] + ":" + player[1]);
    }

}
