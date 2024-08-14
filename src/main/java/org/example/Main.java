package org.example;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//        WebDriver dd =new SafariDriver();
        System.out.println("Hello world!");
//        driver.get("https://praneethreddy.netlify.app");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.get("http://localhost:3000/");
//        driver.findElement(By.id("details")).sendKeys("praneeth");
//        driver.findElement(By.id("hey")).sendKeys("ppppraneeth");

//        driver.close();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("praneeth");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[placeholder*='mail']")).sendKeys("bachi");
        driver.findElement(By.tagName("p")).getText();
//        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in");



    }
}