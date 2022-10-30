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




    @FindBy(xpath = "//u[text()='Sign out']" )
    public WebElement signoutBtn;

    @FindBy(xpath = "//textarea")
    public WebElement field;

    @FindBy(xpath = "(//a[@href='javascript:;'])[1]")
    public WebElement field2;
}


    @FindBy(xpath = "//input[@placeholder='Enter Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    public WebElement password;


    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(id = "inputArea1")
    public WebElement doTxtField;

    @FindBy(id = "inputArea2")
    public WebElement dontTextField;

    @FindBy(xpath = "//button[text()=\"Add don't \"]")
    public WebElement addDontBtn;


   // @FindBy(xpath = "//u[text()='Sign out']")
   // public WebElement SignoutBtn;

}

}

