/**
 * Jack Greco
 * StackNode.java
 * This is a generic datatype Stack class--it allows the user to only see and interact with the top element
 * 10-22-20
 * JMG
 * @param <E>
 */

public class StackNode<E> {


    private E data;
    private E childNode;

    StackNode() {
    }

    public void setData(E data) {
        this.data = data;
    }

    public void setChildNode(E childNode) {
        this.childNode = childNode;
    }

    public E getData() {
        return data;
    }

    public E getChildNode() {
        return childNode;
    }
}


