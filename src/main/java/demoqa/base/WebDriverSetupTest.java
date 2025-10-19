package demoqa.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetupTest {

    protected WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//    @Test
//    public void openDemoQA(){
//        driver.get("https://demoqa.com");
//    }

   // @After
//    public void quit(){
//        driver.quit();
//    }
}
