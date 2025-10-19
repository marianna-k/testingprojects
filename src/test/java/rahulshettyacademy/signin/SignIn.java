package rahulshettyacademy.signin;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignIn {

    ExtentReports report = new ExtentReports();
    public void configs(){
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("QA Test - Sign in page");
        reporter. config().setDocumentTitle("Test Report");

        report.attachReporter(reporter);
        report.setSystemInfo("Tester", "Marianna");
    }
    @Test
    public void initialDemo() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        configs();
        report.createTest("QA Test");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String siteUrl = "https://rahulshettyacademy.com/locatorspractice";
        driver.get(siteUrl);
        driver.manage().window().maximize();

        driver.findElement(By.id("inputUsername")).sendKeys("janedoe");
        Thread.sleep(2000);
        driver.findElement(By.name("inputPassword")).sendKeys("jd1234");
        Thread.sleep(2000);
        driver.findElement(By.id("chkboxTwo")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("signInBtn")).click();

        Thread.sleep(2000);
        String errorMessage = driver.findElement(By.className("error")).getText();
        System.out.println(errorMessage);
        Thread.sleep(2000);

        ExtentTest test = report.createTest("Login Test");
        test.pass("Username entered");
        test.fail("Password incorrect");

        driver.quit();

        report.flush();
    }
}
