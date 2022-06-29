package techproed.tests.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day18_DataProvider1 {


  /*
    DATA PROVIDER: It is a TestNG annotation. It is used to get the list of data
    1. Create a method
    2. Use @DataProvider
    3. Add the data

    We can add alternative name to DataProvider using (name = "alternative name")

    How to pass data from a method to test method with data provider?
    Add (dataProvider = "name") near the @Test annotation
     */

    @DataProvider (name = "customer-login-data" )
    public Object [][] dataProviderMethod(){

        Object [][] customerCredential = {
                {"customer@bluerentalcars.com","12345"},
                {"customer1@bluerentalcars.com","12346"},
                {"customer2@bluerentalcars.com","12347"},
                {"customer3@bluerentalcars.com","12348"}
        };
        return customerCredential;
    }


    @Test(dataProvider = "customer-login-data",groups = "smoke-group-1")
    public void customerLoginInfo(String username, String password){
        System.out.println("Username: " + username + " || password: " + password);
    }

}