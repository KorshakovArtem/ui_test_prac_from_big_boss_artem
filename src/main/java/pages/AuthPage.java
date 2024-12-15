package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage extends BasePage {
    By loginField = By.xpath("//*[@placeholder='Логин']");
    By PasswordField = By.xpath("//*[@placeholder='Пароль']");
    By SubmitButton = By.xpath("//button[@type='submit']");
    private pages.MainPage MainPage;

    public AuthPage(WebDriver driver) {
        super(driver);
    }
    public MainPage login (String login, String password) {
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(PasswordField).sendKeys(password);
        driver.findElement(SubmitButton).click();
        return MainPage;

    }



}
