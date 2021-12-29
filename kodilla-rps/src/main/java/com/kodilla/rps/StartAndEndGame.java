package com.kodilla.rps;

import java.util.Scanner;

public class StartAndEndGame {

    public void playingGame() {

        Info.welcomeText();
        Info.startOrEndGame();
        Scanner scannerPlay = new Scanner(System.in);

        boolean endLoop = false;
        while (!endLoop) {
            String choose = scannerPlay.nextLine();
            if (choose.contains("n")) {
                Info.infoAboutGame();
                Info.howToPlay();
                Game game1 = new Game();
                EndGame endGame = new EndGame();
                game1.dataCollection();
                game1.gamePlay();
                endGame.endGame();
            } else if(choose.contains("x")) {
                System.out.println("Dziękujemy za grę! Zapraszamy ponownie!");
                endLoop = true;
            } else {
                System.out.println("Nie rozpoznano wyboru. Spróbuj ponownie");
                Info.startOrEndGame();
            }
        }
    }
}
