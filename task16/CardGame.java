package ru.mirea.java.task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardGame {

    private final List<Integer> firstPlayer = new ArrayList<>();
    private final List<Integer> secondPlayer = new ArrayList<>();

    private int steps = 0;
    private String winner;

    CardGame() {
        dealCards();
    }

    private void dealCards() {

        List<Integer> cards = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(cards);

        for (int i = 0; i < cards.size(); i++){
            if (i < 5) this.firstPlayer.add(cards.get(i));
            else this.secondPlayer.add(cards.get(i));
        }
    }

    private void makeStep(int firstPlayerCard, int secondPlayerCard) {
        if (firstPlayerCard == 0 && secondPlayerCard == 9) firstPlayerStepWin(firstPlayerCard, secondPlayerCard);
        else if (firstPlayerCard == 9 && secondPlayerCard == 0) secondPlayerStepWin(firstPlayerCard, secondPlayerCard);
        else if (firstPlayerCard > secondPlayerCard) firstPlayerStepWin(firstPlayerCard, secondPlayerCard);
        else secondPlayerStepWin(firstPlayerCard, secondPlayerCard);
    }

    private void firstPlayerStepWin(int firstPlayerCard, int secondPlayerCard) {
        this.secondPlayer.remove(0);
        this.firstPlayer.remove(0);
        this.firstPlayer.add(firstPlayerCard);
        this.firstPlayer.add(secondPlayerCard);
    }

    private void secondPlayerStepWin(int firstPlayerCard, int secondPlayerCard) {
        this.firstPlayer.remove(0);
        this.secondPlayer.remove(0);
        this.secondPlayer.add(firstPlayerCard);
        this.secondPlayer.add(secondPlayerCard);
    }

    public void playGame() {

        while (firstPlayer.size() != 0 && secondPlayer.size() != 0) {
            this.steps++;
            if (this.steps < 107) makeStep(this.firstPlayer.get(0), this.secondPlayer.get(0));
            else break;
        }

        this.winner = firstPlayer.size() == 0 ? "second" : secondPlayer.size() == 0 ? "first" : null;
    }

    public String getWinner() {
        if (this.winner != null) return ("Победитель: " + this.winner + " игрок, с кол-вом ходов: " + this.steps);
        else return ("botva");
    }

    @Override
    public String toString() {
        return "CardGame{" +
                "firstPlayer=" + firstPlayer +
                ", secondPlayer=" + secondPlayer +
                ", steps=" + steps +
                ", winner='" + winner + '\'' +
                '}';
    }
}
