package ui_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPagePOM {

    public WebDriver driver;

    // Web elements on the login page
    public By usernameFiled = By.name("login");
    public By passwordFiled = By.name("password");
    public By loginButton = By.xpath("//*[@id='login']/div[4]/form/div/input[13]");
    public By errorMessageSelector = By.xpath( "//*[@id='js-flash-container']/div/div/div");
    public By avatar = By.xpath("\'/html/body/div[1]/div[1]/header/div/div[1]/div/div[1]/a/strong/span\'));");
    String expectedValidationMessage = "Incorrect username or password.";




    // Constructor to initialize the WebDriver
    public LoginPagePOM(WebDriver driver){
        this.driver=driver;
    }

    public void enterUserName (String username){
        driver.findElement(usernameFiled).sendKeys(username);
    }
    public void enterPassword (String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }

    public void clickSubmitButton (){
        driver.findElement(loginButton).click();
    }

    public void openLoginGITHUBpage (){
        driver.get("https://github.com/login");

    }

    public void assertErrorMessage (){
        String actualErrorMessage = driver.findElement(errorMessageSelector).getText();
        Assert.assertEquals(actualErrorMessage, expectedValidationMessage);
    }

    public void assertCorrectLogin(){
        driver.findElement(avatar);
        Assert.assertEquals(true,avatar);
    }

    public void tryToLogin(String username, String password){
        LoginPagePOM loginPagePOM = new LoginPagePOM(driver);
        loginPagePOM.openLoginGITHUBpage();

        loginPagePOM.enterUserName(username);
        loginPagePOM.enterPassword(password);
        loginPagePOM.clickSubmitButton();
    }

}
