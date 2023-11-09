package br.com.carlos.dataStructure.Tree;

class TreeNode<Data extends Comparable<Data>> {
    private final Data VALUE;
    private TreeNode<Data> left;
    private TreeNode<Data> right;

    public TreeNode(Data value) {
        this.VALUE = value;
    }

    public Data getValue() {
        return this.VALUE;
    }

    public TreeNode<Data> getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode<Data> left) {
        this.left = left;
    }

    public TreeNode<Data> getRight() {
        return this.right;
    }

    public void setRight(TreeNode<Data> right) {
        this.right = right;
    }
}
