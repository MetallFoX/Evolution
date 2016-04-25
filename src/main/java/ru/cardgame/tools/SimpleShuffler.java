package ru.cardgame.tools;

import java.util.Arrays;

/**
 * Реализация простейшего перемешивальщика.
 * <p/>
 * Created by MetallFoX on 10.04.2016.
 */
public class SimpleShuffler<T> implements Shuffler<T> {

    public T[] shuffle(T[] original) {
        int n = original.length;
        T[] shuffled = Arrays.copyOf(original, n);
        for (int i = 0; i < n; i++) {
            int newIndex = i + (int) (Math.random() * (n - i));
            exchange(shuffled, i, newIndex);
        }
        return shuffled;
    }

    private void exchange(T[] a, int i, int j) {
        T swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}