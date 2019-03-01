package introtask.list;

import introtask.Fraction;
import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class AddTests {

    @Test
    public void someTest() {
        MyList<Integer> list = new MyList<>();

        list.add(0);
        list.add(1);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

        list.add(55 ,1);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

        list.add(66, 0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

        list.add(13, list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

        list.remove(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();

    }

    @Test
    public void add() {
        MyList<Fraction> list = new MyList<>();
        list.add(new Fraction(1, 2), 0);
        list.add(new Fraction(1, 3), 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithIndexBiggerThanSize() {
        MyList<Fraction> list = new MyList<>();

        list.add(new Fraction(1, 2), 55);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithIndexLessThanZero() {
        MyList<Fraction> list = new MyList<>();

        list.add(new Fraction(1, 2), -2);
    }

    @Test
    public void addWithIndex() {
        MyList<Fraction> list = new MyList<>();
        Fraction specialFraction = new Fraction(1);
        int indexOfSpecialFraction = 4;
        int quantityOfItems = 6;

        for (int i = 0; i < quantityOfItems; i++) {
            list.add(new Fraction(i + 1, (i + 1) * 3));
        }
        list.add(specialFraction, indexOfSpecialFraction);

        Assert.assertEquals(specialFraction, list.get(indexOfSpecialFraction));
    }
}
