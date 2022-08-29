package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommonActionWithElements {

    protected WebDriver driver;
    Logger logger = Logger.getLogger(getClass());
    public CommonActionWithElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void openPage(String URL){
        try {
            driver.get(URL);
            logger.info("Page + "+ driver.getTitle() + " is opened");
        }catch (Exception e){
            printErrorAndStopTest(e);
        }
    }

    public void clickOnElement(WebElement element){
        try {
            element.click();
            logger.info("'" + element.getAccessibleName() + "' was clicked");
        }catch (Exception e){
            printErrorAndStopTest(e);
        }
    }

    public void fillInElement(WebElement element, String text){
        try {
            element.clear();
            element.sendKeys(text);
            logger.info("field : " + element.getAccessibleName() + " was filled in with : "+ text);
        }catch (Exception e){
            printErrorAndStopTest(e);
        }

    }
    public boolean checkCurrentPageUrl(String url){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals(url)) return true;
        else return false;
    }


    private void printErrorAndStopTest(Exception e) {
        logger.error("Cannot work with element " + e);
        Assert.fail("Cannot work with element " + e);
    }
}
