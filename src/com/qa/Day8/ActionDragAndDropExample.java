package com.qa.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragAndDropExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/drag_drop.html";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement sourceElement = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));

        WebElement destinationElement = driver.findElement(By.xpath("//ol[@id='bank']/li"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(sourceElement,destinationElement).build().perform();

    }

}
