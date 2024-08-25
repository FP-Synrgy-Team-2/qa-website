package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class ReceiptPage extends BrowserDriver {
    WebDriverWait wait;

    //Locators or elements
    private By transaksiText = By.xpath("//h1[text()='Tranksaksi Berhasil']");
    private By unduhButton = By.xpath("//button[text()=' Unduh']");
    private By dashboardButton = By.xpath("//button[text()='Dashboard']");

    //Constructor buat manggil wait
    public ReceiptPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void validateOnReceiptPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(transaksiText));
        wait.until(ExpectedConditions.presenceOfElementLocated(unduhButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(dashboardButton));
    }
    public void clickUnduhButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(unduhButton)).click();
    }
    public void clickDashboardButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(dashboardButton)).click();
    }
}
