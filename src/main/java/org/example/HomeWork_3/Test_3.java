package org.example.HomeWork_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test_3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.dns-shop.ru/?city=spb");


        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href='/catalog/17a890dc16404e77/smartfony-planshety-i-fototexnika/']"));

        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]/div[1]/span"));

        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]/div[1]/span"));

        webElement3.click();

        WebElement webElement4 = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div/div[2]/div[1]/div[4]/button[1]"));

        webElement4.click();

        WebElement webElement5 = driver.findElement(By.xpath(".//*[@class='wishlist-link__lbl']"));

        webElement5.click();


        // driver.quit();




    }
}
