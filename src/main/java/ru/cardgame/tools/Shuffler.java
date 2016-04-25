package ru.cardgame.tools;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public interface Shuffler<T> {
    T[] shuffle(T[] original);
}
