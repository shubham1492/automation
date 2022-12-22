package com.qa.Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsByTagNameExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box/");

        driver.manage().window().maximize();

        // Find Element using tag name

        List<WebElement> allInputElement = driver.findElements(By.tagName("input"));

        if(allInputElement.size() !=0){

            System.out.println(allInputElement.size() + " Elements found by input");

            for(WebElement inputElement : allInputElement){
                System.out.println(inputElement.getAttribute("placeholder"));
            }

        }
        // SendKeys method
        WebElement element  = driver.findElement(By.id("userName"));

        element.sendKeys("Shubham Jain");
        element.sendKeys("Mohan Gupta");
        // Clear Method
        element.clear();

        element.sendKeys("Rahul Gupta");


    }
}
