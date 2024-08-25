package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {

    public static WebDriver driver;

    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jangkau-delta.vercel.app/");
    }

    public static void stopDriver(){
        if(driver!=null){
            driver.quit();
        }
    }
}
