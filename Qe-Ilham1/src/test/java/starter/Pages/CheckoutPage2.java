package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class CheckoutPage2 extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private By finishB = By.id("finish");
    private final By headCh2 = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public String getUrl(){
        return driver.getCurrentUrl();
    }


    public void ClickFinish(){
        driver.findElement(finishB).click();
    }

    public String HeaderCh2(){
        return driver.findElement(headCh2).getText();
    }

}
