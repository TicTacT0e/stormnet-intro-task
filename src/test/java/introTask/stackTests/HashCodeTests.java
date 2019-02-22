package introTask.stackTests;

import introtask.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeTests {

    @Test
    public void hashCodeAdditivity() {
        MyStack<Integer> stack0 = new MyStack<>();
        stack0.push(2); stack0.push(1);
        MyStack<Integer> stack1 = new MyStack<>();
        stack1.push(2); stack1.push(1);

        Assert.assertEquals(stack0.hashCode(), stack1.hashCode());
    }
}
