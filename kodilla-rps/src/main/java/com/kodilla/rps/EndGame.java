package com.kodilla.rps;

public class EndGame {
    public void endGame() {
        Game game = new Game();
        if(game.getNumberOfPlayerWins() == game.getNumberOfRoundToWin()) {
            System.out.println("Gratulacje!!! Wygrałeś tę grę!" + "\nCzy chcesz zagrać ponownie?");
            Info.startOrEndGame();
        } else if(game.getNumberOfComputerWins()== game.getNumberOfRoundToWin()) {
            System.out.println("Niestety tym razem się nie udało..." + "\nCzy chcesz spróbować ponownie?");
            Info.startOrEndGame();
        }
    }
}
