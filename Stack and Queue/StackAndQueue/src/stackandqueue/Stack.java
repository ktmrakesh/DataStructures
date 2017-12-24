/**
 * @author Rakesh
 * 
 * Stack implementation using LinkedList
 */
package stackandqueue;

import java.util.LinkedList;

public class Stack<E> {
    LinkedList<E> stack;
    
    public Stack(){
        stack = new LinkedList();
    }
    
    //push the element is tha stack
    public void push(E n){
        stack.addLast(n);
    }
    
    //pop the element from stack
    public E pop(){
        return stack.removeLast();
    }
    
    //check the elements to be popped
    public E peek(){
        return stack.getLast();
    }
    
    // checks whether the stack is empty or not 
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    //return the size of stack
    public int size(){
        return stack.size();
    }
    
    
}
