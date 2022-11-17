package checkboxTest;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class CheckboxTest extends BaseTest {


    @Test
    public void checkDownloadCheckboxIsSelected(){
        checkBoxPage.openCheckBoxPage()
                .clickOnExpandButton()
                .clickOnDownloadCheckbox();
        String validationMessage = checkBoxPage.getValidationMessageText();
        Assert.assertEquals("Validation message is different","You have selected :downloadswordFileexcelFile", validationMessage);
    }

}
