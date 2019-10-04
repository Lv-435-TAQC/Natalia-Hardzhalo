package softserve.webDriver.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputField extends BaseWebElement {

    public InputField(WebDriver driver, String locator) {
        super(driver, locator);
    }

    public void inputData(String key){
         this.element.sendKeys(key);
      //  return this;
    }

    public String getData(){
        return this.element.getText();
    }
}
