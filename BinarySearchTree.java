public class BinarySearchTree {
    /* 
        BST :
        A tree data structure, where each node is grater than it's left child, but less than its right.
        Benefit: easy to locate a node when they are in this order
        Time Complexity: best case O(log n)
                         Worst case O(n)
        Space Complexity: O(n)
    */
    public static void main(String[] args) {
        
        BST tree = new BST();

        tree.insert(new NodeBST(5));
        tree.insert(new NodeBST(1));
        tree.insert(new NodeBST(9));
        tree.insert(new NodeBST(2));
        tree.insert(new NodeBST(7));
        tree.insert(new NodeBST(3));
        tree.insert(new NodeBST(6));
        tree.insert(new NodeBST(4));
        tree.insert(new NodeBST(8));

        
        tree.remove(3);
        tree.display();
        System.out.println(tree.search(0));
    }
}
