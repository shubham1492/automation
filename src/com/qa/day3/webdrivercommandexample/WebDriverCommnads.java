package com.qa.day3.webdrivercommandexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Practice Exercise - 1
 * 1.	Launch a new Chrome browser.
 * 2.	Open demoQA.com
 * 3.	Get Page Title name and Title length
 * 4.	Print Page Title and Title length on the Eclipse Console.
 * 5.	Get Page URL and verify if it is a correct page opened
 * 6.	Get Page Source (HTML Source code) and Page Source length
 * 7.	Print Page Length on Eclipse Console.
 * 8.	Close the Browser.
 */
public class WebDriverCommnads {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String pageUrl = "https://demoqa.com/";

        driver.get(pageUrl);

        String title = driver.getTitle();

        System.out.println(title);
        System.out.println(title.length());

        String url = driver.getCurrentUrl();

        if(pageUrl.equals(url)){
            System.out.println("Verification is successful");
        }else{
            System.out.println("Verification is not successful");
        }

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        System.out.println(pageSource.length());

        driver.close();

    }

}
