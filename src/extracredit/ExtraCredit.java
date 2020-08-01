package extracredit;

/**
 *
 * @author student
 */
public class ExtraCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model m = new Model();
        View v = new View();
        Controller c = new Controller( m, v);
        c.start();
    }
    
}
