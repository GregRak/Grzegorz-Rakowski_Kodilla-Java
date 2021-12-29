package com.kodilla.rps;

public class ConvertingChoices {

    //convert from 1,2,3 keys to kamień, papier, nożyce
    public String key1 = "kamień";
    public String key2 = "papier";
    public String key3 = "nożyce";

    public String chooseReturn(int key) {
        if(key == 1) {
            return key1;
        } else if (key == 2) {
            return key2;
        } else {
            return key3;
        }
    }
}
