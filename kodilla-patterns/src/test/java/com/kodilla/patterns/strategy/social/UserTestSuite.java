package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User andrew = new Millenials("Andrew");
        User hanah = new YGeneration("Hanah");
        User matilde = new ZGeneration("Matilde");
        //When
        String andrewSocial = andrew.sharePost();
        System.out.println("Andrew's default social medium is: " + andrewSocial);
        String hanahSocial = hanah.sharePost();
        System.out.println("Hanah's default social medium is: " + hanahSocial);
        String matildeSocial = matilde.sharePost();
        System.out.println("Matilde's default social medium is: " + matildeSocial);
        //Then
        assertEquals("[Facebook] This user uses Facebook by default", andrewSocial);
        assertEquals("[Twitter] This user uses Twitter by default", hanahSocial);
        assertEquals("[Snapchat] This user uses Snapchat by default", matildeSocial);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User andrew = new Millenials("Andrew");
        //When
        String andrewSocial = andrew.sharePost();
        System.out.println("Andrew's default social medium is: " + andrewSocial);
        andrew.setSocialPublisher(new TwitterPublisher());
        andrewSocial = andrew.sharePost();
        System.out.println("Andrew's changed social medium is: " + andrewSocial);
        //Then
        assertEquals("[Twitter] This user uses Twitter by default", andrewSocial);
    }
}
