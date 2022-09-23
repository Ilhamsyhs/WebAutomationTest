package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class AddToCartStepDef {

    InventoryPage inventoryPage;


    @When("I select item {string}")
    public void ISelectItem(String item){
        inventoryPage.selectItem(item);
    }

    @Then("{string} should be added to cart")
    public void ItemShouldbeAddedtoCart(String string){
        //assertEquals("https://saucedemo.com/cart.html", cartPage.getUrl());
        //assertEquals("YOUR CART", cartPage.getHeaderTitle());
//        assertEquals("REMOVE", inventoryPage.getButtonActive());

    }

    @And("I Already had {string} in cart")
    public void IAlreadyhaditeminCart(String item){
        inventoryPage.selectItem(item);
        //assertEquals("REMOVE", inventoryPage.getButtonActive());
    }

    @And("I had item {string} in cart")
    public void IHadIteminCart(String item){
        inventoryPage.selectItem(item);
    }



}
