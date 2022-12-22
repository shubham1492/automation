package com.qa.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsSelectedExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//input[@value='Male']"));

        Boolean select = element.isSelected();

        System.out.println("Element selected is "+ select);

        if(!select) {

            driver.findElement(By.xpath("//label[text()='Male']")).click();
        }

        driver.findElement(By.xpath("//label[text()='Sports']")).click();
    }
}
