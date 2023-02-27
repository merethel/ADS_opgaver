public class ADSLinkedList<T> implements ADSListADT<T> {

    public Node<T> first;
    public Node<T> last;
    private int size;

    public ADSLinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void add(T elm) {                    //O(n)
        if(elm == null){
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if(size == 0){
            first = newNode;
            last = newNode;
        } else {
            Node<T> cur = first;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    @Override
    public void insert(int index, T elm) {                    //O(n)
        if(index < 0){ return;}
        if(index > size){
            add(elm);
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if(size == 0)
        {
            first = newNode;
        }
        if(index == 0) {
            newNode.setNext(first);
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
    public boolean remove(T elm) {                    //O(n)
        Node<T> cur = first;
        Node<T> previous = null;
        if (size == 0)
        {
            return false;
        }
        while (cur.getElm() != elm){
            previous = cur;
            if (cur.getNext() == null)
            {
                return false;
            }
            cur = cur.getNext();
        }
        if(cur.getNext() == null)
            last = cur;

        previous.setNext(cur.getNext());
        size--;
        return true;
    }

    @Override
    public int indexOf(T elm) {                    //O(n)
        Node<T> cur = first;
        int index = 0;

        while (cur.getElm() != elm){
            if (cur.getNext() == null)
            {
                return -1;
            }
            cur = cur.getNext();
            index++;
        }

        return index;
    }

    @Override
    public int size() {                     //O(1)
        return size;
    }

    @Override
    public boolean contains(T elm) {                    //O(n)
        Node<T> cur = first;

        while (cur.getElm() != elm){
            if (cur.getNext() == null)
            {
                return false;
            }
            cur = cur.getNext();
        }
        return true;
    }

    @Override
    public T remove(int index) {                    //O(n)
        Node<T> cur = first;
        Node<T> previous = null;
        int i = 0;

        while (i<index){
            previous = cur;
            if (cur.getNext() == null)
            {
                return null;
            }
            cur = cur.getNext();
            i++;
        }
        if(cur.getNext() == null)
            last = cur;
        previous.setNext(cur.getNext());

        size--;

        return cur.getElm();
    }

    @Override
    public T set(int index, T elm) {                    //O(n)
        Node<T> cur = first;
        Node<T> previous = null;
        int i = 0;

        while (i<index){
            previous = cur;
            if (cur.getNext() == null)
            {
                return null;
            }
            cur = cur.getNext();
            i++;
        }
        if(cur.getNext() == null)
            last = cur;
        Node<T> newNode = new Node<>(elm,cur.getNext());
        previous.setNext(newNode);

        return cur.getElm();

    }

    @Override
    public Node<T> getFirst() {
        return first;
    }

    @Override
    public Node<T> getLast() {
        return last;
    }

    @Override
    public void setFirst(Node<T> node) {
        first = node;
    }

    @Override
    public void setLast(Node<T> node) {
        last = node;
    }

}
