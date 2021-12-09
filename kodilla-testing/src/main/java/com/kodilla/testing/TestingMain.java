package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        Calculator calculator = new Calculator(20,12);

        int addResult = calculator.addAToB();
        int substractResult = calculator.subAFromB();

        if (addResult==(calculator.getNumberA()+ calculator.getNumberB())) {
            System.out.println("Calculator function: addition - OK");
        } else {
            System.out.println("Calculator function: addition - Error!");
        }

        if (substractResult==(calculator.getNumberA()- calculator.getNumberB())) {
            System.out.println("Calculator function: substraction - OK");
        } else {
            System.out.println("Calculator function: substraction - Error!");
        }


    }
}
