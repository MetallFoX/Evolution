package ru.cardgame;

import java.util.Collection;

/**
 * —брос.
 * <p/>
 * Created by MetallFoX on 10.04.2016.
 */
public interface DiscardPile {

    Collection<Card> getCards();

    void discard(Card card);

    void discard(Collection<Card> cards);

    boolean contains(Card card);

    int getSize();

    boolean isEmpty();
}
