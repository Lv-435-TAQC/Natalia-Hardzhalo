package softserve.webDriver.pageobject;

import org.openqa.selenium.WebDriver;

public abstract class BasePageObject {
    public WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public BasePageObject goToURL(String string){
        this.driver.get(string);
        return this;
    }

    public Registration goToRegis(){
        driver.get("https://mail.google.com");
        return new Registration(driver);
    }
}
