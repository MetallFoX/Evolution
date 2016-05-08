package ru.cardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Колода карт.
 * <p/>
 * Created by MetallFoX on 21.11.2015.
 */
public class GameDeck<T extends Card> implements Deck<T> {

    private int size;
    private LinkedList<T> cards;

    public GameDeck() {
        cards = new LinkedList<>();
    }

    public void put(T card) {
        cards.addFirst(card);
        size++;
    }

    public T take() {
        if (isEmpty()) {
            throw new NotEnoughCardsInDeckException();
        }
        T topCard = cards.removeFirst();
        --size;
        return topCard;
    }

    public Collection<T> take(int numberOfCards) {
        if (numberOfCards == 0) {
            throw new AttemptTakeZeroCardsException();
        }
        if (numberOfCards > size) {
            numberOfCards = size;
        }
        Collection<T> cards = new ArrayList<>(numberOfCards);
        for (int i = 0; i < numberOfCards; i++) {
            cards.add(take());
        }
        return cards;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void setCards(Collection<T> cards) {
        this.cards = new LinkedList<>(cards);
        this.size = cards.size();
    }


    public static class NotEnoughCardsInDeckException extends RuntimeException {
    }

    public static class AttemptTakeZeroCardsException extends RuntimeException {
    }
}
