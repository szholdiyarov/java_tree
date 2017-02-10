package tree;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

/**
 * Created by szholdiyarov.
 * This class representds node object.
 */
public class Node<T extends Comparable<T>> implements BinaryNodeContract {
    private T value;
    private Node parent;
    private List<Node> leftChildren;
    private List<Node> rightChildren;

    public Node(T value) {
        this.value = value;
    }

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
     * Ignore if new child's value is equals to current node's
     * <p>
     * TODO consider if node's element same as new one
     *
     * @param newChild child which should be added to the tree
     */
    public void addChildren(Node newChild) {
        if (newChild.value.compareTo(this.value) < 0) { // add to left
            assignParent(newChild, rightChildren);
            rightChildren.add(newChild);
        } else {
            assignParent(newChild, leftChildren);
            leftChildren.add(newChild);
        }
    }


    @Override
    public String toString() {
        if (parent == null) {
            return "Node's value " + value + ", parent is null ";
        }
        return "Node's value " + value + ", parent value " + parent.value;
    }

    /**
     * @return number of edges from the root to this node
     */
    @Override
    public int depth(int nodeDepth) {
        if (parent == null) {
            return nodeDepth;
        }
        return parent.depth(nodeDepth + 1);
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public int treeHeight() {
        return 0;
    }

    @Override
    public boolean isBinaryTree() {
        return false;
    }

    @Override
    public boolean isCompleteBinaryTree() {
        return false;
    }

    T getValue() {
        return value;
    }

    public List<Node> getLeftChildren() {
        return leftChildren;
    }


    private void assignParent(Node childNode, List<Node> childNewList) {
        if (!childNewList.isEmpty()) {
            childNode.parent = childNewList.get(childNewList.size() - 1);
        }
    }

}
