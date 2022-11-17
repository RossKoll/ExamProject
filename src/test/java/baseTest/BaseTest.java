package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckBoxPage;
import pages.HomePage;
import pages.TextBoxPage;
import pages.WebTables;

public class BaseTest {

    WebDriver driver;
    protected Logger logger = Logger.getLogger(getClass());

    protected HomePage homePage;
    protected TextBoxPage textBoxPage;
    protected CheckBoxPage checkBoxPage;
    protected WebTables webTables;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Web browser is opened");
        homePage = new HomePage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        webTables = new WebTables(driver);

    }

    @After
    public void tearDown(){
        driver.quit();
        logger.info("Browser is closed");
    }

}
