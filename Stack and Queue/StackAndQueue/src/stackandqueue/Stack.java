/**
 * @author Rakesh
 * 
 * Stack implementation using LinkedList
 */
package stackandqueue;

import java.util.LinkedList;

public class Stack {
    LinkedList stack;
    
    public Stack(){
        stack = new LinkedList();
    }
    
    //push the element is tha stack
    public <E> void push(E n){
        stack.addLast(n);
    }
    
    //pop the element from stack
    public <E> E pop(){
        return (E) stack.removeLast();
    }
    
    //check the elements to be popped
    public <E> E peek(){
        return (E) stack.getLast();
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
