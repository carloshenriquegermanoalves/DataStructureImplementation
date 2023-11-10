package br.com.carlos.dataStructure.tree;

public class TreeImplementation<Data extends Comparable<Data>> {
    private TreeNodeImplementation<Data> root;

    public TreeImplementation() {
        this.root = null;
    }

    public TreeNodeImplementation<Data> getRoot() {
        return this.root;
    }

    public void insert(Data value) {
        this.root = insertRecursive(root, value);
    }

    private TreeNodeImplementation<Data> insertRecursive(TreeNodeImplementation<Data> node, Data value) {
        // If the current node is null, create a new node with the given value
        if (node == null) {
            return new TreeNodeImplementation<>(value);
        }

        // Compare the new value with the current node's value
        int comparisonResult = value.compareTo(node.getValue());

        // If the new value is smaller, insert it in the left subtree
        if (comparisonResult < 0) {
            node.setLeft(insertRecursive(node.getLeft(), value));
        }
        // If the new value is greater, insert it in the right subtree
        else if (comparisonResult > 0) {
            node.setRight(insertRecursive(node.getRight(), value));
        }

        return node;
    }

    // Method to remove a node with a specific value from the binary tree
    public boolean remove(Data value) {
        TreeNodeImplementation<Data> parent = null;
        TreeNodeImplementation<Data> current = root;

        // Traverse the tree to find the node to remove
        while (current != null) {
            int comparisonResult = value.compareTo(current.getValue());

            // If the comparison result is 0, it means the current node's value matches the value to be removed
            if (comparisonResult == 0) {
                return removeNode(parent, current);
            }

            // Update the parent and current node to continue traversal
            parent = current;
            if (comparisonResult < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        // If the value is not found in the tree, return false
        return false;
    }

    // Method to remove a specific node from the binary tree
    private boolean removeNode(TreeNodeImplementation<Data> parent, TreeNodeImplementation<Data> node) {
        TreeNodeImplementation<Data> left = node.getLeft();
        TreeNodeImplementation<Data> right = node.getRight();

        // If the right child is null, replace the node with its left child
        if (right == null) {
            if (parent == null) {
                root = left;
            } else if (node == parent.getLeft()) {
                parent.setLeft(left);
            } else {
                parent.setRight(left);
            }
        }
        // If the right child is not null, replace the node with its in-order successor
        else {
            // Find the in-order successor of the node
            TreeNodeImplementation<Data> successor = getLeftMostNode(right);
            // Remove the in-order successor from its original position in the tree
            remove(successor.getValue());
            // Set the value of the current node to be the value of the in-order successor
            node.setValue(successor.getValue());
        }

        return true;
    }

    private TreeNodeImplementation<Data> getLeftMostNode(TreeNodeImplementation<Data> node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }
}
