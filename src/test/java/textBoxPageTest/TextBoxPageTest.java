package textBoxPageTest;

import baseTest.BaseTest;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TextBoxPageTest extends BaseTest {

    String username = "Ross Ko";
    String email = "test@gmail.com";
    String currentAddress = "Current_address";
    String permanentAddress = "Permanent_address";
    @Test
    public void fillInRegisterForm() throws InterruptedException {
        long start = System.currentTimeMillis();
        textBoxPage
                .openTextBoxPage()
                .fillInFullName(username)
                .fillInEmail(email)
                .fillInCurrentAddress(currentAddress)
                .fillInPermanentAddress(permanentAddress)
                .clickOnSubmitButton();
        Assert.assertTrue(textBoxPage.getResultTable().isDisplayed());


        Assert.assertTrue("Username output does not match", textBoxPage.getNameOutput().getText().contains(username));
        Assert.assertTrue("Email output does not match", textBoxPage.getEmailOutput().getText().contains(email));
        Assert.assertTrue("Current address output does not match", textBoxPage.getCurrentAddressOutput().getText().contains(currentAddress));

//        Thread.sleep(2000);
//        String curAd = textBoxPage.getCurrentAddressOutput().getAccessibleName();
//        Assert.assertTrue("Current Address output does not match", textBoxPage.getCurrentAddressOutput().getText().contains(currentAddress));
//
//        String vareturnValur = textBoxPage.getPermanentAddressOutput().getText();
       Assert.assertTrue("Permanent address output does not match", textBoxPage.getPermanentAddressOutput().getText().contains(permanentAddress));
        logger.info(" Time to runt test is : " + (System.currentTimeMillis()-start));
    }

}
