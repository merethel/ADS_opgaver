package Exercise1;

public class BinarySearchTree<T extends Comparable<T>> implements BinarySearchTreeADT<T> {

    private TreeNode<T> root;
    private int size;

    @Override
    public void addElement(T element) {
        if (root == null) {
            root = new TreeNode<>(element);
        }
        
        TreeNode current = root;
        boolean found = false;

        while (!found) {
            if (current.getElm().compareTo(element) > 0) { //hvis current er større end element
                if (current.getLeft() != null) { //Hvis current's venstre node ikke er tom, så rykker vi ned
                    current = current.getLeft();
                } else {
                    TreeNode newNode = new TreeNode(element);
                    current.setLeft(newNode);  //Hvis den er tom, så indsætter vi den nye node her
                    found = true;
                }
            }
            else {
                if (current.getRight() != null) { //Hvis current er mindre end element
                    current = current.getRight();
                } else {
                    TreeNode newNode = new TreeNode(element);
                    current.setRight(newNode);
                    found = true;
                }
            }
        }
    }


    @Override
    public T removeElement(T targetElement) {
        return null;
    }


    @Override
    public TreeNode getRootElement() {
        return root;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T targetElement) {
        return false;
    }

    @Override
    public T find(T targetElement) {
        return null;
    }


/*
    @Override
    public void removeAllOccurrences(T targetElement) {

    }

    @Override
    public T removeMin() {
        return null;
    }

    @Override
    public T removeMax() {
        return null;
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public T findMax() {
        return null;
    }*/


/*    @Override
    public Iterator iteratorOrder() {
        //TODO
        return null;
    }

    @Override
    public Iterator iteratorInOrder() {
        //TODO
        return null;
    }

    @Override
    public Iterator iteratorPreOrder() {
        //TODO
        return null;
    }

    @Override
    public Iterator iteratorPostOrder() {
        //TODO
        return null;
    }*/
}
