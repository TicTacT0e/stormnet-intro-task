package introTask.stackTests;

import introTask.Fraction;
import introTask.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class IsEmptyTests {

    @Test
    public void isEmptyBeforePushing() {
        Assert.assertTrue(new MyStack<Fraction>(5).isEmpty());
    }

    @Test
    public void isEmptyAfterPushing() {
        MyStack<String> stack = new MyStack<>();
        stack.push("test");
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void isEmptyAfterPop() {
        MyStack<String> stack = new MyStack<>();
        stack.push("test");
        stack.pop();
        Assert.assertTrue(stack.isEmpty());

    }
}
