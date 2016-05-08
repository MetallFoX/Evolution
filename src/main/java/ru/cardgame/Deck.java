package ru.cardgame;

import java.util.Collection;

/**
 * Колода.
 * <p/>
 * Created by MetallFoX on 10.04.2016.
 */
public interface Deck<T extends Card> {

    boolean isEmpty();

    int getSize();

    void put(T card);

    T take();

    Collection<T> take(int numberOfCards);
}
