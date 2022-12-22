package com.qa.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.name("country"));

        Select select = new Select(element);

        select.selectByVisibleText("INDIA");

        select.selectByIndex(2);

        select.selectByValue("ANDORRA");


    }
}
