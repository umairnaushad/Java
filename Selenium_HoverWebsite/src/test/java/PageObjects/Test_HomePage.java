package PageObjects;

import bsh.Console;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class Test_HomePage extends SuperTestngClass {

    @BeforeMethod
    public void setUp() {
        //System.out.println("HomePage BeforeMethod");
    }

    @AfterMethod
    public void tearDown() {
        //System.out.println("HomePage AfterMethod");
    }

    @Test
    public void testGetHomePageText1() {
        HomePage obj = new HomePage(driver);
        obj.waitForPageLoaded();
        String pageText = obj.getHomePageText();
        Assert.assertEquals(true, pageText.contains("great idea"));
    }

    @Test
    public void testGetHomePageText2() {
        HomePage obj = new HomePage(driver);
        obj.waitForPageLoaded();
        String pageText = obj.getHomePageText();
        Assert.assertEquals(true, pageText.contains("great idea"));
    }

    @Test
    public void testGetHomePageText3() {
        HomePage obj = new HomePage(driver);
        obj.waitForPageLoaded();
        String pageText = obj.getHomePageText();
        Assert.assertEquals(true, pageText.contains("great idea"));
    }

    @Test
    public void testGetHomePageText4() {
        HomePage obj = new HomePage(driver);
        obj.waitForPageLoaded();
        String pageText = obj.getHomePageText();
        Assert.assertEquals(true, pageText.contains("great idea"));
    }

    @Test
    public void testGetHomePageText5() {
        HomePage obj = new HomePage(driver);
        obj.waitForPageLoaded();
        String pageText = obj.getHomePageText();
        Assert.assertEquals(true, pageText.contains("great idea"));
    }
}