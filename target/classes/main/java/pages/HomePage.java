package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private final String URL = "https://demoqa.com/";
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(){
        try {
            driver.get("https://demoqa.com/");
            logger.info("Home page is opened");
        }catch (Exception e){
            logger.info("Home page is not opened");
            Assert.fail("Home page is not opened");
        }
    }

    public boolean isHomePageOpened(){
        return checkCurrentPageUrl(URL);
    }
}
