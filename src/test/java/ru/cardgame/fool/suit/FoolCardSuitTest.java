package ru.cardgame.fool.suit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class FoolCardSuitTest {

    @Test
    public void foolCardSuitShouldHasName() {
        FoolCardSuit suit = new FoolCardSuit("Крести", new SuitColor("red"));
        Assert.assertNotNull(suit.getName());
    }

    @Test
    public void foolCardSuitShouldHasColor() {
        FoolCardSuit suit = new FoolCardSuit("Крести", new SuitColor("red"));
        Assert.assertNotNull(suit.getColor());
    }
}