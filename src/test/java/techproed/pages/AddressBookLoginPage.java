package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AddressBookLoginPage {

    public AddressBookLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
//      It is used for initializing the page object
//      Each page class should have this class
    }

    //alttaki objeleri bir kez olusturdum burda, istedigim test siniflarinda cagirrak tekrar tekrar kullanicam

    @FindBy(id = "session_email")   //we can find it by using all 8 locators , we will use id here to locate username
    public WebElement username;

    @FindBy(id = "session_password")
    public WebElement password;

    @FindBy(xpath = "//input[@name='commit']")
    public WebElement loginButton;

}