package textBoxPageTest;

import baseTest.BaseTest;
import org.junit.Test;

public class TextBoxPageTest extends BaseTest {

    @Test
    public void fillInRegisterForm(){
        textBoxPage
                .openTextBoxPage()
                .fillInFullName("Ross Ko")
                .fillInEmail("test@gmail.com")
                .fillInCurrentAddress("Current address")
                .fillInPermanentAddress("Permanent address")
                .clickOnSubmitButton();

    }
}
