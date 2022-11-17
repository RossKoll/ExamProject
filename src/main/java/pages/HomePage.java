package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private final String URL = baseUrl + getRelativeUrl();

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(){
        openPage(URL);
    }

    public boolean isHomePageOpened(){
        return checkCurrentPageUrl(URL);
    }
}
