package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private String name;
    private String computer = ("Komputer");
    private int numberOfPlayerWins = 0;
    private int numberOfComputerWins = 0;
    private int numberOfRoundToWin;
    private String choiceNumberOfROundToWin;

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
        boolean checkerLoop = false;
        System.out.println("Witaj w naszej grze! Podaj swoje imię");
        this.name = scanner.nextLine();
        System.out.println("Witaj " + this.name + "!" +
                "\nDo ilu zwycięstw chcesz zagrać?\nMożesz wybrać od 1 do 9");

        while(!checkerLoop) {
            this.choiceNumberOfROundToWin = scanner.next();
            if (ScannerChecker.checker(choiceNumberOfROundToWin)) {
                this.numberOfRoundToWin = Integer.valueOf(choiceNumberOfROundToWin);
                System.out.println("Dziękuję! Gramy do " + this.numberOfRoundToWin + "!");
                checkerLoop = true;
            } else {
                System.out.println("Nie rozpoznano wyboru. Spróbuj ponownie" +
                        "\nDo ilu zwycięstw chcesz zagrać?\nMożesz wybrać od 1 do 9");
            }
        }
    }

    public void gamePlay() {
        System.out.println("\nZaczynajmy! Twój ruch!");
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();
        ConvertingChoices convert = new ConvertingChoices();
        EndGame endGame = new EndGame();
        endGame.setNumberOfRoundToWin(this.numberOfRoundToWin);
        boolean end = false;
        while(!end) {
            if (this.numberOfPlayerWins == this.numberOfRoundToWin || this.numberOfComputerWins == this.numberOfRoundToWin) {
                System.out.println("Koniec!!!" +
                        "\nWynik gry to: " + this.name + ": " + this.numberOfPlayerWins + " : " + this.numberOfComputerWins + " :" + this.computer);
                endGame.endGame();
                end = true;
            } else {
      //          int playerChooseScan = scanner.nextInt();
                String playerChooseScan = scanner.nextLine();
                int computerChooseScan = generator.nextInt(2) + 1;
                String playerChoose = convert.choosePlayerReturn(playerChooseScan);
                String computerChoose = convert.chooseComputerReturn(computerChooseScan);
                System.out.println(playerChoose + ",\n komputer wybrał: " + computerChoose);
                if ((playerChooseScan.equals("1") && computerChooseScan == 1) || (playerChooseScan.equals("2") && computerChooseScan == 2) ||
                        (playerChooseScan.equals("3") && computerChooseScan == 3)) {
                    System.out.println("Remis! Gramy dalej");
                } else if ((playerChooseScan.equals("1") && computerChooseScan == 3) || (playerChooseScan.equals("2") && computerChooseScan == 1) ||
                        (playerChooseScan.equals("3") && computerChooseScan == 2)) {
                    this.numberOfPlayerWins++;
                    endGame.addNumberOfPlayerWins();
                    System.out.println("Gratulacje! Wygrałeś tę rundę!" +
                            "\nObecny wynik to: " + this.name + ": " + this.numberOfPlayerWins + " : " + this.numberOfComputerWins + " :" + this.computer);
                } else if ((playerChooseScan.equals("1") && computerChooseScan == 2) || (playerChooseScan.equals("2") && computerChooseScan == 3) ||
                        (playerChooseScan.equals("3") && computerChooseScan == 1)) {
                    this.numberOfComputerWins++;
                    endGame.addNumberOfComputerWins();
                    System.out.println("Niestety przegrałeś tę rundę..." +
                            "\nObecny wynik to: " + this.name + ": " + this.numberOfPlayerWins + " : " + this.numberOfComputerWins + " :" + this.computer);
                }
            }
        }
    }
}
