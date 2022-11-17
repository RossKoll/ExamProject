package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage{

    private String URL = baseUrl + getRelativeUrl();

    @Override
    protected String getRelativeUrl() {
        return "/text-box";
    }

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement inputFieldFullName;

    @FindBy(id = "userEmail")
    WebElement inputFiledEmail;


    @FindBy(id = "currentAddress")
    WebElement inputFiledCurrentAddress;

    @FindBy(id = "permanentAddress")
    WebElement inputFieldPermanentAddress;

    @FindBy(id = "submit")
    WebElement buttonSubmit;

    @FindBy(id = "output")
    WebElement resultTable;

    @FindBy(id = "name")
    WebElement nameOutput;

    @FindBy(id = "email")
    WebElement emailOutput;

    @FindBy(id = "output")
    WebElement currentAddressOutput;

    @FindBy(id = "output")
    WebElement permanentAddressOutput;

    public WebElement getEmailOutput() {
        return emailOutput;
    }

    public WebElement getCurrentAddressOutput() {
        return currentAddressOutput;
    }

    public WebElement getPermanentAddressOutput() {
        return permanentAddressOutput;
    }

    public WebElement getNameOutput() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(250,250)");
        return nameOutput;
    }

    public WebElement getResultTable() {
        return resultTable;
    }

    public TextBoxPage openTextBoxPage(){
        openPage(URL);
        return this;
    }


    public TextBoxPage fillInFullName(String fullName){
        fillInElement(inputFieldFullName, fullName);
        return this;
    }

    public TextBoxPage fillInEmail(String email){
        fillInElement(inputFiledEmail, email);
        return this;
    }

    public TextBoxPage fillInCurrentAddress(String currentAddress){
        fillInElement(inputFiledCurrentAddress,currentAddress);
        return this;
    }

    public TextBoxPage fillInPermanentAddress(String permanentAddress){
        fillInElement(inputFieldPermanentAddress, permanentAddress);
        return this;
    }

    public void clickOnSubmitButton(){
        clickOnElement(buttonSubmit);
    }
}
