package coe318.lab7;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Aravin Suganthan
 */
public class UserMain implements Runorder{

    public static void main(String[] args) {
        UserMain st = new UserMain();
        st.start();
    }

    //Separates Voltage and Resistor values and values are processed through spice class
    @Override
    
    public void split(ArrayList<String> comp) {
        
    ArrayList<Resistor> resistors = new ArrayList<Resistor>();
    
    ArrayList<Voltage> voltages = new ArrayList<Voltage>();
    
    ArrayList<String> order = new ArrayList<String>();

      for (int i = 0; i < comp.size(); i++) {
            if (comp.get(i).startsWith("r")) {
            resistors.add(new Resistor(comp.get(i)));
            order.add("r");
            } else if (comp.get(i).startsWith("v")) {
            voltages.add(new Voltage(comp.get(i)));
            order.add("v");
            }
        }
        Spice currentspice = new Spice(resistors, voltages, order);
        System.out.print(currentspice.toString());
    }

    //All Done is printed after the end of the program
    @Override
    public void end() {
        System.out.println("All Done");
    }

    //Prints start message and runs program
    @Override
    public void start() {
       display();
       run();
    }

    //Analysis of input given by user
    @Override
    public void run() {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> descriptions = new ArrayList<String>();

      while (true) {
          
            String temp = input.nextLine().toLowerCase();
            
            String[] splitter = temp.split(" ", 0);
            if (temp.equals("end")) {
                end();
                break;
            } else if (temp.equals("spice")) {
                split(descriptions);
            } else if ((splitter.length != 4) || (!splitter[0].equals("r") && !splitter[0].equals("v")) || (!splitter[1].matches("-?\\d+(\\.\\d+)?")) || !splitter[2].matches("-?\\d+(\\.\\d+)?") || (!splitter[3].matches("-?\\d+(\\.\\d+)?"))) {
                System.out.println("Invalid input!");
            } else if (!temp.equals("spice")) {
                descriptions.add(temp);
            }

        }
    }

    //Display message
    @Override
    public void display() {
        System.out.println("Describe the circuit: ");
    }

}