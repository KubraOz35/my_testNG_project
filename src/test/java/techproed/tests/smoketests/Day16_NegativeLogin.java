package techproed.tests.smoketests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Day16_NegativeLogin {


    HomePage homePage; //i will use just Login link
    LoginPage loginPage;  //i will use username box,password box,submit button
    Faker faker;
    @Test
    public void negativeLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage=new HomePage();
        loginPage=new LoginPage();
        faker=new Faker();

        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(faker.internet().emailAddress());
        loginPage.password.sendKeys(faker.internet().password());
        loginPage.loginButton.click();

        //verification
        ReusableMethods.waitForVisibility(loginPage.invalidCredentialsErrorMessage,5);
        Assert.assertTrue(loginPage.invalidCredentialsErrorMessage.isDisplayed());
        //Failed
        //thread.sleep==>not recommended
        //we added explicit wait from reusable methods page






    }
}
