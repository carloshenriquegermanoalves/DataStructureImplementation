package br.com.carlos.dataStructure.tree;

public class TreeNodeImplementation<Data extends Comparable<Data>> {
    private Data value;
    private TreeNodeImplementation<Data> left;
    private TreeNodeImplementation<Data> right;

    public TreeNodeImplementation(Data value) {
        this.value = value;
    }

    public Data getValue() {
        return this.value;
    }

    public TreeNodeImplementation<Data> getLeft() {
        return this.left;
    }

    public void setLeft(TreeNodeImplementation<Data> left) {
        this.left = left;
    }

    public TreeNodeImplementation<Data> getRight() {
        return this.right;
    }

    public void setRight(TreeNodeImplementation<Data> right) {
        this.right = right;
    }

    public void setValue(Data value) {
        this.value = value;
    }
}
