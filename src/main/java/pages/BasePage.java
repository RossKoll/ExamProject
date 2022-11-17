package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends CommonActionWithElements{

    protected String baseUrl = "https://demoqa.com";

    protected abstract String getRelativeUrl();
    public BasePage(WebDriver driver) {
        super(driver);
    }
}
