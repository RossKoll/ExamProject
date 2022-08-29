package homePageTest;

import baseTest.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void openLoginPage(){

        homePage.openHomePage();
        Assert.assertTrue("Home page is not opened", homePage.isHomePageOpened());
    }

}
