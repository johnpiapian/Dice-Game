package extracredit;

/**
 *
 * @author student
 */
public class Model {
    
    private int score = 0, arrayLength = 5;
    private int[] computerScore = new int[arrayLength];
    private int[] playerScore = new int[arrayLength];
    
    public int getRandom(int min, int max){
        return (int)(Math.random() * (max + 1 - min)) + min;
    }
    
    public int rollDice(){
        return getRandom(1, 6);
    }
    
    public void generateThrows(){
        for(int i=0; i < this.getArrayLength(); i++){
            computerScore[i] = this.rollDice();
            playerScore[i] = this.rollDice();
        }
    }
    
    public int[] getMostCommontKind(int[] array){
       int[] compare = new int[7]; 
       int largest[] = {0,0};
       
       for(int i=0; i < array.length; i++){
           compare[array[i]] += 1;
       }
       
       //getting the most common kind from the array to return
       for(int i=0; i < compare.length; i++){
           if(largest[1] < compare[i]){//if largest < current value
               largest[0] = i;
               largest[1] = compare[i];
           }
       }
       return largest;
    }
    
    //setter and getter
    public int getScore() {
        return score;
    }    
    
    public void setScore(int score) {
        this.score = score;
    }

    public int getArrayLength() {
        return arrayLength;
    }

    public void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int[] getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int[] computerScore) {
        this.computerScore = computerScore;
    }

    public int[] getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int[] playerScore) {
        this.playerScore = playerScore;
    }
    
    
}
