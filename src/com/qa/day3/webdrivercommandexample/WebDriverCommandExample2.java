package com.qa.day3.webdrivercommandexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandExample2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String pageUrl = "https://demoqa.com/browser-windows/";

        driver.get(pageUrl);

        driver.findElement(By.id("tabButton")).click();

        driver.quit();

    }
}
