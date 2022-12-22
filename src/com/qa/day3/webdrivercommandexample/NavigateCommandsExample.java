package com.qa.day3.webdrivercommandexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class NavigateCommandsExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String pageUrl = "https://demoqa.com/";

        driver.get("https://demoqa.com/books");

        driver.navigate().back();

        driver.navigate().forward();

        driver.findElement(By.linkText("Git Pocket Guide")).click();

        driver.findElement(By.id("addNewRecordButton")).click();

        driver.navigate().to("https://demoqa.com/books?book=9781449325862");

        driver.navigate().refresh();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

        driver.close();
    }




}
