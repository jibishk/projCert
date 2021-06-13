// 
// Decompiled by Procyon v0.5.36
// 

package com.edureka.devops.selenium_20210510;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/edureka/Downloads/chromedriver");
        final ChromeOptions chromeOptions = new ChromeOptions();
        System.out.println("Mukesh..Test Started..!!");
        chromeOptions.setHeadless(true);
        chromeOptions.addArguments(new String[] { "-headless" });
        chromeOptions.setBinary("/usr/bin/google-chrome");
        final WebDriver driver = (WebDriver)new ChromeDriver(chromeOptions);
        driver.get("http://localhost:8089");
        driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        driver.findElement(By.id("About Us")).click();
        final String actualParagraph = driver.findElement(By.id("PID-ab2-pg")).getText();
        final String expectedParagraph = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        System.out.println("Actual Paragraph : " + actualParagraph + "\n");
        System.out.println("Expected Paragraph : " + expectedParagraph + "\n");
        System.out.println("Selenium Test Succeeded - About Us Pragraph Varified..!!\n");
        driver.quit();
    }
}
