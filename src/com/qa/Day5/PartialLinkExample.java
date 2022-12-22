package com.qa.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/accessing-link.html";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("click")).click();

    }
}
