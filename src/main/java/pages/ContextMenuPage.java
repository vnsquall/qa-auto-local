package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.find_element;
import static support.SetupTest.driver;

/**
 * Created by namdo on 08/06/2015.
 */
public class ContextMenuPage {
    By contextMenuText = By.xpath("//*[@id='content']/div/h3");
    By menuArea = By.xpath("//*[@id='hot-spot']");

    public Boolean checkContextMenuLoaded() {
        return find_element(contextMenuText).getText().equals("Context Menu");
    }

    public void rightclick_contextMenu() {
        Actions actions = new Actions(driver);
        actions.contextClick(find_element(menuArea)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
    }

    public Boolean checkAlertOpened() throws InterruptedException {
        rightclick_contextMenu();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        return alert.getText().equals("You selected a context menu");
    }

    public void closeAlert() throws InterruptedException {
        rightclick_contextMenu();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
}
