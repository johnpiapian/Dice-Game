package extracredit;

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
            System.out.println(computerScore[i]+":"+playerScore[i]);
        }
    }
    
    public int[] getMostCommontKind(int[] score){
        int[] compare = new int[7];
        
        // store the number of times each number(on the dice, 1-6) is repeated in compare[]
        // e.g if 1 & 3 are repeated 2 times -> [0,2,0,2,0,0,0]
        for(int i=0; i<score.length; i++){
            compare[score[i]] += 1;
        }
        
        //System.out.println(Arrays.toString(compare));
        
        int countOfAkind = 0; //times repeated
        int valueOfTheKind = 0; //value of the number
        
        // finding the times repeated and the value of the number
        for(int i=0; i<compare.length; i++) {
            if(compare[i] >= countOfAkind && valueOfTheKind < i){
                countOfAkind = compare[i];
                valueOfTheKind = i;
            }
        }
        
        return new int[]{ countOfAkind, valueOfTheKind};
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
