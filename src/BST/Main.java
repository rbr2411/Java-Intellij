package BST;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.insert(5);
        root.insert(15);
        root.printInOrder();
        System.out.println( root.contains(8));
        root.insert(8);
        root.insert(3);
        root.printInOrder();
        System.out.println(root.contains(8));
    }
}
