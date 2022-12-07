//preity's Queue Structure Class
//it works just like a song queue on Spotify!
public class Queue <N> {
    private int size = 0; //size instance variable
    private QueueNode<N> head = null; //object that is getting popped out next
    private QueueNode<N> tail= null; //object that just got put in
    public Queue(){ } //empty constructor

    //adds an element to the tail end of the queue
    public void enqueue(N element)  {
        QueueNode<N> node = new QueueNode<N>(element);
      if(tail != null){
          tail.setChild(node);
      }
      tail = node;
      if(head == null){head = node;}
      size++;
    }

    //removes and returns the least recent element
    public N dequeue()    {
    N headData = head.getData();
    head = head.getChild();
    size--;
    return headData;
    }

    //at the first pop out position
    public boolean isEmpty() {return(head==null);}

    //returns the size of the queue
    public int size() {return size;}

    /* peek method returns what is at the head of the queue/
    the object that would get popped out next*/
    public N peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getData();
        }
    }
}
