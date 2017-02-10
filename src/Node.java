
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

/**
 * Created by User on 10.02.17.
 */
class Node<T extends Comparable<T>> {
    private T value;
    private Node parent;
    private List<Node> leftChildren;
    private List<Node> rightChildren;

    public static Node initTree(Node first) {
        if (first.leftChildren == null && first.rightChildren == null) {
            first.leftChildren = new ArrayList<>(10);
            first.rightChildren = new ArrayList<>(10);
            return first;
        } else {
            throw new ExceptionInInitializerError(Exceptions.ExistedTreeInitializationException.message);
        }
    }

    /**
     * @param value node's value
     */
    Node(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }

    List<Node> getLeftChildren() {
        return leftChildren;
    }


    List<Node> addChildren(Node newChild) {
        if (newChild.value.compareTo(this.value) == 0) { // new child was not added as its value same as current node's
            return null;
        } else if (newChild.value.compareTo(this.value) < 0) { // add to left
            rightChildren.add(newChild);
            newChild.parent = this;
            return leftChildren;
        } else {
            leftChildren.add(newChild);
            newChild.parent = this;
            return rightChildren;
        }
    }

    @Override
    public String toString() {
        if (parent == null) {
            return "Node's value " + value + ", parent is null " + ", left children " + leftChildren + ", right children " + rightChildren;
        }

        return "Node's value " + value + ", parent value " + parent.value + ", left children " + leftChildren + ", right children " + rightChildren;
    }
}
