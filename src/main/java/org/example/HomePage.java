package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void addProductAndGoToCart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); // example product
        driver.findElement(By.className("shopping_cart_link")).click();
    }
}
