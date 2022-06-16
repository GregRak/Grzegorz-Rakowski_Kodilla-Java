package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.EBayConfig;
import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.name(EBayConfig.SEARCHFIELD));
        searchField.sendKeys("laptop");
        searchField.submit();

        Thread.sleep(2000);
        if(driver.findElement(By.id(EBayConfig.GDPRBANNER)).isDisplayed()) {
            driver.findElement(By.id(EBayConfig.DECLINECOOKIES)).click();
        }
    }
}
