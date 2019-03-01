package introtask.list;

import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class GetTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWhenListIsEmpty() {
        MyList<Integer> list = new MyList<>();
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithIndexBiggerThanSize() {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.get(4);
    }

    @Test
    public void get() {
        MyList<Integer> list = new MyList<>();
        Integer item = 11;
        list.add(item);

        Assert.assertEquals(item, list.get(0));
    }
}
