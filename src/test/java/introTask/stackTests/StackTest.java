package introTask.stackTests;

import introTask.CustomStack;
import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void testPop(){
        CustomStack<Fraction> stack = new CustomStack<>(Fraction.class, 5);
        stack.push(new Fraction(2,3));
        System.out.println(stack.peek());
        System.out.println(stack.size());
        Assert.assertEquals(new Fraction(2, 3), stack.pop());
        Assert.assertEquals(0, stack.size());
    }

}
