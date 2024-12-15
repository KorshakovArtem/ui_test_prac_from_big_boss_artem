package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthPage;
import pages.MainPage;

public class MainPageTest extends BaseTest {


    @Test
    public void openClickOnDynamicIdButtonTest() {
        new MainPage(driver)
                        .clickOnDynamicIdButton()
                        .clickOnRecordButton();
        tearDown();
    }
}
