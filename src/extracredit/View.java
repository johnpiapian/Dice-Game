/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit;

/**
 *
 * @author student
 */
public class View {
    
    public void computerWins(int kind){
        System.out.println("Computer has won with "+ kind +" same kinds!");
    }
    
    public void playerWins(int kind){
        System.out.println("Player has won with "+ kind +" same kinds!");
    }
    
    public void tie(){
        System.out.println("It's a tie!");
    }
}
