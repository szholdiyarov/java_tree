import tree.Node;

public class Main {
    static Node rootNode;

    public static void main(String[] args) {

        rootNode = Node.initTree(new Node<>(1.0));
        System.out.println(rootNode);

        for (int i = 0; i < 10; i++) {
            System.out.println("adding value " + i);
            rootNode.addChildren(new Node<>(Double.valueOf(i)));
            System.out.println(rootNode);
        }


    }
}
