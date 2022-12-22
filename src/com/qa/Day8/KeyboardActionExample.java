package com.qa.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.facebook.com/";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("email"));

        WebElement element1 = driver.findElement(By.id("pass"));

        Actions actions = new Actions(driver);

        Action seriesOfAction = actions.moveToElement(element).click()
                .keyDown(element, Keys.SHIFT)
                .sendKeys(element,"hello@gmail.com")
                .keyUp(element,Keys.SHIFT)
                .keyDown(element1,Keys.TAB)
                .sendKeys(element1,"Shubha@122")
                .doubleClick(element)
                .contextClick()
                .build();

        seriesOfAction.perform();
    }
}
