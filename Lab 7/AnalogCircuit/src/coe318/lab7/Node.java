package coe318.lab7;

/**
 *
 * @author Aravin Suganthan
 */
public class Node {

    public int id;

    //Creates node and sets up ID
    public Node(int n) {
        this.id = n;
    }

    //Representation of Node ID as a string
    @Override
    public String toString() {
        return ("" + this.id);
    }

}
