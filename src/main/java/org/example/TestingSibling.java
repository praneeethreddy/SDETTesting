package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSibling {
    public static void main(String[] args) {
        WebDriver mydriver = new ChromeDriver();

        mydriver.get("https://rahulshettyacademy.com/AutomationPractice/");
//        System.out.println(mydriver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//        System.out.println(mydriver.findElement(By.xpath("//header/div/button[1]/parent::div")));
//        mydriver.manage().window().maximize();
        mydriver.manage().window().fullscreen();
        mydriver.get("https://google.com");
        mydriver.navigate().to("https://rahulshettyacademy.com/");
        mydriver.navigate().back();
        mydriver.navigate().forward();
//        mydriver.close();
    }
}
