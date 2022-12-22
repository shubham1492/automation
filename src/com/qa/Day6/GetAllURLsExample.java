package com.qa.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class GetAllURLsExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/links";

        driver.get(baseUrl);

        driver.manage().window().maximize();
        String url ="";
        List<WebElement> allUrls = driver.findElements(By.tagName("a"));

        System.out.println("Total link on a web page "+ allUrls.size() );

        Iterator<WebElement> itr = allUrls.iterator();
        while (itr.hasNext()){
           url = itr.next().getText();
            System.out.println(url);
        }

        driver.close();
    }
}
