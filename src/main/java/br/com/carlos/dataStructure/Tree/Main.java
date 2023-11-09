package br.com.carlos.dataStructure.Tree;

public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.insert(10);
        tree.insert(8);
        tree.insert(5);
        tree.insert(9);
        tree.insert(7);
        tree.insert(18);
        tree.insert(13);
        tree.insert(20);

        System.out.println("Exibição em ordem. . .");
        tree.inOrder();
        System.out.println("\n\nExibição em pré-ordem. . .");
        tree.preOrder();
        System.out.println("\n\nExibição em pós-ordem. . .");
        tree.postOrder();
    }
}
