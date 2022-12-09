public class Tester {
    //preity singh's test driver
    public static void main(String[] args){
        //testing Queue Class
        Queue<Integer> queue = new Queue<>(); //creates a new Queue object
        System.out.println("(true): " + queue.isEmpty()); //checking isEmpty method

        queue.enqueue(3); //adding first element using enqueue
        System.out.println("(false): " + queue.isEmpty()); //testing isEmpty method
        queue.enqueue(24); //adding a second element
        queue.enqueue(18);
        queue.enqueue(9);
        System.out.println("(4): " + queue.size()); //testing size method

        System.out.println("taking out 3: " + queue.dequeue()); //testing dequeue method
        System.out.println("first one put in was 24: " + queue.peek()); //testing peek method
        System.out.println("taking out 24: "+ queue.dequeue());
        System.out.println("taking out 18: "+queue.dequeue());
        System.out.println("taking out 9: "+queue.dequeue());
        System.out.println(queue.isEmpty() + ", " + queue.size());

        //testing QueueNode class
        QueueNode<Integer> q2 = new QueueNode<>();
        q2.setData(2);
        System.out.println(q2.getData());
        //System.out.println(q2.getChild());
        System.out.println(q2.toString());

    }
}
