package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;
import java.util.*;

public class ConfirmationPage extends BrowserDriver {
    WebDriverWait wait;

    //Locators or elements
    private By rincianTransaksiText = By.xpath("//*[contains(@id, 'detail-transaction')]");
    private By kembaliButton = By.xpath("//button[contains(text(), 'Kembali')]");
    private By kirimButton = By.xpath("//button[contains(text(), 'Kirim')]");

    //PIN Pop Up
    private By pinPopUp = By.xpath("//*[contains(text(), 'Masukkan PIN')]");
    private By pinInput = By.xpath("//div[@class='mb-5 flex justify-center']/input");
    private By pinKirimButton = By.xpath("//button[contains(text(), 'Kirim ')]");

    //Constructor buat manggil wait
    public ConfirmationPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void validateOnConfirmationPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(rincianTransaksiText));
        wait.until(ExpectedConditions.presenceOfElementLocated(kembaliButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(kirimButton));
    }
    public void clickKembaliButton(){
        driver.findElement(kembaliButton).click();
    }
    public void clickKirimButton(){
        // Perform the click action after the buffer delay
        driver.findElement(kirimButton).click();
    }
    public void clickPinKirimButton(){
        driver.findElement(pinKirimButton).click();
    }
    public void validatePinPopUp(){
        wait.until(ExpectedConditions.presenceOfElementLocated(pinPopUp));
        wait.until(ExpectedConditions.presenceOfElementLocated(pinInput));
    }
    public void pinInputFill(String pin) {
        List<WebElement> pinInputs = driver.findElements(pinInput);
        if (pin.length() != 6) {
            throw new IllegalArgumentException("PIN length must match the number of input fields.");
        }
        int index = 0;
        for (WebElement input : pinInputs) {
            input.sendKeys(String.valueOf(pin.charAt(index)));
            index++;
        }
    }

}
