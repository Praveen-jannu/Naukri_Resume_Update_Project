package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By login= By.cssSelector("#loginForm > div:nth-child(2) > div.action.row.mb0 > div > button.waves-effect.waves-light.btn-large.btn-block.btn-bold.blue-btn.textTransform");
    private By username= By.id("usernameField");
    private By password= By.id("passwordField");
    public HomePage(WebDriver driver){
        this.driver= driver;}
    public void enterloginemail(String emailid){
        driver.findElement(username).sendKeys(emailid);
    }
    public void enterpassword(String pwd){
        driver.findElement(password).sendKeys(pwd);
    }

    public ProfilePage ClickLoginButton(){
        driver.findElement(login).click();
        return new ProfilePage(driver);
    }

    }

