package ru.cardgame.fool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.cardgame.fool.suit.CardSuit;
import ru.cardgame.fool.suit.FoolCardSuit;
import ru.cardgame.fool.suit.SuitColor;

import java.util.HashSet;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 26.04.2016
 */
public class FoolDeckTest {

    private FoolCardSuit clubs;
    private FoolCardSuit hearts;
    private FoolCardSuit spades;
    private FoolCardSuit diamonds;

    @Before
    public void setUp() throws Exception {
        clubs = new FoolCardSuit("Крести", new SuitColor("black"));
        hearts = new FoolCardSuit("Черви", new SuitColor("red"));
        spades = new FoolCardSuit("Пики", new SuitColor("black"));
        diamonds = new FoolCardSuit("Буби", new SuitColor("red"));
    }

    @Test
    public void newFoolDeckShouldHaveEverySuitOfAdvantage() {
        HashSet<CardSuit> suits = new HashSet<>();
        suits.add(clubs);
        suits.add(hearts);
        suits.add(spades);
        suits.add(diamonds);

        HashSet<CardAdvantage> advantages = new HashSet<>();
        advantages.add(new CardAdvantage("6"));

        FoolDeck deck = new FoolDeck(suits, advantages);

        HashSet<CardSuit> deckSuits = new HashSet<>();
        deckSuits.add(deck.take().getSuit());
        deckSuits.add(deck.take().getSuit());
        deckSuits.add(deck.take().getSuit());
        deckSuits.add(deck.take().getSuit());

        Assert.assertArrayEquals(suits.toArray(), deckSuits.toArray());
    }

    @Test
    public void newFoolDeckShouldHaveEveryAdvantageOfSuit() {
        HashSet<CardSuit> suits = new HashSet<>();
        suits.add(clubs);

        HashSet<CardAdvantage> advantages = new HashSet<>();
        CardAdvantage six = new CardAdvantage("6");
        CardAdvantage ten = new CardAdvantage("10");
        CardAdvantage ace = new CardAdvantage("Туз");

        advantages.add(six);
        advantages.add(ten);
        advantages.add(ace);

        FoolDeck deck = new FoolDeck(suits, advantages);

        Assert.assertEquals(six, deck.take().getAdvantage());
        Assert.assertEquals(ten, deck.take().getAdvantage());
        Assert.assertEquals(ace, deck.take().getAdvantage());
    }
}
