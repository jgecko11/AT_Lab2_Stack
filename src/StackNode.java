/**
 * Jack Greco
 * StackNode.java
 * This is a generic datatype Stack class--it allows the user to only see and interact with the top element
 * 10-22-20
 * JMG
 * @param <E>
 */

public class StackNode<E>{

    private StackNode<E> next = new StackNode<>();
    private E element;

    StackNode(){}

    public void push(E element){
        next = new StackNode<E>();
        this.element = element;
        
    }

    public E pop(){
        if(next.isEmpty){
            System.out.println("Stack is Empty");
        }
        E top = element;
        element = next.element;
        next = next.next;

        return top;
    }

    public boolean isEmpty(){
        return element == null;
    }

}
