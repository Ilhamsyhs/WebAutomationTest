package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://www.saucedemo.com/")
public class InventoryPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon = By.cssSelector("#shopping_cart_container > a");
    private final By sortingDropDown = By.className("product_sort_container");
    private final By sortActive = By.className("active_option");





    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public String getHeaderTitle(){
        return driver.findElement(headerTitle).getText();
    }

    public boolean isCartVisible(){
        return driver.findElement(cartIcon).isDisplayed();
    }

    public void selectItem(String item){
        driver.findElement(By.id(item)).click();
    }



    public void selectSortBy(String sortBy){
        Select dropdown = new Select(driver.findElement(sortingDropDown));
        dropdown.selectByVisibleText(sortBy);
    }

    public String getActiveSort(){
        return driver.findElement(sortActive).getAttribute("innerHTML");
    }


}
