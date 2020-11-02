public class Stack<E> {

    private Stack<E> next = new Stack<>();
    private E element;

    Stack(){}

    public void push(E element){
        next = new Stack<E>();
        this.element = element;

    }

    public E pop(){
        if(next.isEmpty()){
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

    public E peek(){
        return element;
    }

    public int size(){
        return this.isEmpty() ? 0 : 1 + this.next.size(); //recursion?? lets see if it works
    }

}

