package introtask.list;

import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class SizeTests {

    @Test
    public void sizeBeforeAddItem() {
        Assert.assertTrue(0 == new MyList<Integer>().size());
    }

    @Test
    public void sizeAfterAddItems() {
        int quantity = (int) (Math.random() * 666);

        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < quantity; i++) {
            list.add(i);
        }

        Assert.assertTrue(quantity == list.size());
    }

    @Test
    public void sizeAfterRemoveItem() {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.remove(0);

        Assert.assertTrue(0 == list.size());
    }

    @Test
    public void sizeAfterGetItems() {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.get(0);

        Assert.assertTrue(1 == list.size());
    }
}
