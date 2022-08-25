package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfilePage {
    private WebDriver driver;
        public MyProfilePage(WebDriver driver){ this.driver=driver;}

    public void ClickUpdateResume() throws InterruptedException {
        WebElement updateresume= driver.findElement(By.xpath("//*[@id='attachCV']"));
//                updateresume.click();

        JavascriptExecutor Exec=(JavascriptExecutor) driver;
        Exec.executeScript("arguments[0].click()",updateresume);
        Thread.sleep(5000);
        updateresume.sendKeys("C:\\Users\\Admin\\Downloads\\NaukriResumeFile\\Venkata_Praveen_J_Resume_2022_Inf.docx");
                }
    }

