package com.qa.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriverCommandExample {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.gmail.com");

        driver.manage().window().maximize();

        Boolean displayText = driver.findElement(By.id("identifierId")).isDisplayed();

        System.out.println("Element displayed is "+ displayText);

        Boolean enable = driver.findElement(By.id("identifierId")).isEnabled();

        System.out.println("Element Enabled is "+enable);

        driver.findElement(By.id("identifierId")).sendKeys("raju.gupta@gmail.com");

        driver.findElement(By.xpath("//span[text()='Next']")).click();



    }
}
