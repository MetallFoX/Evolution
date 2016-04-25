package ru.cardgame.tools;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Тест
 * Created by MetallFoX on 10.04.2016.
 */
public class SimpleShufflerTest {

    SimpleShuffler<Object> shuffler;

    @Before
    public void setUp() {
        shuffler = new SimpleShuffler<>();
    }

    @Test
    public void GivenArrayWithElements_ShuffleShouldChangeOrder() {
        Object[] original = new Object[]{1, 2, 3, 4, 5};
        Object[] shuffled = shuffler.shuffle(original);
        Assert.assertFalse(
                original[0] == shuffled[0]
                        && original[1] == shuffled[1]
                        && original[2] == shuffled[2]
                        && original[3] == shuffled[3]
                        && original[4] == shuffled[4]);
    }

    @Test
    public void GivenArrayWithElements_ShuffleShouldNotChangeOrderOfOriginal() {
        Object[] original = new Object[]{1, 2, 3, 4, 5};
        shuffler.shuffle(original);
        Assert.assertArrayEquals(new Object[]{1, 2, 3, 4, 5}, original);
    }
}
