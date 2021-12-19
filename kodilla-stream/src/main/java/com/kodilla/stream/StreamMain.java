package com.kodilla.stream;

import com.kodilla.stream.beautifier.Beautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nTexts after use lambdas");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("To jest pierwszy tekst do upiększenia",
                (textToEmbellish) -> textToEmbellish.concat(" ABC"));
        poemBeautifier.beautify("To jest drugi tekst do upiększenia",
                (textToEmbellish) -> textToEmbellish.toUpperCase());
        poemBeautifier.beautify("To jest trzeci tekst do upiększenia",
                (textToEmbellish -> textToEmbellish.replace("e","E")));
        poemBeautifier.beautify("To jest czwarty tekst do upiększenia",
                textToEmbellish -> textToEmbellish.repeat(2));

        System.out.println("\nTexts from class Beautifier");
        poemBeautifier.beautify("To jest pierwszy tekst do upiększenia",
                Beautifier::addABCInTheEnd);
        poemBeautifier.beautify("To jest drugi tekst do upiększenia",
                Beautifier::changeIntoUpperCase);
        poemBeautifier.beautify("To jest trzeci tekst do upiększenia",
                Beautifier::charsFrom0To10);
        poemBeautifier.beautify("To jest czwarty tekst do upiększenia",
                Beautifier::eReplaceIntoE);
    }
}
