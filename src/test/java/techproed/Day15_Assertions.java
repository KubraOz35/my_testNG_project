package techproed;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day15_Assertions {

    @Test
    public void hardAssert(){
        System.out.println("Line 9");
        System.out.println("Line 10");
        Assert.assertEquals(3,4);  //will fail, so under this line "ONLY IN THIS TEST CASE" will not run more
        System.out.println("Line 13");
        Assert.assertEquals(2,2);
    }

    @Test
    public void testCase(){                     //since this is not dependent to hardAssert method, it will run dependently
        System.out.println("Line 19");
        System.out.println("Line 20");
    }

    @Test(dependsOnMethods = "hardAssert")      //bu method hardAsserte bagli old. icin,o durunca, bu da calismaz
    public void dependentMethodDemo(){
        System.out.println("line 25");//runs
        System.out.println("line 26");//runs
    }

    @Test
    public void softAssert(){
//        Soft assertion:verification , test continue even after failure
        //1)create softAssert object
        SoftAssert softAssert=new SoftAssert();
        System.out.println("Line34");
        //2)use it with assertions
        softAssert.assertEquals(2,3);
        System.out.println("Line36");
        softAssert.assertEquals(2,2);
        System.out.println("Line 38");
        softAssert.assertEquals(3,5);
        System.out.println("Line40 ");
        //3)use assertAll() to see the result
        softAssert.assertAll();

        //calismaya devam eder ama hangi satirda hata verdigini gostermez , sadece gecmedigini anlariz

    }

}

// int question:
// What is the difference between assertion and verification?
//Assertion means hard assertion, verification means soft assertion
//verification is similar to if else statement
//if hard assertion fails ,rest of the test case stops

//What is the difference between soft assert and soft assert?
//Hard assertion stops execution, after assertion failure.Soft assert continues to execute even after failure
//We need to create a soft assert object to do soft assertion, and We need to add assertAll() at the end

//Which assertion do you prefer?
//I used both, both are useful.But I used hardAssertion the most, because I need to fix the issue the moment it shows up.
//It usually does not make sense to wait for other tests if there is a failure..
//if there are  lots of test cases , I prefer to use hard assert to find the wrong test case quickly to fix it.
// If I use soft assertion, It will run all the tests everytime even there are wrong cases in them.
//I usually use soft assertion when I write new test cases to see if all is good or some of them fail.

/*
PAGE OBJECT MODEL
It is a design pattern, it is for better framework.
in page object models, there are pages and tests..
we will create page objects in pages classes and we will call them from test classes
for example for login button, I will create locator and button object in pages class, and I will call it when I need it
POM makes automation testing more faster and reusable..
In POM , we will have folders, classes and files..
 */