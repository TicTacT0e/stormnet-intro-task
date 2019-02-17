package introTask.linkedListTests;

import introTask.MyLinkedList;
import org.junit.Test;

public class firstTest {

    @Test
    public void addTest() {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(666, 5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
