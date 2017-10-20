package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    @Test
    public void startWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://seleniumsimplified.com");
        Assert.assertTrue("title should start differently",
                            driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();

    }
}
