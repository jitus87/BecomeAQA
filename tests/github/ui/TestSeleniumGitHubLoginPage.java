package github.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import config.ConfigReader;



import java.time.Duration;
public class TestSeleniumGitHubLoginPage extends BasicUITest{


    @Test
    public void TestValidationError (){
        //ChromeDriver driver = new ChromeDriver();  - replaced by @BeforeTest setUp
        driver.get("https://github.com/login");
        WebElement
                element=driver.findElement(By .name("login"));
                element.sendKeys("asdadasdasdasd");

                element =driver.findElement(By.name("password"));
                element.sendKeys("werwere");

        WebElement
                button=driver.findElement(By.xpath("//*[@id='login']/div[4]/form/div/input[13]"));
                button.click();

        WebElement errorElement = driver.findElement(By.xpath("//*[@id='js-flash-container']/div/div/div"));
        String actualErrorMessage = errorElement.getText();
        String expectedErrorMessage = "Incorrect username or password.";


        Duration duration = Duration.ofMillis(500);
        WebDriverWait wait = new WebDriverWait(driver,duration);

        Assert.assertEquals(actualErrorMessage,expectedErrorMessage);


        //driver.quit();  erased because it is in @AfterTest
    }


    @Test
    public void SuccessfullLogin (){
        driver.get("https://github.com/login");

        WebElement
                element=driver.findElement(By .name("login"));
                element.sendKeys(ConfigReader.LOGINNAME);

                element =driver.findElement(By.name("password"));
                element.sendKeys(ConfigReader.PASSWORD);

        WebElement
                button=driver.findElement(By.xpath("//*[@id='login']/div[4]/form/div/input[13]"));
                button.click();

        Duration duration = Duration.ofMillis(500);
        WebDriverWait wait = new WebDriverWait(driver,duration);


        WebElement
                avatar = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div/div[1]/a/strong/span"));
        Assert.assertEquals(true,avatar.isDisplayed());


    }


}
