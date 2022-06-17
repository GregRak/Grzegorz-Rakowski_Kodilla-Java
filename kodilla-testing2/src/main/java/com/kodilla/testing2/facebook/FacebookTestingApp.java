package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.FaceBookConfig;
import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cookiesButton = driver.findElement(By.xpath(FaceBookConfig.ACCEPT_COOKIES));
        if(cookiesButton.isDisplayed()) {
            cookiesButton.click();
        }

        driver.findElement(By.xpath(FaceBookConfig.CREATE_NEW_ACOUNT)).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!driver.findElement(By.xpath(FaceBookConfig.DAY_OF_BIRTH)).isDisplayed());

        WebElement dayOfBirth = driver.findElement(By.xpath(FaceBookConfig.DAY_OF_BIRTH));
        Select selectDayOfBirth = new Select(dayOfBirth);
        selectDayOfBirth.selectByIndex(8);

        WebElement monthOfBirth = driver.findElement(By.xpath(FaceBookConfig.MONTH_OF_BIRTH));
        Select selectMonthOfBirth = new Select(monthOfBirth);
        selectMonthOfBirth.selectByIndex(2);

        WebElement yearOfBirth = driver.findElement(By.xpath(FaceBookConfig.YEAR_OF_BIRTH));
        Select selectYearOfBirth = new Select(yearOfBirth);
        selectYearOfBirth.selectByIndex(15);
    }
}
