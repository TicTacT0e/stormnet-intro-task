package introtask;

import java.util.EmptyStackException;

public class MyStack<T> {

    private int topIndex;
    private Node<T> top;

    public MyStack() {
        this.top = null;
        this.topIndex = -1;
    }

    public void push(T element) {
        linkTop(element);
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return unlinkTop();
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return getTopItem();
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }

    /*
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        MyStack<?> other = (MyStack<?>) object;
        return Arrays.equals(array, other.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, topIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Stack is empty.";
        }
        Object[] tempArray;
        tempArray = Arrays.stream(array).filter(Objects::nonNull)
                .toArray(Object[]::new);
        reverseArray(tempArray);
        return Arrays.toString(tempArray);
    }
    
    private void reverseArray(Object[] array) {
        Object tempObject;
        for (int i = 0; i < array.length / 2; i++) {
            tempObject = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = tempObject;
        }
    }
    */

    private void linkTop(T item) {
        if (top == null) {
            top = new Node<>(item, null);
        } else {
            Node<T> oldTop = top;
            top = new Node<>(item, oldTop);
        }
        topIndex++;
    }

    private T unlinkTop() {
        T item = top.item;
        top.item = null;
        top = top.next;
        topIndex--;

        return item;
    }

    private T getTopItem() {
        return top.item;
    }

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }
    }

}
