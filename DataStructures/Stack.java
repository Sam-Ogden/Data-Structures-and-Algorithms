/*
    Stack implemented using doubly linked list.
    Add to head, remove from head.
*/

public class Stack<T> {

    private int length;
    private DoubleyLinkedList<T> stack;

    public Stack() {
        stack = new DoubleyLinkedList<T>();
    }

    //add to top of stack
    public void push(T val) {
        stack.addNodeToHead(val);
        length++;
    }

    //remove from top of stack
    public T pop() {
        T val = stack.removeFromHead();
        length--;
        return val;
    }

    public int getLength() {
        return length;
    }

    //...
}