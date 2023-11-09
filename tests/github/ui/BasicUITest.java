package github.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicUITest {

    public ChromeDriver driver;
    public ChromeDriver driver2;
    @BeforeTest
    public void setUp () {
        driver = new ChromeDriver();
        driver2 = new ChromeDriver();
    }



   @AfterTest
    public void setDown (){
    driver.quit();
    }
}
