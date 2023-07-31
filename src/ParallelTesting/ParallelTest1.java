package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {
    WebDriver driver;
    @Test
    void logoTest() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://www.airbnb.co.in/");
       WebElement logo = driver.findElement(By.xpath(
               "/html/body/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div[1]/div/div/div/header/div/div[1]/a"));
      Assert.assertTrue(logo.isDisplayed());
      Thread.sleep(5000);
    }
    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.airbnb.co.in/");
       Assert.assertEquals(driver.getTitle(), "Holiday Homes & Apartment Rentals - Airbnb - Airbnb");
        Thread.sleep(5000);
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
