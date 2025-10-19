package BlazeDemo.pages;

import BlazeDemo.base.SetUp;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Home extends SetUp {

    @Test
    public void testHotelPage() throws InterruptedException {
        driver.get("https://blazedemo.com/");


        WebElement departureCity = driver.findElement(By.name("fromPort"));
        departureCity.sendKeys("Portland");

        Thread.sleep(2000);

        WebElement destinationCity = driver.findElement(By.name("toPort"));
        destinationCity.sendKeys("New York");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[type='submit")).click();

        Thread.sleep(2000);

        //all the buttons
        List<WebElement> flightButtons = driver.findElements(By.cssSelector("input[type='submit']"));

        //click the last button
        flightButtons.get(flightButtons.size() - 1).click();

        //form
        driver.findElement(By.id("inputName")).sendKeys("Anne Rose");
        Thread.sleep(2000);
        driver.findElement(By.id("address")).sendKeys("456 Pineview Terrace");
        Thread.sleep(2000);
        driver.findElement(By.id("city")).sendKeys("Portland");
        Thread.sleep(2000);
        driver.findElement(By.id("state")).sendKeys("Oregon");
        Thread.sleep(2000);
        driver.findElement(By.id("zipCode")).sendKeys("97205");
        Thread.sleep(2000);
        driver.findElement(By.id("creditCardNumber")).sendKeys("5555 5555 5555 4444");
        Thread.sleep(2000);


        driver.findElement(By.id("nameOnCard")).sendKeys("Anne Rose");

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(2000);

        //Booking confirmation
        WebElement pageConfirmation = driver.findElement(By.tagName("h1"));

        JavascriptExecutor locateTitle = (JavascriptExecutor) driver;
        locateTitle.executeScript("arguments[0].style.color='blue'", pageConfirmation);
    }


}
