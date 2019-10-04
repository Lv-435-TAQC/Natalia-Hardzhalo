package softserve.webDriver.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import softserve.webDriver.webelements.Button;
import softserve.webDriver.webelements.InputField;

import static softserve.webDriver.Utils.Locators.*;

public class Registration extends BasePageObject {
    private InputField login;
    private InputField password;
    private Button loginButtonNext;
    private Button passwordButtonNext;

    public Registration(WebDriver driver) {
        super(driver);
        this.login = new InputField(this.driver, LOGIN_FIELD);
        this.loginButtonNext = new Button(this.driver, LOGIN_BUTTON_NEXT);
    }

    public Home login(String login, String password){
        this.login.inputData(login);
        this.loginButtonNext.clickNext();

        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PASSWORD_FIELD)));

        this.password = new InputField(this.driver, PASSWORD_FIELD);
        this.password.inputData(USER_PASSWORD);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PASSWORD_BUTTON_NEXT)));
        this.passwordButtonNext = new Button(driver, PASSWORD_BUTTON_NEXT);
        this.passwordButtonNext.clickNext();

        return new Home(driver);
    }



}
