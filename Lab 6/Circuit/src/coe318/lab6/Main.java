package coe318.lab6;

/**
 *
 * @author Aravin
 */
public class Main {
    
    
        public static void main(String[] args) {
        
        Circuit circuit = Circuit.getInstance();
        
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        Resistor r1 = new Resistor(60, a, b);
        Resistor r2 = new Resistor(48.0, b, c);
        
        System.out.println("Therefore, the circuit is:");
        
        circuit.add(r1);
        circuit.add(r2);
        System.out.println(circuit.toString());
    }
    
}
