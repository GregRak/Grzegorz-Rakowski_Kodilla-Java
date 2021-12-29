package com.kodilla.rps;

public class Info {

    public static void welcomeText() {
        System.out.println("Witamy w grze kamień - papier - nożyce!");
    }

    public static void startOrEndGame() {
        System.out.println("\nAby rozpocząć nową grę wybierz \"n\"" +
                "\nAby zakończyć wybierz \"x\"");
    }

    public static void infoAboutGame() {
        System.out.println("\nTeraz przedstawimy Ci zasady gry:" +
                "\n- jest to gra dla dwóch graczy" +
                "\n- grasz przeciwko komputerowi" +
                "\nRunda gry polega na równoczesnym zagraniu przez obu graczy jednego z ruchów, tj. kamienia, papieru lub nożyc." +
                "\nWynik rundy:" +
                "\n- remis następuje w przypadku zagrania tego samego ruchu przez obu graczy," +
                "\n- zwycięstwo następuje w przypadku wykonania ruchu bijącego przeciwnika, wedle schematu:" +
                "\n+ kamień zgniata nożyce," +
                "\n+ nożyce tną papier," +
                "\n+ papier przykrywa kamień." +
                "\nPo zakończeniu rundy rozpoczyna się kolejną, aż do osiągnięcia ustalonej liczby wygranych rund przez jednego z graczy." +
                "\n");
    }

    public static void howToPlay() {
        System.out.println("Obsługa gry: " +
                "\n- klawisz 1 – zagranie \"kamień\"," +
                "\n- klawisz 2 – zagranie \"papier\"," +
                "\n- klawisz 3 – zagranie \"nożyce\"," +
                "\n- klawisz x – zakończenie gry," +
                "\n- klawisz n – uruchomienie gry od nowa.");
    }
}
