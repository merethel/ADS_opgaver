package Exercise1;

public interface BinarySearchTreeADT<T extends Comparable<T>> extends BinaryTreeADT<T>{
    void addElement(T element);
    T removeElement(T targetElement);



/*    void removeAllOccurrences(T targetElement);
    T removeMin();
    T removeMax();
    T findMin();
    T findMax();*/
}
