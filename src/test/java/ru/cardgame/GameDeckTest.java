package ru.cardgame;

import org.junit.Before;
import org.junit.Test;
import ru.cardgame.evolution.GameCard;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Тесты колоды.
 * <p/>
 * Created by MetallFoX on 21.11.2015.
 */
public class GameDeckTest {

    private GameDeck<Card> deck;

    @Before
    public void setUp() {
        deck = new GameDeck<>();
    }

    @Test
    public void DeckWithoutCards_ShouldBeEmpty() throws Exception {
        assertTrue(deck.isEmpty());
        assertEquals(0, deck.getSize());
    }

    @Test
    public void AfterOnePut_DeckSizeShouldBeOne() throws Exception {
        GameCard card = new GameCard();
        deck.put(card);
        assertFalse(deck.isEmpty());
        assertEquals(1, deck.getSize());
    }



    @Test
    public void AfterOnePutAndOneTake_DeckShouldBeEmpty() throws Exception {
        Card card = new GameCard();
        deck.put(card);
        deck.take();
        assertEquals(0, deck.getSize());
        assertTrue(deck.isEmpty());
    }

    @Test
    public void AfterTwoPutAndOneTake_DeckSizeShouldBeOne() throws Exception {
        Card card1 = new GameCard();
        Card card2 = new GameCard();
        deck.put(card1);
        deck.put(card2);

        deck.take();
        assertEquals(1, deck.getSize());
    }

    @Test(expected = GameDeck.NotEnoughCardsInDeckException.class)
    public void GivenEmptyDeck_AnyTakeShouldThrowNotEnoughCardsInDeckException() throws Exception {
        deck.take();
    }

    @Test
    public void GivenDeckWithOneCard_TakeTwoAtOneTimeShouldTakeJustOne() throws Exception {
        Card card = new GameCard();
        deck.put(card);
        Collection<Card> taken = deck.take(2);
        assertEquals(1, taken.size());
    }

    @Test
    public void GivenDeckWithTwoCards_AfterTakeTwoAtOneTime_DeckShouldBeEmpty() throws Exception {
        Card card1 = new GameCard();
        Card card2 = new GameCard();

        deck.put(card1);
        deck.put(card2);

        deck.take(2);
        assertTrue(deck.isEmpty());
    }


    @Test(expected = GameDeck.AttemptTakeZeroCardsException.class)
    public void WhenTakesZeroCards_ShouldThrowAttemptTakeZeroCardsException() throws Exception {
        deck.take(0);
    }

    @Test
    public void WhenOneTwoCardsPut_TwoOneCardsTaken() {
        Card card1 = new GameCard();
        Card card2 = new GameCard();

        deck.put(card1);
        deck.put(card2);

        assertEquals(card2, deck.take());
        assertEquals(card1, deck.take());
    }

    @Test
    public void WhenOneTwoCardsPut_TwoOneCardsTakenAtOneTime() {
        Card card1 = new GameCard();
        Card card2 = new GameCard();

        deck.put(card1);
        deck.put(card2);

        Collection<Card> cards = deck.take(2);
        assertArrayEquals(new Card[]{card2, card1}, cards.toArray());
    }
}
