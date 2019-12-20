package com.improving;

public enum Suits {
    SPADES(1),
    HEARTS(2),
    DIAMONDS(3),
    CLUBS(4);

    private int suitsValue;

    Suits(int suitsValue) {
        this.suitsValue = suitsValue;
    }

    public int getSuitsValue() {
        return suitsValue;
    }
}
