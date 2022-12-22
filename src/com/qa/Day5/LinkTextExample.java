package com.qa.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/link.html";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        /*driver.findElement(By.linkText("click here")).click();

        System.out.println("title of page is: " + driver.getTitle());*/

        //driver.findElement(By.xpath("//a[@href='http://www.fb.com']")).click();

        driver.findElement(By.xpath("//a[text()='click here'][2]")).click();

        System.out.println("title of page is: " + driver.getTitle());
    }
}
