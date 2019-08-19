package introtask.list;

import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeTests {

    @Test
    public void hashCodeAdditivity() {
        MyList<Integer> list0 = new MyList<>();
        list0.add(1);
        list0.add(2);
        MyList<Integer> list1 = new MyList<>();
        list1.add(1);
        list1.add(2);

        Assert.assertTrue(list0.hashCode()
                == list1.hashCode());
    }

    @Test
    public void hashCodeTest() {
        MyList<Double> list0 = new MyList<>();
        list0.add(1.0);
        list0.add(2.0);
        MyList<Integer> list1 = new MyList<>();
        list1.add(1);
        list1.add(2);

        Assert.assertFalse(list0.hashCode()
                == list1.hashCode());
    }

    @Test
    public void hashCodeSameList() {
        MyList<Double> list = new MyList<>();
        list.add(1.0);
        list.add(2.0);

        Assert.assertTrue(list.hashCode()
                == list.hashCode());
    }
}
