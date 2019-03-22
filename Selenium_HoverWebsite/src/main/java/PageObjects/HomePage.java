package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SuperClass{
    By homePage = By.cssSelector("#content > div > section.hero > h1");
    By signUp = By.cssSelector("#main_nav > div > nav > ul > li.user > ul > li:nth-child(3) > a");
    By signIn = By.cssSelector("#main_nav > div > nav > ul > li.user > ul > li:nth-child(4) > a");

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHomePageText(){
        return driver.findElement(homePage).getText();
    }

    public void clickSignUp(){
        driver.findElement(signUp).click();
    }

    public void clickSignIn(){
        driver.findElement(signIn).click();
    }
}