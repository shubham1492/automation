package com.qa.Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleInSelenium {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/popup.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> set = driver.getWindowHandles();

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){

            String childWindow = itr.next();

            if(!mainWindow.equalsIgnoreCase(childWindow)){

                driver.switchTo().window(childWindow);

                driver.findElement(By.name("emailid")).sendKeys("subhamjain55@gmail.com");

                driver.findElement(By.name("btnLogin")).click();

                String title = driver.findElement(By.xpath("//table//h2")).getText();

                System.out.println(title);

            }
        }
           driver.switchTo().window(mainWindow);

    }
}
