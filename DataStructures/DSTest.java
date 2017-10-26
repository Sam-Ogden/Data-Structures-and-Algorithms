public class DSTest {
    public static void main(String[] args) {
        if(dllTest()) p("DoubleLinkList     OK");
        else p("DoubleLinkList     FAIL");

        if(stackTest()) p("Stack    OK");
        else p("Stack   FAIl");

        if(queueTest()) p("Queue    OK");
        else p("Queue   FAIl");
    }

    private static boolean dllTest() {
        DoubleyLinkedList<Integer> list = new DoubleyLinkedList<Integer>();
        list.addNodeToHead(12);
        list.addNodeToTail(2);
        list.addNodeToTail(3);
        if(list.contains(3) && list.length() == 3) return true;
        return false;
    }

    private static boolean stackTest() {
        Stack<String> stack = new Stack<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        if(stack.getLength() != 3) return false;
        if(stack.pop() != "3") return false;
        if(stack.pop() != "2") return false;
        if(stack.pop() != "1") return false; 
        return true;
    }

    private static boolean queueTest() {
        Queue<String> queue = new Queue<String>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        if(queue.getLength() != 3) return false;
        if(queue.dequeue() != "1") return false;
        if(queue.dequeue() != "2") return false;
        if(queue.dequeue() != "3") return false; 
        return true;
    }

    private static void p(Object o) { System.out.println(o); }
}