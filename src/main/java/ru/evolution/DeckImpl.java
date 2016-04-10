package ru.evolution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Колода карт.
 * <p/>
 * Created by MetallFoX on 21.11.2015.
 */
public class DeckImpl implements Deck {

    private int size;
    private LinkedList<Card> cards;

    public DeckImpl() {
        cards = new LinkedList<>();
    }

    @Override
    public void put(Card card) {
        cards.addFirst(card);
        size++;
    }

    @Override
    public Card take() {
        if (isEmpty()) {
            throw new NotEnoughCardsInDeckException();
        }
        Card topCard = cards.removeFirst();
        --size;
        return topCard;
    }

    @Override
    public Collection<Card> take(int numberOfCards) {
        if (numberOfCards == 0) {
            throw new AttemptTakeZeroCardsException();
        }
        Collection<Card> cards = new ArrayList<>(numberOfCards);
        for (int i = 0; i < numberOfCards; i++) {
            cards.add(take());
        }
        return cards;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }


    public class NotEnoughCardsInDeckException extends RuntimeException {
    }

    public class AttemptTakeZeroCardsException extends RuntimeException {
    }
}
