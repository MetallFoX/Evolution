package ru.cardgame;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Сброс.
 * <p/>
 * Created by MetallFoX on 21.11.2015.
 */
public class GameDiscardPile implements DiscardPile {

    private int size;
    private Collection<Card> cards;

    public GameDiscardPile() {
        cards = new ArrayList<>();
    }

    public Collection<Card> getCards() {
        return cards;
    }

    public void discard(Card card) {
        cards.add(card);
        size++;
    }

    public void discard(Collection<Card> cards) {
        if (cards.isEmpty()) {
            throw new AttemptDiscardZeroCardsException();
        }
        this.cards.addAll(cards);
        size += cards.size();
    }

    public boolean contains(Card card) {
        return cards.contains(card);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public class AttemptDiscardZeroCardsException extends RuntimeException {
    }
}
