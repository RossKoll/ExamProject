package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends CommonActionWithElements{

    public BasePage(WebDriver driver) {
        super(driver);
    }
}
