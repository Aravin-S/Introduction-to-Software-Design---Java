
package coe318.lab6;

/**
 *
 * @author Aravin
 */
public class Resistor {
    
    public double resistance;
    public Node node1, node2;
    public int resId;
    private static int res_count = 1;
   
    public Resistor(double resistance, Node node1, Node node2){
        
        if(resistance < 0){
            throw new IllegalArgumentException("Cannot have negative resistance");}
        
        if(node1 == null || node2 == null){
            throw new IllegalArgumentException("Both connecting nodes must exist");}
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resId = res_count; 
        res_count++; 
    }
    
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    @Override
    public String toString(){
        return("R"+resId + " " + node1 + " " + node2 + " " + resistance);
    }
    
}
