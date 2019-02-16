package introTask;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack<T> {

    private Object[] array;
    private int maxSize;
    private int top;

    public MyStack(int maxSize) {
        if (maxSize < 1) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.array = new Object[maxSize];
        this.top = -1;
    }

    public MyStack() {
        this(10);
    }

    public void push(T element) {
        if (top == maxSize - 1) {
            maxSize *= 2;
            Object[] tempArray = new Object[maxSize];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
        }

        array[++top] = element;
    }

    @SuppressWarnings("unchecked")
    public synchronized T pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[top--];
    }

    @SuppressWarnings("unchecked")
    public synchronized T peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[top];
    }

    public boolean isEmpty() {
        return top <= -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MyStack)) {
            return false;
        }
        MyStack<?> that = (MyStack<?>) object;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(maxSize, top);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
