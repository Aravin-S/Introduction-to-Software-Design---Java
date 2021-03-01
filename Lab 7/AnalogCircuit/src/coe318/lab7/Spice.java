package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author Aravin Suganthan
 */
public class Spice {

    private ArrayList<Resistor> r = new ArrayList<Resistor>();
    private ArrayList<Voltage> v = new ArrayList<Voltage>();
    private ArrayList<String> o = new ArrayList<String>();

    //Instantiates array of resistors, voltages and order
    public Spice(ArrayList<Resistor> r, ArrayList<Voltage> v, ArrayList<String> o) {
        this.r = r;
        this.v = v;
        this.o = o;
    }

    //Creates a string in the same order as input and outputs the resistors and voltages in order
    @Override
    public String toString() {
        int rin = 0;
        int vin = 0;
        String output = "";
        for (int i = 0; i < o.size(); i++) {
            if (o.get(i).equals("r")) {
                r.get(rin).resistorID = rin + 1;
                output += r.get(rin).toString() + "\n";
                rin++;
            } else if (o.get(i).equals("v")) {
                v.get(vin).voltID = vin + 1;
                output += v.get(vin).toString() + "\n";
                vin++;
            }
        }
        return (output);

    }

}