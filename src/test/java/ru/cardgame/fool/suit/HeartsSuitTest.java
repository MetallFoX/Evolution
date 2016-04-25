package ru.cardgame.fool.suit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class HeartsSuitTest {


    @Test
    public void heartsShouldBeRedColored() {
        HeartsSuit hearts = new HeartsSuit();
        Assert.assertEquals("red", hearts.getColor().getName());
    }
}
