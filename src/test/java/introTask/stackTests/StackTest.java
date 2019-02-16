package introTask.stackTests;

import introTask.MyStack;
import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void testPop() {
        MyStack<Fraction> stack = new MyStack<>();
        stack.push(new Fraction(2, 3));
        System.out.println(stack.peek());
        System.out.println(stack.size());
        Assert.assertEquals(new Fraction(2, 3), stack.pop());
        Assert.assertEquals(0, stack.size());

    }

}
