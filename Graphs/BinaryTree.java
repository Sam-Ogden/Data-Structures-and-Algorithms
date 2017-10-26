/*
    None balanced binary tree.
    Nodes are added to left subtree if smaller than current node
    or added to right subtree if greater than current node

    - useful for binary search
*/

public class BinaryTree<T> {

    private Node root;

    public BinaryTree(T val) {
        root = new Node(val, null);
    }

    public void addNode(T val) {
        boolean complete = false;
        Node tmpRoot = root;
        while(true) {
            //Always go left if equal value or smaller
            if(tmpRoot.getValue().compareTo(val)>=0) {
                if(tmpRoot.hasLeft()) tmpRoot = tmpRoot.getLeft();
                else {
                    tmpRoot.setLeft(new Node(val, tmpRoot));
                    break;
                }
                continue;
            } else if(tmpRoot.getValue().compareTo(val)<0) { //tmp root smaller than val
                if(tmpRoot.hasRight()) tmpRoot = tmpRoot.getRight();
                else {
                    tmpRoot.setRight(new Node(val, tmpRoot));
                    break;
                }
            }
        }
    } 

    public boolean contains(T val) {
        
    }

    public T removeNode(T val) {

    }

    class Node<T> {
        
        private T value;
        private Node parent;
        private Node left = null;
        private Node right = null;
    
        public Node(T val, Node parent) {
            this.value = val;
            this.left = null;
            this.right = null;
            this.parent = parent;
        }

        public T getValue() {
            return this.value;
        }

        public Node getLeft() {
            return this.left;
        }

        public Node getRight() {
            return this.right;
        }
        
        public boolean hasRight() {
            return this.right instanceof Node;
        }

        public Node hasLeft() {
            return this.left instanceof Node;
        }

        public void setLeft(Node n) {
            this.left = n;
        }
    
        public void setRight(Node n) {
            this.right = n;
        }

        public Node getParent() {
            return this.parent;
        }
    }
}

