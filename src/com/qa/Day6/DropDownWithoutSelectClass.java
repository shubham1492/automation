package com.qa.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropDownWithoutSelectClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.name("country")).click();

       List<WebElement> elementList =  driver.findElements(By.xpath("//select[@name='country']/option"));

        System.out.println(elementList.size());


        for(int i=0;i<elementList.size();i++){

            if(elementList.get(i).getText().equals("INDIA")){
                elementList.get(i).click();
                break;
            }
        }


    }
}
