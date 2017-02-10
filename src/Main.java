import tree.Node;

public class Main {


    public static void main(String[] args) {
        Node rootNode = Node.initTree(new Node<>(1.0));

        for (int i = 2; i < 10; i++) {
            rootNode.addChildren(new Node<>(i));
        }

    }
}
