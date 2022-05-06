package org.example.HomeWork_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test_1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.dns-shop.ru/?city=spb");

            WebElement webElement1 = driver.findElement(By.xpath(".//*[@data-role='login-button']"));

            webElement1.click();

            WebElement webElement2 = driver.findElement(By.xpath(".//*[contains(text(),'Войти с паролем')]"));

            webElement2.click();

            WebElement webElement3 = driver.findElement(By.xpath(".//*[contains(@autocomplete,'username')] "));

            webElement3.sendKeys("ksenialavrenteva@yandex.ru");

            WebElement webElement4 = driver.findElement(By.xpath("//*[contains(@autocomplete,'current-password')]"));

            webElement4.sendKeys("Test1357901488");

            WebElement webElement5 = driver.findElement(By.xpath(".//*[@class='base-ui-button base-ui-button_brand base-ui-button_big-flexible-width']"));

            webElement5.click();

            new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("dns"));

            driver.navigate().to("https://www.dns-shop.ru/?city=spb");



        // driver.quit();


    }
}
