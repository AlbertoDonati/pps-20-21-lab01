import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import lab01.tdd.SelectStrategy;
import lab01.tdd.StrategyImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    public CircularListImpl list;
    public StrategyImpl strategy;

    @BeforeEach
    public void newList() {
        list = new CircularListImpl();
    }

    @Test
    public void testAdd() {
        list.add(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testSize() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testNext() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.myIndex = list.size()-1;
        assertEquals(Optional.of(1), list.next());
        assertEquals(Optional.of(2), list.next());
        assertEquals(Optional.of(3), list.next());
        assertEquals(Optional.of(1), list.next());
    }

    @Test
    public void testPrevious() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.myIndex = list.size()-1;
        assertEquals(Optional.of(1), list.next());
        assertEquals(Optional.of(2), list.next());
        assertEquals(Optional.of(3), list.next());
        assertEquals(Optional.of(1), list.next());
    }

    @Test
    public void testIsEmpty(){
        list.add(1);
        Assertions.assertFalse(list.isEmpty());
    }

    /*
    @Test
    public void testEvenStrategy(){
        list.add(1);
        list.add(2);
        list.add(3);
        list.myIndex = list.size()-1;
        Assertions.assertTrue(strategy.evenStrategy(Optional.of(1)));
    }
    */


}
