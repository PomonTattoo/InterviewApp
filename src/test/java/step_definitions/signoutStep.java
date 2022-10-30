package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utils.BrowserUtils;

public class signoutStep {
    @When("I click sign out button")
    public void i_click_sign_out_button() {
        BrowserUtils.getDriver().findElement(By.xpath("//u[text()='Sign out']"));

    }
   // @Then("I am able to sign out successful")
    //public void i_am_able_to_sign_out_successful() {

    }


