package softserve.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import softserve.webDriver.pageobject.BasePageObject;
import softserve.webDriver.pageobject.Registration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();


        BasePageObject page = new Registration(driver);


    }
}
