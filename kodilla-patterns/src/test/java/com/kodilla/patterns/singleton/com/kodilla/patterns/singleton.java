package com.kodilla.patterns.singleton.com.kodilla.patterns;

import com.kodilla.patterns.singleton.SettingsFileEngine;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class singleton {

    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingFile() {
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName() {
        //Given
        //When
        String result = settingsFileEngine.getFileName();
        System.out.println("Name of the setting file is: " + result);
        //Then
        assertEquals("myapp.settings", result);
    }

    @Test
    void loadSettings() {
        //Given
        //When
        boolean loadSettingsResult = settingsFileEngine.loadSettings();
        //Then
        assertTrue(loadSettingsResult);
    }

    @Test
    void saveSettings() {
        //Given
        //When
        boolean saveSettingsResult = settingsFileEngine.saveSettings();
        //Then
        assertTrue(saveSettingsResult);
    }
}
