package br.com.carlos.dataStructure.tree.test;

import br.com.carlos.dataStructure.tree.TreeImplementation;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeImplementationTest {

    @Test
    public void testRemoveLeafNode() {
        TreeImplementation<Integer> tree = new TreeImplementation<>();
        tree.insert(10);
        tree.insert(8);
        tree.insert(5);

        assertTrue(tree.remove(5)); // Remove a leaf node
        assertNull(tree.getRoot().getLeft().getLeft()); // The leaf node should be removed
    }

    @Test
    public void testRemoveNodeWithOneChild() {
        TreeImplementation<Integer> tree = new TreeImplementation<>();
        tree.insert(10); // Root node
        tree.insert(8);  // Left child with one child
        tree.insert(12); // Right child

        assertTrue(tree.remove(8)); // Remove a node with one child

        // After removing node with one child (8), it should be replaced with its child (12)
        assertNull(tree.getRoot().getLeft()); // The left child should be null
        assertEquals(Integer.valueOf(12), tree.getRoot().getRight().getValue());
    }

    @Test
    public void testRemoveNodeWithTwoChildren() {
        TreeImplementation<Integer> tree = new TreeImplementation<>();
        tree.insert(10); // Root node
        tree.insert(8);  // Left child with two children
        tree.insert(12); // Right child
        tree.insert(5);  // Leftmost child of the left child (with value 8)
        tree.insert(9);  // Right child of the left child (with value 8)

        assertTrue(tree.remove(8)); // Remove a node with two children

        // After removing node with two children (8), it should be replaced with the in-order successor (9)
        assertEquals(Integer.valueOf(10), tree.getRoot().getValue()); // New root should be 10
        assertEquals(Integer.valueOf(9), tree.getRoot().getLeft().getValue()); // 9 should be the left child
        assertEquals(Integer.valueOf(5), tree.getRoot().getLeft().getLeft().getValue()); // 5 should be the leftmost child
        assertEquals(Integer.valueOf(12), tree.getRoot().getRight().getValue()); // 12 should be the right child
    }

    @Test
    public void testRemoveNonExistentNode() {
        TreeImplementation<Integer> tree = new TreeImplementation<>();
        tree.insert(10);
        tree.insert(8);
        tree.insert(5);

        assertFalse(tree.remove(7)); // Try to remove a non-existent node
        assertNotNull(tree.getRoot().getLeft().getLeft()); // The tree structure should remain unchanged
    }

}
