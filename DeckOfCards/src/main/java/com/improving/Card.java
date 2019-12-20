package com.improving;

public class Card {

private Suits suit;
private Faces faces;

public Card(Suits suit, Faces faces) {
    this.faces = faces;
    this.suit = suit;
}

@Override
    public String toString() {
    return "" + this.faces + " of " + this.suit;
}

    public Suits getSuit() {
        return suit;
    }

    public Faces getFaces() {
        return faces;
    }
}
