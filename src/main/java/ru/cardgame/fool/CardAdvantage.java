package ru.cardgame.fool;

/**
 * Company:
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class CardAdvantage {

    private String name;
    private String designation;

    public CardAdvantage(String name) {
        this.name = name;
        this.designation = name.substring(0, 1);
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}
