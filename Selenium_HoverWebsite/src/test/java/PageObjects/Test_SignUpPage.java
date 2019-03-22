package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Test_SignUpPage extends SuperTestngClass {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testFillForm() {
        HomePage homePage = new HomePage(driver);
        homePage.waitForPageLoaded();
        homePage.clickSignUp();
        homePage.waitForPageLoaded();

        signupPage = new SignUpPage(driver);
        String name = "abcdefgh";
        String email = "abc@abd.com";
        String password = "abcABC@123";
        signupPage.FillForm(name, name, email, name, password);

    }
}