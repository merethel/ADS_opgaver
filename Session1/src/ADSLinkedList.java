public class ADSLinkedList<T> implements ADSListADT<T> {

    private Node<T> first;
    private int size;

    public ADSLinkedList(){
        first = null;
        size = 0;
    }

    @Override
    public void add(T elm) {
        if(elm == null){
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if(size == 0){
            first = newNode;
        } else {
            Node<T> cur = first;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
        size++;
    }

    @Override
    public void insert(int index, T elm) {
        if(index < 0){ return;}
        if(index > size){
            add(elm);
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if(size == 0) {
            first = newNode;
        } else {
            Node<T> cur = first;
            int i = 0;
            while(i < index - 1){
                cur = cur.getNext();
                i++;
            }
            newNode.setNext(cur.getNext());
            cur.setNext(newNode);
        }
        size++;

    }

    @Override
    public boolean remove(T elm) {

        return false;
    }

    @Override
    public int indexOf(T elm) {
        //TODO
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T elm) {
        //TODO
        return false;
    }

    @Override
    public T remove(int index) {
        //TODO
        return null;
    }

    @Override
    public T set(int index, T elm) {
        //TODO
        return null;
    }
}
