package demoqa.pages;

import demoqa.base.WebDriverSetupTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Modal extends WebDriverSetupTest {

    @Test
    public void testModalDialog() throws InterruptedException {
        driver.get("https://demoqa.com/modal-dialogs");

        //small modal
        driver.findElement(By.id("showSmallModal")).click();
        Thread.sleep(2000);

        //locate the modal title
        WebElement modalTitle = driver.findElement(By.id("example-modal-sizes-title-sm"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //use a border around the modal title
        js.executeScript("arguments[0].style.border='1px solid blue'", modalTitle);

        //use a padding in the border
        js.executeScript("arguments[0].style.padding='10px'", modalTitle);
        Thread.sleep(1000);

        //remove the border before closing the window
        js.executeScript("arguments[0].style.border=''", modalTitle);
        Thread.sleep(2000);

        //click modal button to close it
        driver.findElement(By.id("closeSmallModal")).click();
        Thread.sleep(2000);



        //open large modal
        driver.findElement(By.id("showLargeModal")).click();
        Thread.sleep(2000);

        //locate text
        WebElement text = driver.findElement(By.className("modal-body"));
        JavascriptExecutor highlightText = (JavascriptExecutor) driver;

        //change modal body color to blue
        highlightText.executeScript("arguments[0].style.color='blue'", text);
        Thread.sleep(2000);

        //click modal button to close it
        driver.findElement(By.id("closeLargeModal")).click();
        Thread.sleep(2000);

    }
}
