package com.qa.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouseOverExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/newtours/";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.linkText("Home"));

        Actions actions = new Actions(driver);

        actions.moveToElement(element).build().perform();

    }
}
