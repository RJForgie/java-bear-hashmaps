package com.example.ryanforgie.javabear;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


/**
 * Created by ryanforgie on 05/09/2017.
 */

public class BearTest {
    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo");
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName() );
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void bearCanEat(){
        bear.eat("Monday", 1);
        assertEquals(1, bear.foodCount() );
    }

    @Test
    public void testDayTotals(){
        bear.eat("Monday", 10);
        bear.eat("Tuesday", 5);
        bear.eat("Wednesday", 6);
        assertEquals(10 , bear.dayTotals("Monday"));
        assertEquals(5 , bear.dayTotals("Tuesday"));
    }

}
