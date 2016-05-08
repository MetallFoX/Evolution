package ru.cardgame.fool;

import org.junit.Assert;
import org.junit.Test;
import ru.cardgame.fool.suit.FoolCardSuit;
import ru.cardgame.fool.suit.SuitColor;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class FoolCardTest {

    @Test
    public void foolCardShouldHasAdvantage() {
        CardAdvantage advantage = new CardAdvantage("Валет");
        FoolCardSuit suit = new FoolCardSuit("Крести", new SuitColor("black"));
        FoolCard card = new FoolCard(advantage, suit);

        Assert.assertNotNull(card.getAdvantage());
    }

    @Test
    public void foolCardShouldHasSuit() {
        CardAdvantage advantage = new CardAdvantage("Валет");
        FoolCardSuit suit = new FoolCardSuit("Крести", new SuitColor("black"));
        FoolCard card = new FoolCard(advantage, suit);

        Assert.assertNotNull(card.getSuit());
    }
}
