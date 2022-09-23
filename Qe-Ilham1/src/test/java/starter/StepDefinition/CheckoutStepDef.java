package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.CheckoutPage;
import starter.Pages.CheckoutPage2;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class CheckoutStepDef {

    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutPage2 checkoutPage2;

    @And("I click on cart button")
    public void ClickCartButton(){
        cartPage.ClickCart();
    }

    @When("I click checkout")
    public void ClickCheckout(){
        cartPage.ClickCheckout();
//        assertEquals("YOUR CART", cartPage.getCartHeader());
    }

    @And("I input firstname {string}")
    public void InputFirstname(String firstname){
        checkoutPage.InputFName(firstname);
    }

    @And("I input lastname {string}")
    public void InputLastname(String lastname){
        checkoutPage.InputLName(lastname);
    }

    @And("I input postal code {string}")
    public void InputPostalCode(String postal){
        checkoutPage.InputPCode(postal);
    }

    @And("I click continue button")
    public void ContinueButton(){
        checkoutPage.ContinueB();
    }

    @And("I click finish button")
    public void ClickFinish(){
        checkoutPage2.ClickFinish();

    }

    @Then("I successfully checkout item")
    public void Success(){
//        assertEquals("CHECKOUT: COMPLETE!", checkoutPage2.getUrl());

    }
}
