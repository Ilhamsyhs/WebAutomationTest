package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;

public class RemoveStepDef {

    CartPage cartPage;

    @When("I click cart icon")
    public void IClickCartIcon(){
        cartPage.ClickCart();
    }

    @And("I click remove button on {string}")
    public void RemoveButton(String item){
        cartPage.selectRemove(item);
    }

    @Then("Data should be removed")
    public void DataRemoved(){

    }
}
