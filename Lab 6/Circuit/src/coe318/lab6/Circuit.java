
package coe318.lab6;
import java.util.ArrayList;
/**
 *
 * @author Aravin
 */
public class Circuit {
    
    ArrayList<Resistor> resistors;
    private static Circuit instance =  null;
    
    public static Circuit getInstance(){
        if(instance == null){
        instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit(){
        this.resistors = new ArrayList<Resistor>();
    }
    
    public void add(Resistor r){
        this.resistors.add(r);
    }
    
    @Override
    public String toString(){
        String circuit = new String();
        
        for(int i=0; i<this.resistors.size(); i++){
            circuit += this.resistors.get(i).toString() + "\n";
        }
        return(circuit);
    }
}