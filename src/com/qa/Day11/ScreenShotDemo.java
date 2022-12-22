package com.qa.Day11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        File screenshot =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot,new File("C:\\Users\\shubh\\OneDrive - cabschoolo.cabschoolo\\Desktop\\JAVA- Selenium\\Selenium Content\\Day 11\\capturedscreenshot\\homepagescreenshot.png"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
