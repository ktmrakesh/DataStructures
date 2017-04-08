
package stackandqueue;

/**
 *
 * @author Rakesh 
 * Stack and Queue implementation using Linkedlist.
 * Stack LIFO
 * Queue FIFO
 */

public class StackAndQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack Size: "+stack.size());
        System.out.println("Is Stack empty? : "+stack.isEmpty());
        System.out.println("Poped Element: "+stack.pop());
        System.out.println("Popped Element: "+stack.pop());
        Queue queue = new Queue();
        queue.enqueue(1); //inserts 1 in the queue
        queue.enqueue(2);  // inserts 2 
        queue.enqueue(3); // inserts 3
        System.out.println("Dequeued Element: "+queue.dequeue());  // dequeue 1
        System.out.println("Dequeue Elemetn: "+queue.dequeue());  //dequeue 2 
        System.out.println("Elemented to be Dequeued: "+queue.peek());     // returns the size of 
        System.out.println("Size of queue: "+queue.size());   //return the size of queue
        System.out.println("Is queue empty?: "+queue.isEmpty()); // check if the list is empty*/
    }
    
}
