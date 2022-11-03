package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;

public class LoginSteps implements CommonPage {

    LoginPage page;
    public LoginSteps() {
        page = new LoginPage();
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

    @Then("Verify page title is {string}")
    public void verify_page_title_is(String title) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), title);
    }

    @Then("Verify {string} button is displayed")
    public void verifyButtonIsDisplayed(String signOutBtn) {

        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(
                XPATH_TEMPLATE_TEXT_CONTAINS, signOutBtn
        ))));
    }

}
