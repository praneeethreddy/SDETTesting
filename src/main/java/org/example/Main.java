package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.saucedemo.com");
            driver.manage().window().maximize();
            Thread.sleep(1000);

            AssemblePage loginPage = new AssemblePage(driver);
            loginPage.login();
            Thread.sleep(5000);

            HomePage homePage = new HomePage(driver);
            homePage.addProductAndGoToCart();
            Thread.sleep(5000);

            Thread.sleep(5000);

        } finally {
            driver.quit();
        }
    }
}
