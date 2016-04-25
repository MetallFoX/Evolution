package ru.cardgame.fool.suit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class DiamondsSuitTest {


    @Test
    public void diamondsShouldBeRedColored() {
        DiamondsSuit clubs = new DiamondsSuit();
        Assert.assertEquals("red", clubs.getColor().getName());
    }
}
