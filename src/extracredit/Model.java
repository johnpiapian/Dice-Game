package extracredit;

public class Model {
    private int length = 5;
    private final Score computer = new Score(length);
    private final Score player = new Score(length);
    private final Dice dice = new Dice();
    
    public Model(){
        generateThrows();
    }
    
    // setters and getters
    public int getLength(){
        return this.length;
    }
    
    public Score getPlayer(){
        return this.player;
    }
    
    public Score getComputer(){
        return this.computer;
    }
    
    public int[] getComputerResult(){
        return getMostCommontKind(computer.getScore());
    }
    
    public int[] getPlayerResult(){
        return getMostCommontKind(player.getScore());
    }
    
    private void generateThrows(){
        for(int i=0; i < getLength(); i++){
            computer.setScoreByIndex(i, dice.roll().getValue());
            player.setScoreByIndex(i, dice.roll().getValue());
        }
    }
    
    private int[] getMostCommontKind(int[] scores){
        int[] compare = new int[7];
        int countOfAkind = 0, valueOfTheKind = 0; // times repeated, value of the number
        
        // store the number of times each number(on the dice, 1-6) is repeated in compare[]
        // e.g if 1 & 3 are repeated 2 times -> [0,2,0,2,0,0,0]
        for(int i=0; i<scores.length; i++){
            compare[scores[i]] += 1;
        }
        
        // finding the times repeated and the value of the number
        for(int i=0; i<compare.length; i++) {
            if(compare[i] >= countOfAkind && valueOfTheKind < i){
                countOfAkind = compare[i];
                valueOfTheKind = i;
            }
        }
        
        return new int[]{countOfAkind,valueOfTheKind};
    }
}
