package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author Aravin Suganthan
 */
public class Resistor {

    public int resistorID = 0;
    public Node n1, n2;
    public double resistance;

    //Takes entire resistor string and splits values into resistance and nodes
    public Resistor(String command) {
        String[] splitter = command.split(" ", 0);
        n1 = new Node(Integer.parseInt(splitter[1]));
        n2 = new Node(Integer.parseInt(splitter[2]));
        resistance = Double.parseDouble(splitter[3]);
        if (resistance <= 0) {
            throw new IllegalArgumentException("Restance cannot be a negative or 0 value");
        }
        if (n1 == null || n2 == null) {
            throw new IllegalArgumentException("Node cannot be a null value");
        }
    }

    //String representation of 1 resistor
    @Override
    public String toString() {
        return ("R" + this.resistorID + " " + n1.toString() + " " + n2.toString() + " " + this.resistance);

    }

}
