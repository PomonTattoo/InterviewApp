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

public class HomeSteps implements CommonPage {
    LoginPage loginPage;
    HomePage page;

    public HomeSteps() {
        page = new HomePage();
        loginPage = new LoginPage();
    }

    @When("I click a navBtn {string}")
    public void iClickANavBtn(String navBtn) {
        BrowserUtils.click(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, navBtn))));
        BrowserUtils.switchToNewWindow();
    }


    @And("I click a windowBtn {string}")
    public void iClickAWindowBtn(String windowBtn) {
        BrowserUtils.click(page.newQuestionBtn);
    }
    @And("Enter content {string}")
    public void enterContent(String content) {
        BrowserUtils.sendKeys(page.field, content);
    }

    @Then("Verify {string} is dispayed")
    public void verifyIsDispayed(String text) {
        BrowserUtils.assertTrue(page.field2.getText().contains(text));
    }
}