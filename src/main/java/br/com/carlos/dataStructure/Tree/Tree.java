package br.com.carlos.dataStructure.Tree;

public class Tree<Data extends Comparable<Data>> {
    private TreeNode<Data> root;

    public Tree() {
        this.root = null;
    }

    public TreeNode<Data> getRoot() {
        return this.root;
    }

    public void insert(Data value) {
        this.root = insertRecursive(root, value);
    }

    private TreeNode<Data> insertRecursive(TreeNode<Data> node, Data value) {
        if (node == null) {
            return new TreeNode<>(value);
        }

        int comparisonResult = value.compareTo(node.getValue());
        if (comparisonResult < 0) {
            node.setLeft(insertRecursive(node.getLeft(), value));
        } else if (comparisonResult > 0) {
            node.setRight(insertRecursive(node.getRight(), value));
        }

        return node;
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(TreeNode<Data> node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getValue());
            inOrder(node.getRight());
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(TreeNode<Data> node) {
        if (node != null) {
            System.out.println(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(TreeNode<Data> node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getValue());
        }
    }
}

