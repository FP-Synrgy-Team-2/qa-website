package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class TransferPage extends BrowserDriver {
    private WebDriverWait wait;

    public String transferPageURL = "https://jangkau-delta.vercel.app/transfer";

    //Locators or elements
    private By transferPageValidator = By.xpath("//a[text()='Transfer' and @href='/transfer']");
    private By inputBaruButton = By.xpath("//*[contains(@aria-label, 'tombol transfer rekening baru')]");
    private By pilihRekeningButton = By.xpath("//*[contains(@aria-label, 'tombol pilih nomor rekening yang tersimpan')]");

    //Rekening
    private By adminRekeningButton = By.xpath("//*[contains(@aria-label, 'admin')]");
    private By johnRekeningButton = By.xpath("//*[contains(@aria-label, 'john')]");

    //Constructor
    public TransferPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void validateOnTransferPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(transferPageValidator));
    }
    public void clickInputBaruButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(inputBaruButton)).click();
    }
    public void clickPilihRekeningButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(pilihRekeningButton)).click();
    }
    public void clickAdminRekeningButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(adminRekeningButton)).click();
    }
    public void clickJohnRekeningButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(johnRekeningButton)).click();
    }

    public void clickPilihRekeningButtonUntilElementAppears() {
        // Define the maximum wait time for the target element to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Set a condition to continue clicking until the target element appears
        for (int attempts = 0; attempts < 10; attempts++) {
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(pilihRekeningButton)).click();

                if (wait.until(ExpectedConditions.presenceOfElementLocated(adminRekeningButton)) != null) {
                    break;
                }
            } catch (TimeoutException e) {
                System.out.println("Attempt " + (attempts + 1) + ": Target element not found, retrying...");
            }
        }
    }

}
