package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(id = "sample")
    public WebElement sampleElement;

    @FindBy(xpath = "//u[text()='Sign out']" )
    public WebElement signoutBtn;

}
