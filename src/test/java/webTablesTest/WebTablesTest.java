package webTablesTest;

import baseTest.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class WebTablesTest extends BaseTest {

    private String firstName = "firstName";

    @Test
    public void checkWebTableIsFilledIn(){
        webTables.openWebTablesPage()
                .clickOnAddButton()
                .fillInFirstName(firstName)
                .fillInLastName("LastName")
                .fillInEmail("fake@email.com")
                .fillInAge("33")
                .fillInSalary("3500")
                .fillInDepartment("IT")
                .clickOnSubmitButton();

        Assert.assertTrue("", webTables.isUserPresentInTable(firstName));

    }


    @After
    public void deleteUser(){
        webTables.deleteUserAfterTest(firstName);
    }
}
