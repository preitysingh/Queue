//preity's node class
public class QueueNode<N> {
    //parent,child,data instance variables
    private QueueNode parent;
    private QueueNode child;
    private N data;


    public QueueNode() { } //empty constructor

    public QueueNode (N data){
        this.data = data; //constructor w/ 1 parameter
    }

    public QueueNode(QueueNode<N> parent, QueueNode<N> child, N data){
        //constructor w/ 3 parameters
        this.parent = parent; //...for Node parent
        this.child = child;  //...for Node child
        this.data = data;  //...for data
    }

    //mutator/setter methods
    public void setParent(QueueNode<N> parent){
        this.parent = parent; //reads in parent variable
    }

    public void setChild(QueueNode<N> child) {
        this.child = child; //reads in child variable
    }

    public void setData(N data) {
        this.data = data; //reads in data variable
    }

    //accessor methods
    public QueueNode<N> getParent() {
        return parent; //returns parent node
    }

    public QueueNode<N> getChild() {
        return child; //returns child node
    }

    public N getData() {
        return data; //returns data
    }

    //toString method
    @Override
    //toString method for the Node class
    public String toString() {

        String str = "Node: " + data;
        return str;
    }
    //.equals method

    //checks to see if one node is equal to the other
    //returns true if equal, false otherwise
    public boolean equals(QueueNode n1) {return(data == n1.getData());}
}
