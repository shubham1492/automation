package com.qa.Day2.locatersexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocatorExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demoqa.com/automation-practice-form");

        WebElement ele = driver.findElement(By.id("firstName"));

        ele.sendKeys("Shubham");

        /*WebElement ele1 = driver.findElement(By.name("gender"));

        WebElement ele2 = driver.findElement(By.className("practice-form-wrapper"));

        driver.findElement(By.linkText("Home"));

        driver.findElement(By.partialLinkText("Ho"));

        driver.findElement(By.tagName("a"));

        driver.findElement(By.cssSelector("input[id='userEmail']"));

        driver.findElement(By.xpath("//input[@id='firstName']"));*/

    }
}
