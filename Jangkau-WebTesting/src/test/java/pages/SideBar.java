package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import java.time.Duration;

public class SideBar extends BrowserDriver {

    private WebDriverWait wait;

    //Locators or elements
    private By berandaButton = By.xpath("//*[contains(@aria-label, 'Tombol Beranda')]");
    private By transferButton = By.xpath("//*[contains(@aria-label, 'Tombol Transfer')]");
    private By mutasiButton = By.xpath("//*[contains(@aria-label, 'Tombol Mutasi')]");
    private By keluarButton = By.xpath("//*[contains(@aria-label, 'Keluar')]");

    //Constructor
    public SideBar(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

    //Page Methods/Actions
    public void validateSideBar(){
        wait.until((ExpectedConditions.presenceOfElementLocated(berandaButton)));
        wait.until(ExpectedConditions.presenceOfElementLocated(transferButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(mutasiButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(keluarButton));
    }
    public void clickBerandaButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(berandaButton)).click();
    }
    public void clickTransferButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(transferButton)).click();
    }
    public void clickMutasiButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mutasiButton)).click();
    }
    public void clickKeluarButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(keluarButton)).click();
    }

}
