package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    WebDriver driver; //we made our object global
    @BeforeMethod
    public void setUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");

    }


    @Test
    public void test1() throws InterruptedException {

        WebElement nameBox= driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Polat");

        WebElement surnmeBox= driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnmeBox.sendKeys("Alemdar");

        Thread.sleep(2000);

    }


    @AfterMethod
    public void tearDown(){

        driver.quit();

    }



}
