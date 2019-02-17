package introTask.stackTests;

import introTask.Fraction;
import introTask.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class EqualTests {

    @Test
    public void equalsEmptyStack() {
        Assert.assertTrue(
                new MyStack<Integer>().equals(new MyStack<Integer>())
        );
    }

    @Test
    public void equalsSameStack() {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);

        Assert.assertTrue(stack.equals(stack));
    }

    @Test
    public void equalsStack() {
        MyStack<Integer> stack0 = new MyStack<>();
        stack0.push(1); stack0.push(2);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1);

        Assert.assertFalse(stack0.equals(stack1));
    }

    @Test
    public void equalsAfterPeek() {
        MyStack<Integer> stack0 = new MyStack<>();
        stack0.push(1);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1);

        stack0.peek();

        Assert.assertTrue(stack0.equals(stack1));
    }

    @Test
    public void equalsAfterPop() {
        MyStack<Integer> stack0 = new MyStack<>();
        stack0.push(1);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1);

        stack0.pop();

        Assert.assertFalse(stack0.equals(stack1));
    }


    @Test
    public void equalsAdditivity() {
        MyStack<Integer> stack0 = new MyStack<>();
        stack0.push(1); stack0.push(2);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(1); stack1.push(2);

        Assert.assertEquals(
                stack0.equals(stack1), stack1.equals(stack0)
        );
    }

    @Test
    public void equalsStackWithDifferentTypes() {
        MyStack<Fraction> stack0 = new MyStack<>();
        MyStack<Integer> stack1 = new MyStack<>();

        stack0.push(new Fraction(1, 2));
        stack1.push(2);

        Assert.assertFalse(stack0.equals(stack1));
    }

    @Test
    public void equalsNull() {
        Assert.assertFalse(new MyStack<Fraction>().equals(null));
    }

    @Test
    public void equalsDifferentObject() {
        Assert.assertFalse(
                new MyStack<String>().equals(new Fraction(1))
        );
    }
}
