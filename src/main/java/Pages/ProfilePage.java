package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {
    private WebDriver driver;
    public ProfilePage(WebDriver driver){
        this.driver= driver;
    }
    public MyProfilePage clickonMyNaukri() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"));
        Actions action= new Actions(driver);
        action.moveToElement(element).build().perform();
        String s=element.getText();
        System.out.println("Webelement is"+s);
        driver.findElement(By.linkText("Edit Profile")).click();
        return new MyProfilePage (driver);
    }

}

