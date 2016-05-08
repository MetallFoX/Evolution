package ru.cardgame.fool;

import ru.cardgame.GameDeck;
import ru.cardgame.fool.suit.CardSuit;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

/**
 * Company: R-Style Softlab
 * Author: alex.anikeev
 * Date: 26.04.2016
 */
public class FoolDeck extends GameDeck<FoolCard> {

    public FoolDeck(Set<CardSuit> suits, Set<CardAdvantage> advantages) {
        Collection<FoolCard> cards = new LinkedList<>();
        for (CardSuit suit : suits) {
            for (CardAdvantage advantage : advantages) {
                cards.add(new FoolCard(advantage, suit));
            }
        }
        setCards(cards);
    }
}
