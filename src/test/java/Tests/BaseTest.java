package Tests;


import Pages.HomePage;
import Pages.MyProfilePage;
import Pages.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected ProfilePage profilePage;
    protected MyProfilePage myProfilePage;

    @BeforeClass
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\Naukri Resume Update daily\\resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.naukri.com/nlogin/login");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        profilePage= new ProfilePage(driver);
        myProfilePage= new MyProfilePage(driver);
    }
}