package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
@FindBy(xpath = "//button[@class='btn btn-warning badge-pill newbtn']")
    public WebElement newQuestionBtn;

    @FindBy(xpath = "//textarea")
    public WebElement field;

    @FindBy(xpath = "(//a[@href='javascript:;'])[1]")
    public WebElement field2;

    @FindBy(xpath = "(//button[@class='btn btn-sm-outline-danger ml-1'])[1]")
    public WebElement deleteBtn;
}
