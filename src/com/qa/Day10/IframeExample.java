package com.qa.Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IframeExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/frames";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.tagName("iframe"));

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getAttribute("src")+ " "+ i);
        }

        //driver.switchTo().frame(3);

        //driver.switchTo().frame("frame1");

        WebElement element = driver.findElement(By.id("frame1"));

        driver.switchTo().frame(element);
        String title = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(title);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        String title1 = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println("Second Iframe Value  "+ title1);




    }

}
