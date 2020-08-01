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
        
        if(computer[1] > player[1]){
            view.computerWins(computer[1]);
        }else if(computer[1] < player[1]){
            view.playerWins(player[1]);
        }else{
            view.tie();
        }
        
        //System.out.println(Arrays.toString(model.getComputerScore()));
        //System.out.println(Arrays.toString(model.getPlayerScore()));
        
        
        //System.out.println(Arrays.toString(computer));
        //System.out.println(Arrays.toString(player));
        
    }

}
