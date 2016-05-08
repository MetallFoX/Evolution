package ru.cardgame.tools;

/**
 * Company:
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public interface Shuffler<T> {
    T[] shuffle(T[] original);
}
