package introTask.linkedListTests;

import introTask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class GetTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWhenListIsEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithIndexBiggerThanSize() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.get(4);
    }

    @Test
    public void get() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Integer item = 11;
        list.add(item);

        Assert.assertEquals(item, list.get(0));
    }
}
