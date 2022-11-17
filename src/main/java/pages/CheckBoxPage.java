package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxPage extends BasePage{

    @FindBy(xpath = "//button[@aria-label='Expand all']")
    private WebElement expandButton;

    @FindBy(xpath = "//label[@for='tree-node-downloads']/descendant::span[1]")
    public WebElement checkboxDownload;

    private String URL = baseUrl + getRelativeUrl();

    @Override
    protected String getRelativeUrl() {
        return "/checkbox";
    }

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public CheckBoxPage clickOnExpandButton(){
        clickOnElement(expandButton);
        return this;
    }

    public CheckBoxPage openCheckBoxPage(){
        openPage(URL);
        return this;
    }

    public CheckBoxPage clickOnDownloadCheckbox(){
        clickOnElement(checkboxDownload);
        return this;
    }

    public String getValidationMessageText(){
        String text="";
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='result']/span"));
        for (WebElement element : elements) {
           text += element.getText();
        }
        return text;
    }


}
