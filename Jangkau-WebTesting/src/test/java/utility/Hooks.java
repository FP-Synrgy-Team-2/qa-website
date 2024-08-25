package utility;

import io.cucumber.java.*;

public class Hooks {

    @Before
    public static void beforeAll(){
        BrowserDriver.setupDriver();
    }

    @After
    public static void afterAll(){
        BrowserDriver.stopDriver();
    }

}
