package ru.evolution;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Сброс.
 * <p/>
 * Created by MetallFoX on 21.11.2015.
 */
public class DiscardPileImpl implements DiscardPile {

    private int size;
    private Collection<Card> cards;

    public DiscardPileImpl() {
        cards = new ArrayList<>();
    }

    @Override
    public Collection<Card> getCards() {
        return cards;
    }

    @Override
    public void discard(Card card) {
        cards.add(card);
        size++;
    }

    @Override
    public void discard(Collection<Card> cards) {
        if (cards.isEmpty()) {
            throw new AttemptDiscardZeroCardsException();
        }
        this.cards.addAll(cards);
        size += cards.size();
    }

    @Override
    public boolean contains(Card card) {
        return cards.contains(card);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public class AttemptDiscardZeroCardsException extends RuntimeException {
    }
}
