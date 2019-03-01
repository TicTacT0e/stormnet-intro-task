package introtask.list;

import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class IsEmptyTests {

    @Test
    public void isEmptyBeforeAddItem() {
        Assert.assertTrue(new MyList<Integer>().isEmpty());
    }

    @Test
    public void isEmptyAfterAddItem() {
        MyList<Integer> list = new MyList<>();
        list.add(0);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void isEmptyAfterRemoveItem() {
        MyList<Integer> list = new MyList<>();
        list.add(0);
        list.remove(0);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void isEmptyAfterGetItem() {
        MyList<Integer> list = new MyList<>();
        list.add(0);
        list.get(0);
        Assert.assertFalse(list.isEmpty());
    }
}
