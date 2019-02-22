package introTask.linkedListTests;

import introTask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RemoveTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenListIsEmpty() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenIndexBiggerThanSize() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(0);
        list.remove(16);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenIndexLessThanZero() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(0);
        list.remove(-4);
    }

    @Test
    public void remove() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        Integer item = 11;
        list.add(item);

        Assert.assertEquals(item, list.remove(0));

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        list.remove(0);
    }
    
}