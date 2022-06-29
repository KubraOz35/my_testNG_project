package techproed.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AmazonSigInPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonSignInTest {

    AmazonSigInPage amazonSigInPage = new AmazonSigInPage();//page de olusturdugumuz web elemntlere ulasmak icin obje olusturduk

    @Test
    public void amazonSignInTest() {

        //Go to the Amazon website
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));//burada 2.adim olarak config.properties e ekledigimiz web sitesi adresini cagirdik
        //Click on sign in button
        amazonSigInPage.signInTab.click();
        //send e mail by using faker
        amazonSigInPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        //Click on continue button
        amazonSigInPage.continueButton.click();
        //Assert "There was a problem"  message
        String warningMessageText=amazonSigInPage.warningMessage.getText();
        Assert.assertEquals(warningMessageText,"There was a problem");
        //Click on need help button
        amazonSigInPage.needHelp.click();
        //Click on "Forgot your Password?"
        amazonSigInPage.forgotpassword.click();
        //Verify the text "Password assistance"
        Assert.assertTrue(amazonSigInPage.passwordAssistance.isDisplayed());
        //Navigate back
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        //Click on create account button
        amazonSigInPage.createAccountButton.click();
        //Verify the text "Create account"

        String createAccountText= amazonSigInPage.createAccountText.getText();
        Assert.assertEquals(createAccountText,"Create account");
    }
}