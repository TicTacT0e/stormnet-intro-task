package introtask;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class MyStack<T> {

    private Object[] array;
    private int capacity;
    private int top;


    public MyStack(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.top = -1;
    }

    public MyStack() {
        this(10);
    }


    public void push(T element) {
        if (top == capacity - 1) {
            capacity *= 2;
            Object[] tempArray = new Object[capacity];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
        }

        array[++top] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        T result = (T) array[top];
        array[top--] = null;
        return result;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public boolean equals(Object object) {
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
        int result = Objects.hash(capacity, top);
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

}
