public class Tester {
    //preity singh's test driver
    public static void main(String[] args){
        Queue<Integer> queue = new Queue<>(); //creates a new Queue object
        System.out.println("(true): " + queue.isEmpty()); //checking isEmpty method

        queue.enqueue(3); //adding first element using enqueue
        System.out.println("(false): " + queue.isEmpty()); //testing isEmpty method
        queue.enqueue(24); //adding a second element
        System.out.println("(2): " + queue.size()); //testing size method

        System.out.println("taking out 3: " + queue.dequeue()); //testing dequeue method
        System.out.println("first one put in was 24: " + queue.peek()); //testing peek method
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty() + ", " + queue.size());
    }
}
