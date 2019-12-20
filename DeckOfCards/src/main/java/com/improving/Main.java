package com.improving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var deck = new Deck();
        List<Card> hand = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            hand.add(deck.draw());
        }
        System.out.println(hand.toString());
        var fiveCards= new Hand(hand, deck);
       // Collections.sort();
        System.out.println(fiveCards.isPair());
    }
}
