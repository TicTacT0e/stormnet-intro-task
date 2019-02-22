package introtask.stack;

import introtask.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class SizeTests {

    @Test
    public void sizeBeforePushing() {
        Assert.assertEquals(0, new MyStack<Integer>().size());
    }

    @Test
    public void sizeAfterPushing() {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 4; i++) {
            stack.push(i);
        }

        Assert.assertEquals(4, stack.size());
    }

    @Test
    public void sizeAfterPeek() {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 4; i++){
            stack.push(i);
        }

        int expectedSize = stack.size();
        stack.peek();
        Assert.assertEquals(expectedSize, stack.size());
    }

    @Test
    public void sizeAfterPop() {
        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < 12; i++){
            stack.push(i);
        }

        int size = stack.size();
        for (int i = 0; i < 3; i++) {
            stack.pop();
        }

        Assert.assertEquals(size - 3, stack.size());
    }
}
