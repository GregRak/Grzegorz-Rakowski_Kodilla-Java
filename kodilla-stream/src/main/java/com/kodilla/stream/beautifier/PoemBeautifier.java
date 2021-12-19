package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    /* public String beautify(String textToEmbellish, String addedText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToEmbellish, addedText);
        System.out.println("Text after embellishment: " + result);
        return result;
    }

     */

    public String beautify(String textToEmbellish, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToEmbellish);
        System.out.println("Text after embellishment: " + result);
        return result;
    }
}
