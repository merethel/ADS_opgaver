public class ADSStack<T> implements ADSStackADT<T>{
    ADSListADT list;

    public ADSStack() {
        this.list = new ADSLinkedList<T>();
    }

    @Override
    public T peek() {
        if (isEmpty())
            return null;
        return (T) list.getFirst().getElm();
    }

    @Override
    public T pop() {
        Node<T> first = list.getFirst();
        if (isEmpty())
        {
            return null;
        }
        //Vi remover ved at sætte en ny first reference.
        list.setFirst(first.getNext());
        return first.getElm();
    }

    @Override
    public void push(T elm) {
        if (elm == null)
        {
            return;
        }
        Node<T> newNode = new Node<>(elm, list.getFirst());
        list.setFirst(newNode);
    }

    @Override
    public boolean isEmpty() {
        if (list.getFirst() == null)
            return true;
        else return false;
    }
}
