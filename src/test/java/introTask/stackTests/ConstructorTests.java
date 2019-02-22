package introTask.stackTests;

import introTask.Fraction;
import introtask.MyStack;
import org.junit.Test;

public class ConstructorTests {

    @Test
    public void constructorCorrectData() {
        new MyStack<Fraction>(25);
        new MyStack<Integer>();
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorNegativeSize() {
        new MyStack<String>(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constrictorNullSize() {
        new MyStack<Double>(0);
    }
}
