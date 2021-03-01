package coe318.lab7;

/**
 *
 * @author Aravin Suganthan
 */
public class Voltage {

    public static int voltID = 0;
    public Node n1, n2;
    public double voltage;

   //Takes entire voltage string and splits values into voltage and nodes
    public Voltage(String command) {
        String[] splitter = command.split(" ", 0);
        n1 = new Node(Integer.parseInt(splitter[1]));
        
        n2 = new Node(Integer.parseInt(splitter[2]));
        
        voltage = Double.parseDouble(splitter[3]);
        
        if (voltage < 0) {
            
            Node temp = n1;
            n1 = n2;
            n2 = temp;
            
            voltage *= -1;
        }
        if (n1 == null || n2 == null) {
            throw new IllegalArgumentException("Node cannot be a null value");
        }

    }
    //String representation of 1 resistor
    @Override
    public String toString() {
        return ("V" + this.voltID + " " + n1.toString() + " " + n2.toString() + " DC " + this.voltage);

    }
}