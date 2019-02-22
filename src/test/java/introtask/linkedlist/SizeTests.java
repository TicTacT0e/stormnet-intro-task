package introtask.linkedlist;

import introtask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class SizeTests {

    @Test
    public void sizeBeforeAddItem() {
        Assert.assertEquals(0, new MyLinkedList<Integer>().size());
    }

    @Test
    public void sizeAfterAddItems() {
        int quantity = (int) (Math.random() * 666);

        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < quantity; i++) {
            list.add(i);
        }

        Assert.assertEquals(quantity, list.size());
    }

    @Test
    public void sizeAfterRemoveItem() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.remove(0);

        Assert.assertEquals(0, list.size());
    }

    @Test
    public void sizeAfterGetItems() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.get(0);

        Assert.assertEquals(1, list.size());
    }
}
