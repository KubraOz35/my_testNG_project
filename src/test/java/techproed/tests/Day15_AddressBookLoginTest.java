package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.AddressBookLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day15_AddressBookLoginTest {

    AddressBookLoginPage addressBookLoginPage= new AddressBookLoginPage(); //bunu objeyi olusturduk diger siniftan datayi cagirmak icin

    @Test(groups = "smoke-group-1")
    public void loginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("address_url"));       //bu dynamic
//        addressBookLoginPage.username.sendKeys("testtechproed@gmail.com");  //bunlar hardcode
//        addressBookLoginPage.password.sendKeys("Test1234!");                //bu da hard code


        addressBookLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));   //now they are dynamic
        addressBookLoginPage.password.sendKeys(ConfigReader.getProperty("address_pass"));
        addressBookLoginPage.loginButton.click();

        Driver.closeDriver();
    }

}

/*first I create page objects in pages class, than i create my test class, I create an object again to call the data from pages class
and login with the information dynamically..
 */