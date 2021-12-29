package com.kodilla.rps;

public class EndGame {

    private int numberOfPlayerWinsEnd = 0;
    private int numberOfComputerWinsEnd = 0;
    private int numberOfRoundToWinEnd;


    public void addNumberOfPlayerWins() {
        numberOfPlayerWinsEnd++;
    }

    public void addNumberOfComputerWins() {
        numberOfComputerWinsEnd++;
    }

    public void setNumberOfRoundToWin(int numberOfRoundToWin) {
        this.numberOfRoundToWinEnd = numberOfRoundToWin;
    }

    public void endGame() {
        System.out.println(this.numberOfPlayerWinsEnd);
        System.out.println(this.numberOfRoundToWinEnd);
        System.out.println(this.numberOfComputerWinsEnd);
        if(this.numberOfPlayerWinsEnd == this.numberOfRoundToWinEnd) {
            System.out.println("Gratulacje!!! Wygrałeś tę grę!" + "\nCzy chcesz zagrać ponownie?");
            Info.startOrEndGame();
        } else if(this.numberOfComputerWinsEnd == this.numberOfRoundToWinEnd){
            System.out.println("Niestety tym razem się nie udało..." + "\nCzy chcesz spróbować ponownie?");
            Info.startOrEndGame();
        }
    }
}
