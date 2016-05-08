package ru.cardgame;

import org.junit.Before;
import org.junit.Test;
import ru.cardgame.evolution.GameCard;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Тесты сброса.
 * <p/>
 * Created by MetallFoX on 21.11.2015.
 */
public class GameDiscardPileTest {

    private GameDiscardPile pile;

    @Before
    public void setUp() {
        pile = new GameDiscardPile();
    }

    @Test
    public void NewlyCreatedDrop_ShouldBeEmpty() throws Exception {
        assertEquals(0, pile.getSize());
        assertTrue(pile.isEmpty());
    }

    @Test
    public void WhenOneDiscarded_DiscardPileSizeShouldBeOne() throws Exception {
        Card card = new GameCard();
        pile.discard(card);
        assertEquals(1, pile.getSize());
    }

    @Test
    public void WhenOneAndTwoDiscardedAtOneTime_DiscardPileSizeShouldBeTwo() throws Exception {
        Collection<Card> cards = new ArrayList<>();
        Card card1 = new GameCard();
        Card card2 = new GameCard();
        cards.add(card1);
        cards.add(card2);

        pile.discard(cards);
        assertEquals(2, pile.getSize());
    }

    @Test
    public void WhenOneAndTwoDiscardedAtOneTime_DiscardPileShouldContainOneAndTwo() throws Exception {
        Collection<Card> cards = new ArrayList<>();
        Card card1 = new GameCard();
        Card card2 = new GameCard();
        cards.add(card1);
        cards.add(card2);

        pile.discard(cards);
        assertArrayEquals(new Card[]{card1, card2}, pile.getCards().toArray());
    }

    @Test
    public void WhenOneAndTwoDiscarded_DiscardPaleShouldContainOneAndTwo() throws Exception {
        Card card1 = new GameCard();
        Card card2 = new GameCard();

        pile.discard(card1);
        pile.discard(card2);

        assertArrayEquals(new Card[]{card1, card2}, pile.getCards().toArray());
    }

    @Test
    public void WhenOneDiscarded_DiscardPaneShouldContainOne() throws Exception {
        Card card = new GameCard();
        pile.discard(card);

        assertTrue(pile.contains(card));
    }

    @Test(expected = GameDiscardPile.AttemptDiscardZeroCardsException.class)
    public void WhenAttemptsZeroCardsDiscard_ShouldThrow() throws Exception {
        pile.discard(new ArrayList<Card>());
    }
}
