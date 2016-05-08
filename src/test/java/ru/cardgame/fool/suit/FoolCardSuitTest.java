package ru.cardgame.fool.suit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Company:
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class FoolCardSuitTest {

    private FoolCardSuit suit;

    @Before
    public void setUp() throws Exception {
        suit = new FoolCardSuit("Черви", new SuitColor("red"));
    }

    @Test
    public void foolCardSuitShouldHasName() {
        Assert.assertNotNull(suit.getName());
    }

    @Test
    public void foolCardSuitShouldHasColor() {
        Assert.assertNotNull(suit.getColor());
    }
}