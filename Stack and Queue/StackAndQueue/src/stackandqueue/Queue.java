/**
 *
 * @author Rakesh Kumar Shah
 * Queue implementation of queue using linkedlist
 */
package stackandqueue;

import java.util.LinkedList;

public class Queue {
    LinkedList queue;
    
    //Constructor Initilize queue
    public Queue(){
        queue = new LinkedList();
    }
    
    //Add elements in the queue
    public void enqueue(int n){
        queue.addLast(n);
    }
    
    //remove the first elements from the queue
    public int dequeue(){
        return (int) queue.remove(0);
    }
    
    // see the first elements in the queue 
    public int peek(){
        return (int) queue.get(0);
    }
    
    //check if the queue is empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    //check the size of the queue
    public int size(){
        return queue.size();
    }
}
