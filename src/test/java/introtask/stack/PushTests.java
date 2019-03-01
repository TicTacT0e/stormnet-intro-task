package introtask.stack;

import introtask.Fraction;
import introtask.MyStack;
import org.junit.Test;

public class PushTests {

    @Test
    public void push() {
        MyStack<Fraction> stack = new MyStack<>();
        stack.push(new Fraction(1, 3));
    }
}
