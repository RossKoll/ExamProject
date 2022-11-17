package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTables extends BasePage{

    private String URL = baseUrl + getRelativeUrl();

    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    private WebElement buttonAdd;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='age']")
    private WebElement inputAge;

    @FindBy(xpath = "//input[@id='salary']")
    private WebElement inputSalary;

    @FindBy(xpath = "//input[@id='department']")
    private WebElement inputDepartment;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement buttonSubmit;


    private String deleteUserInTable = "//div[text()='%s']/following::span[@title='Delete']";
    private String userInTableLocator = ".//*[text()='%s']";

    @Override
    protected String getRelativeUrl() {
        return "/webtables";
    }

    public WebTables(WebDriver driver) {
        super(driver);
    }

    public WebTables openWebTablesPage(){
        openPage(URL);
        return this;
    }

    public WebTables clickOnAddButton(){
        clickOnElement(buttonAdd);
        return this;
    }

    public WebTables fillInFirstName(String name){
        fillInElement(inputFirstName,name);
        return this;
    }

    public WebTables fillInLastName(String lastName){
        fillInElement(inputLastName,lastName);
        return this;
    }

    public WebTables fillInEmail(String email){
        fillInElement(inputEmail,email);
        return this;
    }

    public WebTables fillInAge(String age){
        fillInElement(inputAge,age);
        return this;
    }

    public WebTables fillInSalary(String salary){
        fillInElement(inputSalary, salary);
        return this;
    }

    public WebTables fillInDepartment(String department){
        fillInElement(inputDepartment, department);
        return this;
    }

    public WebTables clickOnSubmitButton(){
        clickOnElement(buttonSubmit);
        return this;
    }


    public boolean isUserPresentInTable(String name){
        return driver.findElement(By.xpath(String.format(userInTableLocator,name))).isDisplayed();
    }

    public void deleteUserAfterTest(String name){
        WebElement deleteButton = driver.findElement(By.xpath(String.format(deleteUserInTable, name)));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(String.format(deleteUserInTable, name))));
        //clickOnElement(deleteButton);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", deleteButton);

    }
}
