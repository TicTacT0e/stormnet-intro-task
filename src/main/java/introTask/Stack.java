package introTask;

import java.lang.reflect.Array;

public class Stack<T> {

    private Class tClass;
    private T[] stackArray;
    private int size;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(Class<T> tClass, int size) {
        this.tClass = tClass;
        this.size = size;
        this.stackArray = (T[]) Array.newInstance(this.tClass, this.size);
        this.top = -1;
    }

    public Stack(Class<T> tClass) {
        this(tClass, 10);
    }

    @SuppressWarnings("unchecked")
    public void push(T element) {
        if (top == size - 1) {
            T[] tempArray = (T[]) Array.newInstance(tClass, size * 2);
            System.arraycopy(stackArray, 0, tempArray, 0, stackArray.length);
            stackArray = tempArray;
        }

        stackArray[++top] = element;
    }

    public T pop() {
        return stackArray[top--];
    }

    public T peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
