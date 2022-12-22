package com.qa.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.SocketHandler;

public class GetTextMethodExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/links");

        driver.manage().window().maximize();

        // GetText Method

        WebElement element = driver.findElement(By.id("simpleLink"));

        String linkName = element.getText();

        System.out.println("Link Name :"+ linkName);

        String tagName = element.getTagName();

        System.out.println("Tag Name :"+tagName);

        //System.out.println("Css Value "+ element.getCssValue("style"));

        Point point = element.getLocation();

        System.out.println(point.x + " "+ point.y);


    }
}
