package Exercise1;

public class TreeNode<T extends Comparable<T>> {
    private TreeNode left;
    private TreeNode right;
    private T elm;

    public TreeNode(T elm) {
        this.elm = elm;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public T getElm() {
        return elm;
    }

    public void setElm(T elm) {
        this.elm = elm;
    }
}
