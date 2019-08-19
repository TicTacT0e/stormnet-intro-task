package introtask;

import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack<T> {

    private int topIndex;
    private Node<T> top;

    public MyStack() {
        this.top = null;
        this.topIndex = -1;
    }

    public void push(T item) {
        if (isEmpty()) {
            top = new Node<>(item, null);
        } else {
            Node<T> oldTop = top;
            top = new Node<>(item, oldTop);
        }
        topIndex++;
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.getItem();
        top.setItem(null);
        top = top.getNext();
        topIndex--;

        return item;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getItem();
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int size() {
        return topIndex + 1;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MyStack)) {
            return false;
        }
        MyStack<?> myStack = (MyStack<?>) object;
        if (size() != myStack.size()) {
            return false;
        }

        Node<T> tempThisNode = top;
        Node<?> tempThatNode = myStack.top;
        for (int i = topIndex; i != -1; i--) {
            if (!tempThisNode.getItem()
                    .equals(tempThatNode.getItem())) {
                return false;
            }
            tempThisNode = tempThisNode.getNext();
            tempThatNode = tempThatNode.getNext();
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int hash = 31;
        int result = Objects.hash(topIndex);
        Node<T> tempNode = top;
        for (int i = topIndex; i != -1; i--) {
            result = hash * result
                    + Objects.hashCode(tempNode.getItem());
            tempNode = tempNode.getNext();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        if (isEmpty()) {
            string.append("Stack is empty.");
            return string.toString();
        }
        Node<T> tempNode = top;
        for (int i = topIndex; i != -1; i--) {
            string.append(' ');
            string.append(tempNode.getItem());
            tempNode = tempNode.getNext();
        }
        return string.toString();
    }
}
