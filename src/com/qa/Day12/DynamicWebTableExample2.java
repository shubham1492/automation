package com.qa.Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicWebTableExample2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String baseUrl = "https://demo.guru99.com/test/table.html";

        driver.get(baseUrl);

        driver.manage().window().maximize();

        // Step 1 - locate the table

        WebElement table = driver.findElement(By.xpath("/html/body/table/tbody"));

        // Step -2 - Locate the rows in table

        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

        int row_count = rows_table.size();

        for(int i=0;i<row_count;i++){

            // Step 3 : locate the columns
            List<WebElement> columns  =rows_table.get(i).findElements(By.tagName("td"));

            int column_count = columns.size();

            // Step 4 : Iterate the columns
            for(int j=0 ;j<column_count;j++){

                String column_text = columns.get(j).getText();

                System.out.println("cell value of row number "+ i + " and column number  "+ j + "is " + column_text);
            }
            System.out.println("------------------------------------------------------");


        }



    }
}
