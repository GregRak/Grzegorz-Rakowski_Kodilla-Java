package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private String name;
    private String computer = ("Komputer");
    private int numberOfPlayerWins = 0;
    private int numberOfComputerWins = 0;
    private int numberOfRoundToWin;

    public String getName() {
        return name;
    }

    public String getComputer() {
        return computer;
    }

    public int getNumberOfPlayerWins() {
        return numberOfPlayerWins;
    }

    public int getNumberOfComputerWins() {
        return numberOfComputerWins;
    }

    public int getNumberOfRoundToWin() {
        return numberOfRoundToWin;
    }

    public void dataCollection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w naszej grze! Podaj swoje imię");
        this.name = scanner.nextLine();
        System.out.println("Witaj " + this.name + "!" +
                "\nDo ilu zwycięstw chcesz zagrać?");
        this.numberOfRoundToWin = scanner.nextInt();
        System.out.println("Dziękuję! Gramy do " + this.numberOfRoundToWin +
                "!\nZaczynajmy! Twój ruch!");
    }

    public void gamePlay() {
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        ConvertingChoices convert = new ConvertingChoices();
        boolean end = false;
        while(!end) {
            if (this.numberOfPlayerWins == this.numberOfRoundToWin || this.numberOfComputerWins == this.numberOfRoundToWin) {
                System.out.println("Koniec!!!" +
                        "\nWynik gry to: " + this.name + ": " + this.numberOfPlayerWins + " : " + this.numberOfComputerWins + " :" + this.computer);
                end = true;
            } else {
                int playerChooseScan = scanner.nextInt();
                int computerChooseScan = generator.nextInt(2) + 1;
                String playerChoose = convert.chooseReturn(playerChooseScan);
                String computerChoose = convert.chooseReturn(computerChooseScan);
                System.out.println("Wybrałeś " + playerChoose + ", komputer wybrał: " + computerChoose);
                if (playerChooseScan == computerChooseScan) {
                    System.out.println("Remis! Gramy dalej");
                } else if ((playerChooseScan == 1 && computerChooseScan == 3) || (playerChooseScan == 2 && computerChooseScan == 1) ||
                        (playerChooseScan == 3 && computerChooseScan == 2)) {
                    this.numberOfPlayerWins++;
                    System.out.println("Gratulacje! Wygrałeś tę rundę!" +
                            "\nObecny wynik to: " + this.name + ": " + this.numberOfPlayerWins + " : " + this.numberOfComputerWins + " :" + this.computer);
                } else if ((playerChooseScan == 1 && computerChooseScan == 2) || (playerChooseScan == 2 && computerChooseScan == 3) ||
                        (playerChooseScan == 3 && computerChooseScan == 1)) {
                    this.numberOfComputerWins++;
                    System.out.println("Niestety przegrałeś tę rundę..." +
                            "\nObecny wynik to: " + this.name + ": " + this.numberOfPlayerWins + " : " + this.numberOfComputerWins + " :" + this.computer);
                }
            }
        }
    }
}
