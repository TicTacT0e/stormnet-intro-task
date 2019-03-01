package introtask;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Objects;

public class MyStack<T> {

    private int topIndex;
    private Node<T> top;

    public MyStack() {
        this.top = null;
        this.topIndex = -1;
    }

    public void push(T item) {
        if (top == null) {
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
        return stackElementsCompare(myStack);
    }

    @Override
    public int hashCode() {
        final int hash = 31;
        int result = Objects.hash(topIndex);
        List<Node<?>> thisList = getList();
        for (int i = 0; i < size(); i++) {
            result = hash * result + Objects
                    .hashCode(thisList.get(i).getItem());
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
        List<Node<?>> thisList = getList();
        string.append(' ');
        for (Node<?> node : thisList) {
            string.append(node.getItem());
            string.append(' ');
        }

        return string.toString();
    }

    private boolean stackElementsCompare(MyStack<?> incomingStack) {
        List<Node<?>> thisList = getList();
        List<Node<?>> thatList = incomingStack.getList();


        for (int i = 0; i < thisList.size(); i++) {
            if (!thisList.get(i).getItem()
                    .equals(thatList.get(i).getItem())) {
                return false;
            }
        }
        return true;
    }

    private List<Node<?>> getList() {
        if (top == null) {
            throw new EmptyStackException();
        }
        List<Node<?>> list = new ArrayList<>();
        Node<?> tempNode = top;
        list.add(top);
        while (tempNode.getNext() != null) {
            list.add(tempNode.getNext());
            tempNode = tempNode.getNext();
        }
        return list;
    }

}
