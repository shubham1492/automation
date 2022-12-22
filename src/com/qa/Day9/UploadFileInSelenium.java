package com.qa.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UploadFileInSelenium {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/upload/";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\shubh\\OneDrive - cabschoolo.cabschoolo\\Desktop\\caching system design.pdf");

        driver.findElement(By.className("field_check")).click();

        driver.findElement(By.id("submitbutton")).click();

        Thread.sleep(5000);

        String str = driver.findElement(By.xpath("//h3[@class='demo']/center")).getText();

        System.out.println(str);

        if(str.equals("1 file\nhas been successfully uploaded.")){
            System.out.println("file uploaded successfully");
        }else{
            System.out.println("file not uploaded successfully");
        }
    }
}
