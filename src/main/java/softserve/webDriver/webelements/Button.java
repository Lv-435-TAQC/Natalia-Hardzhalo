package softserve.webDriver.webelements;

import softserve.webDriver.Utils.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button extends BaseWebElement {
    private WebElement element;

    public Button(WebDriver driver, String locator) {
        super(driver, locator);
    }

    public void clickNext(){
        this.element.click();
    }

}
