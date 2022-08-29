package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTest {

    WebDriver driver;
    Logger logger = Logger.getLogger(getClass());

    protected HomePage homePage;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Web browser is opened");
        homePage = new HomePage(driver);

    }

    @After
    public void tearDown(){
        driver.quit();
        logger.info("Browser is closed");
    }
}