package extracredit;

public class Score {
    private int[] score;
    
    public Score(){
        this(5);
    }
    
    public Score(int arrlen){
        setScore(new int[arrlen]);
    }

    // Getters & Setters
    public int getArrLength(){
        return getScore().length;
    }
    
    public int[] getScore() {
        return score;
    }

    private void setScore(int[] score) {
        this.score = score;
    }
    
    public void setScoreByIndex(int index, int value){
        if(index > -1 && index < getScore().length)
            this.score[index] = value;
        else
            throw new IllegalArgumentException("Check your index size!");
    }
    
    
}
