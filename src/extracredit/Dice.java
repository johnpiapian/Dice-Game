package extracredit;

public class Dice {
    
    private int value;
    
    public Dice(){
        setValue(0);
    }
    
    public int getValue(){
        return this.value;
    }
    
    private void setValue(int v){
        this.value = v;
    }
    
    public Dice roll(){
        setValue(getRandom(1, 6));
        
        return this;
    }
    
    private int getRandom(int min, int max){
        return (int)(Math.random() * (max + 1 - min)) + min;
    }
}
