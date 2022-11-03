package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

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

    @FindBy(xpath = "(//button[@class='btn btn-sm-outline-danger ml-1'])[1]")
    public WebElement deleteBtn;

    @FindBy(xpath = "(//button[@class='btn btn-sm-outline-warning'])[1]")
    public WebElement  editBtn;

    @FindBy(xpath = "//textarea[text()]")
    public WebElement textArea;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success']")
    public WebElement submitBtn;

    @FindBy(xpath="//p[text()='what time is it?   It is 10   ']")
    public WebElement field2;

    @FindBy(xpath = "what time is it?   ")
    public WebElement field1;



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

