package introTask;


import java.util.Objects;

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
        checkIndex(index);

        if (index == size) {
            linkLast(item);
        } else {
            link(item, getNodeByIndex(index));
        }
    }

    public void add(T item) {
        linkLast(item);
    }

    public T remove(int index) {
        checkIndex(index);

        return unlink(getNodeByIndex(index));
    }

    public T get(int index) {
        checkIndex(index);

        return getNodeByIndex(index).item;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node<T> getNodeByIndex(int index) {
        checkIndex(index);
        Node<T> tempNode;

        if (index < size / 2) {
            tempNode = first;
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.next;
            }
            return tempNode;
        } else {
            tempNode = last;
            for (int i = size - 1; i > index; i--) {
                tempNode = tempNode.previous;
            }
            return tempNode;
        }
    }

    private void link(T item, Node<T> nextNode) {
        Node<T> previous = nextNode.previous;
        Node<T> newNode = new Node<>(previous, item, nextNode);
        nextNode.previous = newNode;
        if (previous == null) {
            first = newNode;
        } else {
            previous.next = newNode;
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

    private T unlink(Node<T> node) {
        T item = node.item;
        Node<T> next = node.next;
        Node<T> previous = node.previous;

        if (previous == null) {
            first = next;
        } else {
            previous.next = next;
            node.previous = null;
        }

        if (next == null) {
            last = previous;
        } else {
            next.previous = previous;
            node.next = null;
        }

        node.item = null;
        size--;
        return item;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) { return true; }
        if (!(object instanceof MyLinkedList)) { return false; }
        MyLinkedList<?> thatObject = (MyLinkedList<?>) object;
        return size == thatObject.size &&
                Objects.equals(first, thatObject.first) &&
                Objects.equals(last, thatObject.last);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, first, last);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < this.size; i++){
            string.append(this.get(i));
            string.append(' ');
        }
        return string.toString();
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



