package com.qa.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='Click Me - Fluent Wait']")).click();


        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver Driver) {
                WebElement element = driver.findElement(By.xpath("//p[text()='Software Testing Material - DEMO PAGE']"));

                String text = element.getText();

                if(text.equals("Software Testing Material - DEMO PAGE")){
                    System.out.println(text);
                    return element;
                }else {
                    System.out.println("Fluent wait failed ");
                    return null;
                }
            }
        });

        System.out.println(element);

    }
}
