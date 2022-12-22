package com.qa.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicWebTableHandlingExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "http://demo.guru99.com/test/web-table-element.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        List<WebElement> col = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));

        System.out.println("No of columns :"+col.size());

        List<WebElement> row = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr"));

        System.out.println("No of rows :"+row.size());


    }
}
