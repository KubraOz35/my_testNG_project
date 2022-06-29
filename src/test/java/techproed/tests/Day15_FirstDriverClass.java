package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.Driver;



public class Day15_FirstDriverClass {

    @Test
    public void firstDriverClass(){
        Driver.getDriver().get("https://www.techproeducation.com");  //driveri actim

        Driver.closeDriver(); //driveri kapattim
    }
}