package com.qa.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeExample {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/nestedframes";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.switchTo().frame("frame1");

        String title  = driver.findElement(By.tagName("body")).getText();

        System.out.println(title);

//        WebElement element = driver.findElement(By.xpath("//iframe[contains(@srcdoc,'Child ')]"));
//
//        driver.switchTo().frame(element);

        int numerOfIframe = driver.findElements(By.tagName("iframe")).size();
        System.out.println(numerOfIframe);

        driver.switchTo().frame(0);

        String title1  = driver.findElement(By.tagName("body")).getText();

        System.out.println(title1);


    }
}
