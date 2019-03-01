package introtask;

class Node<T> {

    private T item;
    private Node<T> next;

    Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;
    }

    Node<T> getNext() {
        return next;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    T getItem() {
        return item;
    }

    void setItem(T item) {
        this.item = item;
    }

}
