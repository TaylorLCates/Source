package com.improving;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

    private final List<Card> cards = new ArrayList<>();
    private final List<Card> discardPile = new ArrayList<>();
    private Random random = new Random();

    public Deck() {
        for ( Suits s : Suits.values()) {
            for ( Faces r: Faces.values() ) {
                cards.add(new Card(s, r));
            }
        }
    }

    public Card draw() {
        var randomIndex = random.nextInt(cards.size());
        //System.out.println(cards.size());
        var card = cards.get(randomIndex);
        cards.remove(randomIndex);
        discardPile.add(card);
        return card;
    }

}
