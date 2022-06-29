package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DefaultPage;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day16_PositiveLogin {
    HomePage homePage;
    LoginPage loginPage;
    DefaultPage defaultPage;
    @Test
    public void adminLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("Admin_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("Admin_password"));
        loginPage.loginButton.click();
//        Verification
        Thread.sleep(10000);
//        Assert.assertTrue(defaultPage.userID.isDisplayed());
     //   Driver.closeDriver();
    }
    @Test(groups = "smoke-group-1")
    public void customerLogin() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("customer_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        loginPage.loginButton.click();
//        Verification
        Thread.sleep(10000);

 //       Assert.assertTrue(defaultPage.userID.isDisplayed());

    }
}