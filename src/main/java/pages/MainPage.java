package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainPage extends BasePage {

    By dynamicIdButton = By.xpath("//*[@href='/dynamicid']");
    private pages.DynamicIdExc DynamicIdExc;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public DynamicIdExc clickOnDynamicIdButton(){
        driver.findElement(dynamicIdButton).click();
        Assert.assertTrue(isPageOpened("/dynamicid"), "Неверный url");
        return new DynamicIdExc(driver);
    }
}
