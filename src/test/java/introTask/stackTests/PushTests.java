package introTask.stackTests;

import introTask.Fraction;
import introTask.MyStack;
import org.junit.Test;

public class PushTests {

    @Test
    public void push() {
        MyStack<Fraction> stack = new MyStack<>();
        stack.push(new Fraction(1, 3));
    }

    @Test
    public void pushWhenInitialSizeLess() {
        MyStack<Integer> stack = new MyStack<>(4);
        for (int i = 0; i < stack.size() * 3; i++) {
            stack.push(i);
        }
    }
}
