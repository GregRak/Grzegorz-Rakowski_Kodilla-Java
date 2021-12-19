package com.kodilla.stream.beautifier;

public class Beautifier {

    public static String addABCInTheEnd(String textToEmbellish) {
        return textToEmbellish + " ABC";
    }

    public static String changeIntoUpperCase(String textToEmbellish) {
        String temporaryText = textToEmbellish;
        return temporaryText.toUpperCase();
    }

    public static String charsFrom0To10(String textToEmbellish) {
        String temporaryText = textToEmbellish;
        return temporaryText.substring(0,10);
    }

    public static String eReplaceIntoE(String textToEmbellish) {
        String temporaryText = textToEmbellish;
        return temporaryText.replace("e", "E");
    }
}
