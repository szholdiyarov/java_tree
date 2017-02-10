package tree;

/**
 * Created by User on 10.02.17.
 */
public interface BinaryNodeContract {

    int depth(int nodeDepth); // depth of a node is the number of edges from the root to the node.

    int height(); //  height of a node is the number of edges from the node to the deepest leaf.

    int treeHeight(); //  height of a tree is a height of the root.

    boolean isBinaryTree(); // full binary tree.is a binary tree in which each node has exactly zero or two children.

    boolean isCompleteBinaryTree(); //complete binary tree is a binary tree, which is completely filled, with the possible exception of the bottom level, which is filled from left to right.
}
