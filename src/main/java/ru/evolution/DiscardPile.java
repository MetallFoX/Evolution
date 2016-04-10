package ru.evolution;

import java.util.Collection;

/**
 * Сброс.
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
