package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends SuperClass {
    private WebDriver driver;
    private By signUpText = By.linkText("Create Account");
    private By firstName = By.name("firstName");
    private By lastName = By.name("lastName");
    private By email = By.name("email");
    private By userName = By.name("username");
    private By password = By.name("password");
    private By showPassword = By.className("flat-checkbox-label");
    private By continueButton = By.xpath("/html/body/main/div[2]/div/div/div[2]/div/main/form/div[2]/button");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String value) {
        driver.findElement(firstName).sendKeys(value);
    }

    public void setLastName(String value) {
        driver.findElement(lastName).sendKeys(value);
    }

    public void setEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }

    public void setUserName(String value) {
        driver.findElement(userName).sendKeys(value);
    }

    public void setPassword(String value) {
        driver.findElement(password).sendKeys(value);
    }

    public void setShowPassword(boolean isCheck){
        if(isCheck)
            if(!driver.findElement(showPassword).isSelected())
                driver.findElement(showPassword).click();
        else
            if(driver.findElement(showPassword).isSelected())
                driver.findElement(showPassword).click();
    }

    public void clickContinue(){
        driver.findElement(continueButton).click();
    }

    public void FillForm(String firstName, String lastName, String email, String userName, String password){
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUserName(userName);
        setPassword(password);
        setShowPassword(true);
        clickContinue();
    }
}
