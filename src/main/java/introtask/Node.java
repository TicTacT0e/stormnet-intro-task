package introtask;

class Node<T> {

    private T item;
    private Node<T> next;
    private Node<T> previous;

    Node(Node<T> previous, T item, Node<T> next) {
        this.previous = previous;
        this.item = item;
        this.next = next;
    }

    Node(T item, Node<T> next) {
        this.item = item;
        this.next = next;

        this.previous = null;
    }

    Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    Node<T> getPrevious() {
        return previous;
    }

    void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    T getItem() {
        return item;
    }

    void setItem(T item) {
        this.item = item;
    }

}
