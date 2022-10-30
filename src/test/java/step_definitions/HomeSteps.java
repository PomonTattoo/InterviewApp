package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommonPage {
    HomePage page;
    public HomeSteps() {
        page = new HomePage();
    }

    @Given("I open URL of login page")
    public void i_open_url_of_login_page() {
        BrowserUtils.getDriver();
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        BrowserUtils.sendKeys(page.username, username);

    }
    @When("I enter password {string}")
    public void i_enter_password(String password) {
        BrowserUtils.sendKeys(page.password, password);
    }

    @And("I click a button {string}")
    public void iClickAButton(String login) {
        BrowserUtils.click(page.loginBtn);
    }

    @Then(": Verify All Topics button is enable")
    public void verifyAllTopicsButtonIsEnable() {
        BrowserUtils.isEnabled(
                BrowserUtils.getDriver().findElement(
                        By.xpath("//button[text()='All Topics']"))
        );
    }

//    @Then("Verify title of the page")
//    public void verifyTitleOfThePage() {
//        System.out.println("Test");
//    }
}
