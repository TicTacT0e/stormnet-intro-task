package introtask;


import java.util.Objects;

public class MyList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public MyList() {
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

    public void add(T item) {
        Node<T> oldLast = last;
        last = new Node<>(item, null);
        if (isEmpty()) {
            first = last;
        }
        if (oldLast != null) {
            oldLast.setNext(last);
        }
        size++;
    }

    public void add(T item, int index) {
        checkIndexForInject(index);
        if (isEmpty()) {
            add(item);
        }

        if (index == size) {
            injectIntoLast(item);
        } else {
            injectNode(item, index);
        }

    }

    public T remove(int index) {
        checkIndex(index);

        Node<T> node = getNodeByIndex(index);
        T item = node.getItem();

        if (index == 0) {
            first = node.getNext();
        } else {
            Node<T> tempNode = first;
            while (tempNode.getNext() != node) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node.getNext());
        }

        node.setItem(null);
        node.setNext(null);
        size--;
        return item;
    }

    public T get(int index) {
        checkIndex(index);
        return getNodeByIndex(index).getItem();
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void checkIndexForInject(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node<T> getNodeByIndex(int index) {
        Node<T> tempNode = first;

        for (int i = 0; i < index; i++) {
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    private void injectNode(T item, int index) {
        if (index == 0) {
            injectIntoFirst(item);
        } else {
            Node<T> oldNode = getNodeByIndex(index);
            Node<T> newNode = new Node<>(item, oldNode);
            Node<T> tempNode = first;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
        }
        size++;
    }

    private void injectIntoFirst(T item) {
        Node<T> oldFirst = first;
        first = new Node<>(item, oldFirst);
    }

    private void injectIntoLast(T item) {
        Node<T> oldLast = last;
        last = new Node<>(item, null);
        oldLast.setNext(last);
        size++;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MyList)) {
            return false;
        }

        MyList<?> thatList = (MyList<?>) object;

        if (size != thatList.size()) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (!get(i).equals(thatList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int hash = 31;
        int result = Objects.hash(size);
        for (int i = 0; i < size; i++) {
            result = hash * result * get(i).hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isEmpty()) {
            stringBuilder.append("List is empty.");
        } else {
            for (int i = 0; i < this.size; i++) {
                stringBuilder.append(get(i));
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}



