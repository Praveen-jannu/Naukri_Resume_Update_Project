package Tests;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test

    public void Testhomepage() throws InterruptedException {
        homePage.enterloginemail("Pj.officialinfo@gmail.com");
        homePage.enterpassword("Jannu@1369");
        homePage.ClickLoginButton();
        Thread.sleep(5000);
        profilePage.clickonMyNaukri();
        Thread.sleep(3000);
        myProfilePage.ClickUpdateResume();

    }

}

