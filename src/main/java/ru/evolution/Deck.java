package ru.evolution;

import java.util.Collection;

/**
 * Колода.
 * <p/>
 * Created by MetallFoX on 10.04.2016.
 */
public interface Deck {

    boolean isEmpty();

    int getSize();

    void put(Card card);

    Card take();

    Collection<Card> take(int numberOfCards);
}
