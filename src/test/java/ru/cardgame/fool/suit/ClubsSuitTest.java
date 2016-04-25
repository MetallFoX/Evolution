package ru.cardgame.fool.suit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class ClubsSuitTest {


    @Test
    public void clubsShouldBeBlackColored() {
        ClubsSuit clubs = new ClubsSuit();
        Assert.assertEquals("black", clubs.getColor().getName());
    }
}
