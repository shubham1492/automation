package com.qa.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlingExample2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/browser-windows";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.id("windowButton")).click();

        Set<String> allWindows = driver.getWindowHandles();

        Iterator<String> itr = allWindows.iterator();

        while (itr.hasNext()){

            String childWindiow = itr.next();

            if(!mainWindow.equalsIgnoreCase(childWindiow)){

                driver.switchTo().window(childWindiow);

                String str = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("Title of child window "+ str);

            }

        }

        driver.quit();
    }
}
