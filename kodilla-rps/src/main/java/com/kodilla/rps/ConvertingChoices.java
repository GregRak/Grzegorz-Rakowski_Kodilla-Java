package com.kodilla.rps;

public class ConvertingChoices {

    //convert from 1,2,3 keys to kamień, papier, nożyce
    public String key1 = "kamień";
    public String key2 = "papier";
    public String key3 = "nożyce";

    public String choosePlayerReturn(String key) {
        if(key.equals("1")) {
            return "Wybrałeś " + key1;
        } else if (key.equals("2")) {
            return "Wybrałeś " + key2;
        } else if(key.equals("3")) {
            return "Wybrałeś " + key3;
        } else {
            return "Nie rozpoznano wyboru. Spróbuj ponownie" +
                    "\n- klawisz 1 – zagranie \"kamień\"," +
                    "\n- klawisz 2 – zagranie \"papier\"," +
                    "\n- klawisz 3 – zagranie \"nożyce\"";
        }
    }

    public String chooseComputerReturn(int key) {
        if(key == 1) {
            return key1;
        } else if (key == 2) {
            return key2;
        } else {
            return key3;
        }
    }
}
