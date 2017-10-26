/*
    Queue implemented using a doubley linked list
    - Add to head, remove from tail.

*/

public class Queue<T> {
    
    private DoubleyLinkedList<T> queue;
    private int length;

    public Queue() {
        queue = new DoubleyLinkedList<T>();
        length = 0;
    }

    public void enqueue(T val) {
        queue.addNodeToHead(val);
        length++;
    }

    public T dequeue() {
        T val = queue.removeFromTail();
        return val;
    }

    public int getLength() {
        return this.length;
    }
}