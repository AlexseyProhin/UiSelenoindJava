package com.github.qa.unittests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class githubTest {
    private WebDriver driver;

    @BeforeAll
    public static void chekbrousershin() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
    driver = new ChromeDriver();
    driver.get("https://github.com/AlexseyProhin");

    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void simpleTest() {
        String xpath = "//input[@class='form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus']";
        WebElement inputElement = driver.findElement(By.xpath(xpath));
        inputElement.sendKeys("Hello World");
        inputElement.submit();


    }
}
