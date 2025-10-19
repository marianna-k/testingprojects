package BlazeDemo.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
    protected WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//    @Test
//    public void openDemoQA(){
//        driver.get("https://phptravels.com/demo/");
//    }

    // @After
//    public void quit(){
//        driver.quit();
//    }
}
