package starter.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;
public class FilterStepDef {

    InventoryPage inventoryPage;

    @When("I click sort by {string}")
    public void IClickSortBy(String sortBy){
        inventoryPage.selectSortBy(sortBy);
    }

    @Then("Item should be filtered by {string}")
    public void ItemShouldbeFilteredBy(String string){
        assertEquals(string, inventoryPage.getActiveSort());
    }

}
