package ru.mirea.java.task03.human;

import java.util.Arrays;

public class Human {

    private Head head;
    private Leg[] legs;
    private Hand[] hands;

    Human(Head head, Leg[] legs, Hand[] hands) throws Exception {
        if (legs.length > 2 || hands.length > 2) throw new Exception("Only 2 legs / hands are possible.");
        this.head = head;
        this.legs = legs;
        this.hands = hands;
    }

    public Hand[] getHand() {
        return hands;
    }

    public Leg[] getLeg() {
        return legs;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHands(Hand[] hands) {
        this.hands = hands;
    }

    public void setLegs(Leg[] legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head.toString() +
                ", leg=" + Arrays.toString(legs) +
                ", hand=" + Arrays.toString(hands) +
                '}';
    }
}
