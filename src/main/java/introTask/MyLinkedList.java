package introTask;


/*
 * add(T, int index), remove(index), get(int index), size, equals, hashcode, toString
 */

public class MyLinkedList<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public void add(T item, int index) {

    }

    public void add(T item) {

    }

    private boolean checkIndex(int index) {
        if (index >= 0 && index < size) {
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    /*
    private void linkFirst(T item) {
        final Node<T> _first = first;
        final Node<T> newNode = new Node<>(null, item, _first);
        first = newNode;
        if (_first == null) {
            last = newNode;
        } else {
            _first.previous = newNode;
        }
        size++;
    }
    */

    private void linkFirst(T item) {
        Node<T> oldFirst = first;
        first = new Node<>(null, item, oldFirst);
        if (isEmpty()) {
            last = first;
        } else {
            oldFirst.previous = first;
        }
        size++;
    }

    private void linkLast(T item) {
        Node<T> oldLast = last;
        last = new Node<T>(oldLast, item, null);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        size++;
    }


    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> previous;

        Node(Node<T> previous, T item, Node<T> next) {
            this.previous = previous;
            this.item = item;
            this.next = next;
        }
    }

}
