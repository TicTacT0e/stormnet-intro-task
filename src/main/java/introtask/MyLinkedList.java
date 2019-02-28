package introtask;


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
        checkElementIndex(index);

        return unlink(getNodeByIndex(index));
    }

    public T get(int index) {
        checkElementIndex(index);

        return getNodeByIndex(index).getItem();
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void checkElementIndex(int index) {
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
                tempNode = tempNode.getNext();
            }
            return tempNode;
        } else {
            tempNode = last;
            for (int i = size - 1; i > index; i--) {
                tempNode = tempNode.getPrevious();
            }
            return tempNode;
        }
    }

    private void link(T item, Node<T> nextNode) {
        Node<T> previous = nextNode.getPrevious();
        Node<T> newNode = new Node<>(previous, item, nextNode);
        nextNode.setPrevious(newNode);
        if (previous == null) {
            first = newNode;
        } else {
            previous.setNext(newNode);
        }
        size++;
    }


    private void linkLast(T item) {
        Node<T> oldLast = last;
        last = new Node<T>(oldLast, item, null);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.setNext(last);
        }
        size++;
    }

    private T unlink(Node<T> node) {
        T item = node.getItem();
        Node<T> next = node.getNext();
        Node<T> previous = node.getPrevious();

        if (previous == null) {
            first = next;
        } else {
            previous.setNext(next);
            node.setPrevious(null);
        }

        if (next == null) {
            last = previous;
        } else {
            next.setPrevious(previous);
            node.setNext(null);
        }

        node.setItem(null);
        size--;
        return item;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MyLinkedList)) {
            return false;
        }
        MyLinkedList<?> thatObject = (MyLinkedList<?>) object;
        if (size != thatObject.size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(thatObject.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        for (int i = 0; i < size; i++) {
            result = 31 * result + get(i).hashCode();
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        if (isEmpty()) {
            string.append("List is empty.");
            return string.toString();
        }
        for (int i = 0; i < this.size; i++) {
            string.append(this.get(i));
            string.append(' ');
        }
        return string.toString();
    }
}



