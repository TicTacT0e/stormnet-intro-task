package introTask.stackTests;

import introTask.Fraction;
import introtask.MyStack;
import org.junit.Test;

public class PushTests {

    @Test
    public void push() {
        MyStack<Fraction> stack = new MyStack<>();
        stack.push(new Fraction(1, 3));
    }

    @Test
    public void pushWhenInitialCapacityLess() {
        int initialCapacity = 4;
        MyStack<Integer> stack = new MyStack<>(initialCapacity);
        for (int i = 0; i < initialCapacity * 3; i++) {
            stack.push(i);
        }
    }
}
