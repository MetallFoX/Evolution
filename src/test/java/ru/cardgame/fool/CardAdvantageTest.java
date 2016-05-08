package ru.cardgame.fool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 26.04.2016
 */
public class CardAdvantageTest {

    CardAdvantage advantage;

    @Before
    public void setUp() throws Exception {
        advantage = new CardAdvantage("Валет");
    }

    @Test
    public void cardAdvantageShouldHasName() {
        Assert.assertNotNull(advantage.getName());
    }

    @Test
    public void cardAdvantageShouldHasDesignation() {
        Assert.assertNotNull(advantage.getDesignation());
    }

    @Test
    public void cardDesignationShouldBeFirstSymbolOfName() {
        Assert.assertEquals("В", advantage.getDesignation());
    }
}
