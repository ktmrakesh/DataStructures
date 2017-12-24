/**
 *
 * @author Rakesh Kumar Shah
 * Queue implementation of queue using linkedlist
 */
package stackandqueue;

import java.util.LinkedList;

public class Queue<D> {
    LinkedList<D> queue;
    
    //Constructor Initilize queue
    public Queue(){
        queue = new LinkedList();
    }
    
    //Add elements in the queue
    public void enqueue(D n){
        queue.addLast(n);
    }
    
    //remove the first elements from the queue
    public  D dequeue(){
        return  queue.remove(0);
    }
    
    // see the first elements in the queue 
    public D peek(){
        return queue.get(0);
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
