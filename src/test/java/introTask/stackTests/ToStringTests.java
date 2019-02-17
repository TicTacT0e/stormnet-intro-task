package introTask.stackTests;

import introTask.MyStack;
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
        int capacity = 12;
        MyStack<Integer> stack = new MyStack<>(capacity);
        for (int i = 0; i < capacity / 2; i++){
            stack.push(i);
        }
        Assert.assertEquals("[5, 4, 3, 2, 1, 0]", stack.toString());
    }
}
