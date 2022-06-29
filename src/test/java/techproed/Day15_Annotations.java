package techproed;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Day15_Annotations {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }


    @Test(priority=2)
    public void ztest1(){
        System.out.println("Test1");
    }

    @Test(priority=1)
    public void test2(){
        System.out.println("Test2");
    }

    @Test (enabled = false)
    public void test3(){
        System.out.println("Test3");
    }

    @Test @Ignore
    public void test4(){
        System.out.println("Test4");
    }


    @Test(priority=3)
    public void atest5(){
        System.out.println("Test5");
    }

    @Test
    public void test6(){
        System.out.println("Test 6");
    }

    @Test
    public void test7(){
        System.out.println("Test 7");
    }


    /*
    1) @Test: creates test case/method : we started with this one

    2) @Before methodlari soldaki siralamaya gore calisir, methodun ustunde, classin ustunde etc..
    !!!!!! suite> test groups> groups>class>methods
    @BeforeMethod : before every method (same as @Before in JUNIT)
    @BeforeClass : before every class
    @BeforeTest :before every test
    @BeforeSuit :before suit
    @BeforeGroups :before groups

    3) @After methods: after every method
    @AfterTest:(Same as @After at JUNIT)
    usttekiyle ayni cesitleri

    4) @Ignore :Yazildigi testi calistirmaz

    5) @Test(enable=false) :bu da testin calismamasini saglar (ama bu testin basindaki run'i bile kaldirir,disabled yapar)

    !!!!! TestNG de testler harf sirasina gore calisir( junitde top to buttom calisir)
    public void atest5 /public void ztest1 yazarsak once atest5 i calistirir

    6) @Test(priority=1) : hangi sirayla yazarsam oyle calisir, alfabetik orderin onemi kalmaz

    //eger ayni classin icinde hem priority olanlar, hem olmayanlar varsa,
    prioritylerde eksi olan varsa ordan baslar, sonra hic priority olmayanlari alphabetical olarak calistirir
    sonra prioritye gore calistirir
    //yani priority yazmayanlarin yaninda aslinda gorunmez bir (priority=0 )yazar
    //eger hepsi ayni prioritye sahipse , bu sefer yine alphabetical ordera gore calisir

    ****int question: how do you organize test order in TestNg?




    */







}