package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author Aravin Suganthan
 */
public interface Runorder {  
    
    //Prints start message and runs program
    public void start();
    
    //Allows user to input values
    public void run();
    
    //Prints input values
    public void display();
    
    // //Separates Voltage and Resistor values and values are processed through spice class
    public void split(ArrayList<String> comp);
    
    //All Done is printed after the end of the program
    public void end(); 
}