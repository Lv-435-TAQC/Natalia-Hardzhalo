import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SendMessage {
    public void sendMessageToSomebody(WebDriver driver, String email){
        String xpathToNewLetter = "/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div";

        WebDriverWait wait = new WebDriverWait(driver, 10);


        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathToNewLetter)));
        WebElement element = driver.findElement(By.xpath(xpathToNewLetter));
        element.click();

    }
}
