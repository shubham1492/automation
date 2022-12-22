package com.qa.Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionMouseOverExample2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.ebay.com/";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.linkText("Electronics"));

        Actions actions = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        actions.moveToElement(element).build().perform();

        WebElement element1 = driver.findElement(By.linkText("Smartphones and accessories"));

        actions.moveToElement(element1).click().build().perform();

        String title = driver.findElement(By.className("title-banner__title")).getText();

        if(title.equals("Smartphones & Smartwatches")){
            System.out.println("Validated Home Page");
        }else{
            System.out.println("Not able to validate home page");
        }




    }
}
