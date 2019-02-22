package introtask.linkedlist;

import introtask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IsEmptyTests {

    @Test
    public void isEmptyBeforeAddItem() {
        Assert.assertTrue(new MyLinkedList<Integer>().isEmpty());
    }

    @Test
    public void isEmptyAfterAddItem() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void isEmptyAfterRemoveItem() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0);
        list.remove(0);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyAfterGetItem() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0);
        list.get(0);
        Assert.assertFalse(list.isEmpty());
    }
}
