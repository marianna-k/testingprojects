package tutorialsninja;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        String url = "https://tutorialsninja.com/demo";
        driver.get(url);
        driver.manage().window().maximize();

        driver.findElement(By.name("search")).sendKeys("MacBook");  //write MacBook Air in the search area and click
        driver.findElement(By.className("fa-search")).click();  //click the search option next to the search bar

        //using Thread.sleep for testing purposes
        Thread.sleep(2000);
        driver.findElement(By.linkText("MacBook Air")).click();  //locate the MacBook Air product and click
        Thread.sleep(2000);
        driver.findElement(By.name("quantity")).click(); //click the quantity space
        driver.findElement(By.name("quantity")).clear();  //clear the quantity value
        Thread.sleep(2000);
        driver.findElement(By.name("quantity")).sendKeys("2");  //add 2 as the quantity value
        Thread.sleep(2000);
        driver.findElement(By.id("button-cart")).click();  //click the button
        Thread.sleep(2000);
        driver.findElement(By.id("cart")).click();  //click the cart button at the top of the page
        Thread.sleep(2000);
        driver.findElement(By.className("fa-shopping-cart")).click();  //click the view cart
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Checkout')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);  //scroll at the end of the page to find the checkout button
        Thread.sleep(2000);
        driver.findElement(By.className("pull-right")).click();  //click the checkout button

    }
}
