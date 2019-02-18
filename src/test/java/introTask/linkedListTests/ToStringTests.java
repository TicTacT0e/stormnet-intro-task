package introTask.linkedListTests;

import introTask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class ToStringTests {

    @Test
    public void toStringWithEmptyList() {
        Assert.assertEquals(
                "List is empty.", new MyLinkedList<Integer>().toString()
        );
    }

    @Test
    public void toStringWhenListFill() {
        StringBuilder stringBuilder = new StringBuilder();
        MyLinkedList<Integer> list = new MyLinkedList<>();
        int quantity = 10;

        for (int i = 0; i < quantity; i++){
            list.add(i);
            stringBuilder.append(i);
            stringBuilder.append(' ');
        }

        Assert.assertEquals(stringBuilder.toString(), list.toString());
    }
}
