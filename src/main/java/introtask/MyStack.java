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
        return stackElementsCompare(myStack);
    }

    private boolean stackElementsCompare(MyStack<?> incomingStack) {
        MyStack<?> tempThis = this;

        for (int i = 0; getTopItem() != null
                && i <= topIndex; i++) {
            if (!tempThis.pop().equals(incomingStack.pop())) {
                return false;
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(topIndex);
        return Objects.hash(topIndex, top);
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "topIndex=" + topIndex +
                ", top=" + top +
                '}';
    }

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
