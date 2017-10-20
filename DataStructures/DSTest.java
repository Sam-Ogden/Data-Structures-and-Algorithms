public class DSTest {
    public static void main(String[] args) {
        if(dllTest()) System.out.println("DoubleLinkList     OK");
        else System.out.println("DoubleLinkList     FAIL");
    }

    private static boolean dllTest() {
        DoubleyLinkedList<Integer> list = new DoubleyLinkedList<Integer>(1);
        list.addNodeToHead(12);
        list.addNodeToTail(2);
        list.addNodeToTail(3);
        if(list.contains(3) && list.length() == 4) return true;
        return false;
    }

    private static void p(Object o) { System.out.println(o); }
}