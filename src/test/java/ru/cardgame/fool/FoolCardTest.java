package ru.cardgame.fool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.cardgame.fool.suit.FoolCardSuit;
import ru.cardgame.fool.suit.SuitColor;

/**
 * Company:
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class FoolCardTest {

    private FoolCard card;

    @Before
    public void setUp() throws Exception {
        CardAdvantage advantage = new CardAdvantage("Валет");
        FoolCardSuit suit = new FoolCardSuit("Крести", new SuitColor("black"));
        card = new FoolCard(advantage, suit);
    }

    @Test
    public void foolCardShouldHasAdvantage() {
        Assert.assertNotNull(card.getAdvantage());
    }

    @Test
    public void foolCardShouldHasSuit() {
        Assert.assertNotNull(card.getSuit());
    }
}
