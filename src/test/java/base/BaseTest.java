package base;

import Pages.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //System.out.println(driver.getTitle());
//        WebElement formAuthentication = driver.findElement(By.linkText("Form Authentication"));
//        formAuthentication.click();

        homePage = new HomePage(driver);

        //System.out.println(driver.getTitle());
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}