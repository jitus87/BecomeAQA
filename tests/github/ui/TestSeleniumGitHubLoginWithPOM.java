package github.ui;

import config.ConfigReader;
import org.testng.annotations.Test;
import ui_testing.LoginPagePOM;

public class TestSeleniumGitHubLoginWithPOM extends BasicUITest{

    @Test
    public void validationofErrorMessage() {
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        loginPagePOM.tryToLogin("ksdjfhdksj","fjksdkjfh");
        loginPagePOM.assertErrorMessage();
    }

    @Test
    public void SuccessfullLogin (){
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        loginPagePOM.tryToLogin(ConfigReader.LOGINNAME, ConfigReader.PASSWORD);
        loginPagePOM.assertCorrectLogin();

    }



}
