package extracredit;

public class Score {
    private int arrayLength;
    private int[] score;
    
    public Score(){
        this(5);
    }
    
    public Score(int arrlen){
        setArrayLength(arrlen);
        setScore(new int[getArrayLength()]);
    }

    // Getters & Setters
    public int getArrayLength() {
        return arrayLength;
    }

    private void setArrayLength(int arrayLength) {
        this.arrayLength = arrayLength;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }
    
    public void setScoreByIndex(int index, int value){
        this.score[index] = value;
    }
    
    
}
