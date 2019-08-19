package introtask.stack;

import introtask.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeTests {

    @Test
    public void hashCodeAdditivity() {
        MyStack<Integer> stack0 = new MyStack<>();
        stack0.push(2);
        stack0.push(1);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(2);
        stack1.push(1);

        Assert.assertTrue(stack0.hashCode()
                == stack1.hashCode());
    }

    @Test
    public void hashCodeTest() {
        MyStack<Double> stack0 = new MyStack<>();
        stack0.push(2.0);
        stack0.push(1.0);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(2);
        stack1.push(1);

        Assert.assertFalse(stack0.hashCode()
                == stack1.hashCode());
    }

    @Test
    public void hashCodeSameStack() {
        MyStack<Double> stack = new MyStack<>();
        stack.push(2.0);
        stack.push(1.0);

        Assert.assertTrue(stack.hashCode()
                == stack.hashCode());
    }
}
