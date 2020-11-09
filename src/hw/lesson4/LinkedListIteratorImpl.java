package hw.lesson4;

public class LinkedListIteratorImpl<E> extends SimpleLinkedListImpl<E> implements MyIterator<E> {

    private SimpleLinkedListImpl<E> simpleLinkedList;

    private Node<E> current;
    private Node<E> previous;

    public LinkedListIteratorImpl(SimpleLinkedListImpl<E> simpleLinkedList) {
        this.simpleLinkedList = simpleLinkedList;
        resetting();
    }

    @Override
    public void insertionBefore(E value) {
        Node<E> newItem = new Node<>(value);
        if(previous == null) {
            newItem.next = simpleLinkedList.firstElement;
            simpleLinkedList.firstElement = newItem;
            resetting();
        } else {
            newItem.next = previous.next;
            previous.next = newItem;
            current = newItem;
        }
    }

    @Override
    public void insertionAfter(E value) {
        Node<E> newItem = new Node<>(value);
        if (simpleLinkedList.isEmpty()){
            simpleLinkedList.firstElement = newItem;
            current = newItem;
        } else {
            newItem.next = current.next;
            current.next = newItem;
            next();
        }
    }

    @Override
    public void resetting() {
        current = simpleLinkedList.firstElement;
        previous = null;
    }

    @Override
    public void remove() {
        if (previous == null){
            simpleLinkedList.firstElement = current.next;
            resetting();
        } else {
            previous.next = current.next;
            if ( !hasNext() ) {
                resetting();
            } else {
                current = current.next;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public E next() {
        E nextValue = current.item;
        previous = current;
        current = current.next;
        return nextValue;
    }
}