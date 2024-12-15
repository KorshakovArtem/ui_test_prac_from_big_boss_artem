package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicIdExc extends BasePage {
    By recordButton = By.xpath("//*[@id='btn btn-primary']");

    public DynamicIdExc(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickOnRecordButton(){
        driver.findElement(recordButton).click();
    }

}
