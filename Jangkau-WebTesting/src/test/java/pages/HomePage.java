package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class HomePage extends BrowserDriver {

    WebDriverWait wait;

    //Locators or elements
    //Page validator
    private By berandaPageValidator = By.xpath("//*[contains(@aria-label, 'Banner homepage Nikmati kemudahan transaksi menggunakan internet banking')]");
    private By berandaPageValidator2 = By.xpath("//*[contains(@aria-label, 'mutasi rekening')]");

    //Rekening information section
    private By nomorRekeningText = By.id("rekening");
    private By saldoText = By.id("saldo");
    private By tampilkanSemuaButton = By.xpath("//*[contains(@aria-label, 'tombol tampilkan semua transaksi')]");
    private By salinRekeningButton = By.xpath("//*[contains(@alt, 'tombol salin rekening')]");
    private By sembunyikanSaldoButton = By.xpath("//*[contains(@aria-label, 'tombol sembunyikan saldo')]");
    private By tampilkanSaldoButton = By.xpath("//*[contains(@aria-label, 'tombol tampilkan saldo')]");

    private By transferAdminButton = By.xpath("//*[contains(@aria-label, 'Tombol transfer ke admin')]");
    private By transferJohnButton = By.xpath("//*[contains(@aria-label, 'Tombol transfer ke john doe')]");

    //Constructor buat manggil wait
    public HomePage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void validateOnBerandaPage(){
        wait.until((ExpectedConditions.presenceOfElementLocated(berandaPageValidator)));
        wait.until(ExpectedConditions.presenceOfElementLocated(berandaPageValidator2));
    }
    public String getNomorRekeningText(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(nomorRekeningText)).getText();
    }
    public String getSaldoText(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(saldoText)).getText();
    }

    public void clickTampilkanSemuaButton(){ driver.findElement(tampilkanSemuaButton).click(); }
    public void clickSalinRekeningButton(){ driver.findElement(salinRekeningButton).click(); }

    public void clickSembunyikanSaldoButton(){ driver.findElement(sembunyikanSaldoButton).click(); }
    public void clickTampilkanSaldoButton(){ driver.findElement(tampilkanSaldoButton).click(); }

    public void clickTransferAdminButton(){ driver.findElement(transferAdminButton).click(); }
    public void clickTransferJohnButton(){ driver.findElement(transferJohnButton).click(); }

}
