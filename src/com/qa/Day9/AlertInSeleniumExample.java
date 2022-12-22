package com.qa.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInSeleniumExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/delete_customer.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.name("cusid")).sendKeys("12345");

        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();

        Thread.sleep(5000);

       String alertMessage =  driver.switchTo().alert().getText();

       if(alertMessage.equals("Customer Successfully Delete!")){
           System.out.println("User is deleted successfully");
       }else{
           System.out.println("Not able to delete");
       }

       driver.switchTo().alert().accept();

    }
}
