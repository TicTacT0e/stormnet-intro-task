package introtask.stack;

import introtask.Fraction;
import introtask.MyStack;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class PeekTests {

    @Test(expected = EmptyStackException.class)
    public void peekBeforePushing() {
        new MyStack<Integer>().peek();
    }

    @Test
    public void peekAfterPushing() {
        MyStack<Fraction> stack = new MyStack<>();
        Fraction fraction = new Fraction(1, 2);
        stack.push(fraction);

        Assert.assertEquals(fraction, stack.peek());
    }
}
