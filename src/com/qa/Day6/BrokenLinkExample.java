package com.qa.Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinkExample {

    public static void verifyLink(String linkUrl){

        try {
            URL url = new URL(linkUrl);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.connect();

            if(httpURLConnection.getResponseCode()>=400){
                System.out.println(linkUrl+ " - "+ httpURLConnection.getResponseMessage()+ " is broken link");
            }else{
                System.out.println(linkUrl+ " - "+ httpURLConnection.getResponseMessage());
            }
        }catch (Exception e){

        }

    }

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com/broken";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        List<WebElement> allUrls = driver.findElements(By.tagName("a"));

        System.out.println("Total link on a web page "+ allUrls.size() );

        for(int i=0;i<allUrls.size();i++){

           WebElement e = allUrls.get(i);
           String url = e.getAttribute("href");
           verifyLink(url);

        }

    }

}
