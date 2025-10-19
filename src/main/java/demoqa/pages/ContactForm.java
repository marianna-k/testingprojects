package demoqa.pages;
import demoqa.base.WebDriverSetupTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class ContactForm extends WebDriverSetupTest{

    @Test
    public void testContactForm() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Jane Doe");
        Thread.sleep(2000);
        driver.findElement(By.id("userEmail")).sendKeys("jdoe@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("currentAddress")).sendKeys("Leoforos Kifisias 30");
        Thread.sleep(2000);
        driver.findElement(By.id("permanentAddress")).sendKeys("Leoforos Athinon 80");
        Thread.sleep(2000);
        driver.findElement(By.id("submit")).click();

    }
}
