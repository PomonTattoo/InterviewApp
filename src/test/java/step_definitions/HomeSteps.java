package step_definitions;


import io.cucumber.java.en.Given;
import pages.CommonPage;
import pages.HomePage;
import utils.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;

import pages.CommonPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BrowserUtils;
import java.util.List;

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


    @And("I click a {string}")
    public void iClickA(String btn) {
        BrowserUtils.click(page.deleteBtn);

    }
    @Then("Verify the field displays {string} you entered")
    public void verifyTheFieldDisplaysYouEntered(String question) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS , question))));
    }


    @Then("Verify the field doesn't display {string} is deleted")
    public void verifyTheFieldDoesnTDisplayIsDeleted(String question) {
        BrowserUtils.assertTrue(BrowserUtils.isEnabled(page.deleteBtn));

    }

    @And("I click {string} button")
    public void iClickButton(String edit) {
        BrowserUtils.click(page.editBtn);
    }

    @And("I enter {string}")
    public void iEnter(String text) {
page.textArea.sendKeys(text);
    }

    @And("I click {string}")
    public void iClick(String submit) {
        BrowserUtils.click(page.submitBtn);
    }

    @Then("Verify if {string} text changed")
    public void verifyIfTextChanged(String text) {
        BrowserUtils.assertTrue(page.field2.getText().contains(text));
    }

    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify {string} is dispayed")
    public void verifyIsDispayed(String text) {

        BrowserUtils.assertTrue(page.field2.getText().contains(text));
    }

    @Then("I click a button {string}")
    public void iClickAButton(String button) {
        switch (button.toLowerCase()) {
            case "login":
                BrowserUtils.click(page.loginBtn);
                break;
            case "add don't":
                BrowserUtils.click(page.addDontBtn);
                break;
            default:
                BrowserUtils.click(BrowserUtils.getDriver().findElement(
                        By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))));
        }
    }

    @Then("Verify there are three items on dashboard:")
    public void verifyThereAreItemsOnDashboard(List<String> dataTable) {
        for(String each: dataTable){
            BrowserUtils.isDisplayed(
                    BrowserUtils.getDriver().findElement(
                            By.xpath(String.format(XPATH_TEMPLATE_BUTTON, each))
                    )
            );
        }
    }

    @Then("I type {string} in a {string} text field")
    public void iTypeInATextField(String value, String string) {
        if (string.equalsIgnoreCase("do's")) {
            BrowserUtils.sendKeys(page.doTxtField, value);

        } else {
            BrowserUtils.sendKeys(page.dontTextField, value);
        }

    }


    @Then(": Verify All Topics button is enable")
    public void verifyAllTopicsButtonIsEnable() {
        BrowserUtils.isEnabled(
                BrowserUtils.getDriver().findElement(
                        By.xpath("//button[text()='All Topics']"))
        );
    }




    @Then("Verify link text {string} is display")
    public void verifyLinkTextIsDisplay(String link) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, link))));
    }

    @Then("I click a button sign out")
    public void iClickAButtonSignOut(String button) {
        BrowserUtils.isDisplayed(BrowserUtils.getDriver().findElement
                (By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))));

    }
}




