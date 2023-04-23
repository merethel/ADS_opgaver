package Exercise1;

import java.util.Iterator;

public interface BinaryTreeADT<T extends Comparable<T>> {
    TreeNode getRootElement();
    boolean isEmpty();
    int size();
    boolean contains(T targetElement);
    T find(T targetElement);
    String toString();
  /*  Iterator<T> iteratorOrder();
    Iterator<T> iteratorInOrder();
    Iterator<T> iteratorPreOrder();
    Iterator<T> iteratorPostOrder();*/
}
