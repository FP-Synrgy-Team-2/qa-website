package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class TransferSavedPage extends BrowserDriver {
    WebDriverWait wait;

    //Locators or elements
    //Validator
    private By transferSavedPageValidator = By.xpath("//a[text()='Input Data Transfer']");
    private By rekeningTujuanText = By.xpath("//*[contains(@aria-label, 'tombol pilih nomor rekening yang tersimpan ')]");
    private By nomorRekeningSumberText = By.xpath("//*[contains(@aria-label, 'Nomor rekening: ')]");

    //Input section
    private By nominalTransferInput = By.xpath("//*[contains(@aria-label, 'Text input field rekening tujuan')]");
    private By catatanInput = By.xpath("//*[contains(@aria-label, 'Text input field catatan (opsional)')]");
    private By lanjutkanButton = By.xpath("//*[contains(@aria-label, 'Tombol lanjutkan')]");

    //Handler
    private By nominalTransferHandler = By.xpath("//*[contains(text(), 'Tulis nominal yang ingin ditransfer')]");
    private By minimumTransferHandler = By.xpath("//*[contains(text(), 'Minimal nominal yang dikirim adalah 1000 rupiah')]");
    private By saldoTransferHandler = By.xpath("//*[contains(text(), 'Saldo tidak cukup')]");
    private By catatanHandler = By.xpath("//*[contains(text(), 'Catatan tidak bisa lebih dari 25 karakter')]");

    //Constructor buat manggil wait
    public TransferSavedPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void validateOnTransferSavedPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(transferSavedPageValidator));
        wait.until(ExpectedConditions.presenceOfElementLocated(rekeningTujuanText));
        wait.until(ExpectedConditions.presenceOfElementLocated(nomorRekeningSumberText));
    }
    public void inputNominal(String nominal){
       wait.until(ExpectedConditions.presenceOfElementLocated(nominalTransferInput)).sendKeys(nominal);
    }
    public void inputCatatan(String catatan){
        wait.until(ExpectedConditions.presenceOfElementLocated(catatanInput)).sendKeys(catatan);
    }
    public void clickLanjutkanButton(){
        WebDriverWait bufferWait = new WebDriverWait(driver, Duration.ofSeconds(5));

        bufferWait.until(ignored -> {
            try {
                Thread.sleep(5000); // 5-second delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
            return true; // Always return true to satisfy the wait condition
        });
        wait.until(ExpectedConditions.presenceOfElementLocated(lanjutkanButton)).click();
    }
    public void validateNominalTransferHandler(){ driver.findElement(nominalTransferHandler).isDisplayed();}
    public void validateMinimumTransferHandler(){ driver.findElement(minimumTransferHandler).isDisplayed();}
    public void validateSaldoTransferHandler(){ driver.findElement(saldoTransferHandler).isDisplayed();}
    public void validateCatatanHandler(){ driver.findElement(catatanHandler).isDisplayed();}

}
