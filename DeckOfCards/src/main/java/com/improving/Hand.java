package com.improving;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    List<Card> hand = new ArrayList<>();
    Deck deck;


public void makeHand() {
    var deck = new Deck();
    List<Card> hand = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
        hand.add(deck.draw());
    }
}


    public Hand(List<Card> hand, Deck deck) {
        this.hand = hand;
        this.deck = deck;
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    public boolean isPair() {
        int temp;
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            temp = hand.get(i).getFaces().ordinal();
            for (int j = 0; j < 5; j++) {
                if (i != j)
                    if (temp == hand.get(j).getFaces().ordinal())
                        counter++;
                if (counter == 2)
                    return true;


            }
        }return false;
    }

}
