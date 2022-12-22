package com.qa.Day11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class AShotScreenShotFullPageExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demoqa.com";

        driver.get(baseUrl);

        driver.manage().window().maximize();


        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        try {
            ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\shubh\\OneDrive - cabschoolo.cabschoolo\\Desktop\\JAVA- Selenium\\Selenium Content\\Day 11\\capturedscreenshot\\homepagescreenshot.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
