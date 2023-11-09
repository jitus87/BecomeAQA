package github.ui;

import config.ConfigReader;
import org.testng.annotations.Test;
import ui_testing.LoginPagePOM;

public class TestSeleniumGitHubLoginWithPOM extends BasicUITest{

    @Test
    public void validationofErrorMessage() {
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        loginPagePOM.openLoginGITHUBpage();

        loginPagePOM.enterUserName("ksdjfhdksj");
        loginPagePOM.enterPassword("fjksdkjfh");
        loginPagePOM.clickSubmitButton();
        loginPagePOM.assertErrorMessage();
    }

    @Test
    public void SuccessfullLogin (){
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        loginPagePOM.openLoginGITHUBpage();

        loginPagePOM.enterUserName(ConfigReader.LOGINNAME);
        loginPagePOM.enterPassword(ConfigReader.PASSWORD);
        loginPagePOM.clickSubmitButton();

        loginPagePOM.assertCorrectLogin();

    }



}
