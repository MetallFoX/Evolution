package ru.cardgame.fool;

import ru.cardgame.Card;
import ru.cardgame.fool.suit.CardSuit;

/**
 * Company:
 * Author: alex.anikeev
 * Date: 25.04.2016
 */
public class FoolCard implements Card {

    private CardAdvantage advantage;
    private CardSuit suit;

    public FoolCard(CardAdvantage advantage, CardSuit suit) {
        this.advantage = advantage;
        this.suit = suit;
    }

    public CardAdvantage getAdvantage() {
        return advantage;
    }

    public CardSuit getSuit() {
        return suit;
    }
}
