package com.qa.Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        boolean status = element.isDisplayed();

        if(status){
            System.out.println("WebDriver is Visible");
        }else{
            System.out.println("WebDriver is not visible");
        }
    }
}
