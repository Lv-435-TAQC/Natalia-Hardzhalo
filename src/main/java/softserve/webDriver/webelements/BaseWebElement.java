package softserve.webDriver.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseWebElement {
    protected WebElement element;

    public BaseWebElement(WebDriver driver, String locator) {
        this.element = driver.findElement(By.xpath(locator));
    }
}
