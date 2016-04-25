package ru.cardgame.fool.suit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class SpadesSuitTest {


    @Test
    public void spadesShouldBeBlackColored() {
        SpadesSuit spades = new SpadesSuit();
        Assert.assertEquals("black", spades.getColor().getName());
    }
}
