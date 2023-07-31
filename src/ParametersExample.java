import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {


    public class AssertionsExample {

        WebDriver driver ;

        @BeforeClass
        @Parameters({"browser", "url"})
        void setup(String browser, String app) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
                driver = new EdgeDriver();
            }
            driver.get(app);
        }

//    @Test(priority = 1)
//    void logoTest() {
//        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
//        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
//    }

        @Test(priority = 2)
        void homePageTitle() {
            String title = driver.getTitle();
            Assert.assertEquals("OrangeHRM", title, "Title is not matched");
        }

        @AfterClass
        void tearDown() {
            driver.quit();
        }
    }



}
