package introTask;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class CustomStack<T> implements Comparable<CustomStack<T>>{

    private Class tClass;
    private T[] stackArray;
    private int size;
    private int top;

    @SuppressWarnings("unchecked")
    public CustomStack(Class<T> tClass, int size) {
        this.tClass = tClass;
        this.size = size;
        this.stackArray = (T[]) Array.newInstance(this.tClass, this.size);
        this.top = -1;
    }

    public CustomStack(Class<T> tClass) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomStack)) return false;
        CustomStack<?> that = (CustomStack<?>) o;
        return size == that.size &&
                top == that.top &&
                Objects.equals(tClass, that.tClass) &&
                Arrays.equals(stackArray, that.stackArray);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(tClass, size, top);
        result = 31 * result + Arrays.hashCode(stackArray);
        return result;
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "tClass=" + tClass +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", size=" + size +
                ", top=" + top +
                '}';
    }

    @Override
    public int compareTo(CustomStack<T> o) {
        return 0;
    }
}
