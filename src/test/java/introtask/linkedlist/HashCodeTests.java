package introtask.linkedlist;

import introtask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeTests {

    @Test
    public void hashCodeAdditivity() {
        MyLinkedList<Integer> list0 = new MyLinkedList<>();
        list0.add(1); list0.add(2);
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(1); list1.add(2);

        Assert.assertEquals(list0.hashCode(), list1.hashCode());
    }
}
