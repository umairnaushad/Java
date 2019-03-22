package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class SuperTestngClass {
    protected WebDriver driver;
    protected HomePage obj;
    protected SignUpPage signupPage;

    @BeforeMethod(alwaysRun = true)
    public void InitializeDriver() {
        //System.out.println("SuperTestngClass BeforeMethod");
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.get("https://www.hover.com/");
        //driver.get("https://www.google.com/");
    }

    @AfterMethod(alwaysRun = true)
    public void ReleaseDriver() {
        //System.out.println("SuperTestngClass BeforeMethod");
        driver.close();
    }
}
