package introtask.stack;

import introtask.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class ToStringTests {

    @Test
    public void toStringBeforePush() {
        MyStack<Integer> stack = new MyStack<>();
        Assert.assertEquals("Stack is empty.", stack.toString());
    }


    @Test
    public void toStringAfterPush() {
        MyStack<Integer> stack = new MyStack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int capacity = 6;

        stringBuilder.append(' ');
        for (int i = 0; i < capacity; i++) {
            stack.push(i);
            stringBuilder.append(i);
            stringBuilder.append(' ');
        }
        stringBuilder.reverse();
        Assert.assertEquals(stringBuilder.toString(),
                stack.toString());
    }

}
