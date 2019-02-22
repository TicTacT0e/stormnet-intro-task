package introtask.stack;

import introtask.Fraction;
import introtask.MyStack;
import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

public class PopTests {

    @Test(expected = EmptyStackException.class)
    public void popBeforePushing() {
        new MyStack<Fraction>().pop();
    }

    @Test
    public void popAfterPushing() {
        MyStack<Fraction> stack = new MyStack<>();
        Fraction fraction = new Fraction(1, 3);
        stack.push(fraction);
        Assert.assertEquals(fraction, stack.pop());
    }
}
