package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://www.saucedemo.com/")
public class CheckoutPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();


    private By fieldfname = By.id("first-name");
    private By fieldlname = By.id("last-name");
    private By fieldpcode = By.id("postal-code");
    private By continueB = By.id("continue");
    private final By ch1Header = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    public void InputFName(String firstname){
        driver.findElement(fieldfname).sendKeys(firstname);
    }

    public void InputLName(String lastname){
        driver.findElement(fieldlname).sendKeys(lastname);
    }

    public void InputPCode(String postal){
        driver.findElement(fieldpcode).sendKeys(postal);
    }

    public void ContinueB(){
        driver.findElement(continueB).click();
    }

    public String getHeadC1(){
        return driver.findElement(ch1Header).getText();
    }


}
