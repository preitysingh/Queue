public class Queue <N> {
    private int size = 0;
    private QueueNode<N> head = null; //object that is getting popped out next
    private QueueNode<N> tail= null; //object that just got put in
    public Queue(){ } //empty constructor
    
//    public void enqueue(N element)  {
//        QueueNode<N> node = new QueueNode<N>(element);
//      if(tail != null){
//          tail.setChild = node;
//      }
//      tail = node;
//      if(head == null){head = node;}
//      size++;
//    }  //add an element to queue-kinda main

//  public N dequeue()    {
//    N headData = head.getData;
//    head = head.getChild();
//    return headData;
//    }//remove and return the least recent element

    public boolean isEmpty() {return(head==null);} //at the first pop out position
    public int size() {return size;}
    public N peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getData();
        } //peek which node is next to pop out
    }
}
