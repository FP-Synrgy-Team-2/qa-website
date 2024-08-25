package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class MutationPage extends BrowserDriver {
    WebDriverWait wait;

    //Locators or elements


    //Constructor buat manggil wait
    public MutationPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
