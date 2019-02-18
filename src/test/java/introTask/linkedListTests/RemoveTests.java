package introTask.linkedListTests;

import introTask.MyLinkedList;
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

    
}
