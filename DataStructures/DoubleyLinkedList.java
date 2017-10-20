//Constructors have no return type!

public class DoubleyLinkedList<T> {

    private int length;
    private Node head;
    private Node tail;
    
    public DoubleyLinkedList(T item) {
        this.length = 0;
        this.head = new Node(item);
        this.tail = this.head;
        this.length++;
    }

    public void addNodeToTail(T item) {
        Node newNode = new Node(item, this.tail); // value item and prev = cur tail
        newNode.setNext(null);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.length++;
    }

    public void addNodeToHead(T item) {
        Node newNode = new Node(item); // value item and prev = null
        newNode.setNext(this.head);
        this.head.setPrev(newNode);
        this.head = newNode;
        this.length++;
    }

    public boolean contains(T val) {
        Node tmpHead = this.head;
        while(tmpHead.getNext() != null) {
            if(tmpHead.getValue() == val) return true;
            tmpHead = tmpHead.getNext();
            if(tmpHead.getNext() == null) {
                if(tmpHead.getValue() == val) return true;
            }           
        }
        return false;
    }

    public String toString() {
        String result = "";
        Node tmpHead = this.head;
        while(tmpHead.getNext() != null) {
            result = result + tmpHead.getValue() + ", ";
            tmpHead = tmpHead.getNext();
            if(tmpHead.getNext() == null) result = result + tmpHead.getValue();
        }
        return result;
    }

    public int length() {
        return this.length;
    }

    class Node<T> {
        
        private T value;
        private Node next = null;
        private Node prev;
    
        public Node(T item) {
            this.value = item;
            this.prev = null;
        }
    
        public Node(T item, Node prev) {
            this.value = item;
            this.prev = prev;
        }
        
        public T getValue() {
            return this.value;
        }
    
        public void setTalue(T item) {
            this.value = item;
        }
    
        public Node getNext() {
            return this.next;
        }
    
        public void setNext(Node n) {
            this.next = n;
        }
    
        public Node getPrev() {
            return this.prev;
        }
    
        public void setPrev(Node n) {
            this.prev = n;
        }
    }
}

