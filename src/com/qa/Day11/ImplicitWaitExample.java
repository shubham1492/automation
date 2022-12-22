package com.qa.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "https://demoqa.com/dynamic-properties";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.id("visibleAfter")).click();


        driver.close();

    }
}
