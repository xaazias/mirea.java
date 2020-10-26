package ru.mirea.java.task16;

public class Test {

    public static void main(String[] args) {

        CardGame game = new CardGame();
        System.out.println(" - Исходное состояние игроков:\n" + game.toString());

        game.playGame();
        System.out.println("\n - Конец игры:\n" + game.toString());

        System.out.println("\n - Результат:\n" + game.getWinner());
    }
}
