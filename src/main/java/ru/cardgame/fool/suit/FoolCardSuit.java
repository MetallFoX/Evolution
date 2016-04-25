package ru.cardgame.fool.suit;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class FoolCardSuit implements CardSuit {

    private String name;
    private SuitColor color;

    public FoolCardSuit(String name, SuitColor color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public SuitColor getColor() {
        return color;
    }
}
