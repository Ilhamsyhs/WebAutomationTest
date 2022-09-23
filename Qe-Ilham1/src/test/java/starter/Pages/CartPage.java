package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com")
public class CartPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private By cartButton = By.className("shopping_cart_link");
    private final By cartHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private By checkoutButton = By.id("checkout");


    public String getUrl(){
        return driver.getCurrentUrl();

    }

    public void ClickCart(){
        driver.findElement(cartButton).click();
    }

    public void ClickCheckout(){
        driver.findElement(checkoutButton).click();
    }


    public void selectRemove(String item){
        driver.findElement(By.id(item));
    }

    public String getCartHeader(){
        return driver.findElement(cartHeader).getText();
    }
}
