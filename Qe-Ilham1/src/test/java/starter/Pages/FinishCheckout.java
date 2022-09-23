package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class FinishCheckout extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By headSuccess = By.xpath("//*[@id=\"header_container\"]/div[2]/span");


    public String HeaderSuccess(){
        return driver.findElement(headSuccess).getText();
    }
}
