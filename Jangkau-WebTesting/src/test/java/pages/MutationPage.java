package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class MutationPage extends BrowserDriver {
    WebDriverWait wait;

    //Locators or elements
    private By filterButton = By.xpath("//*[@aria-label= 'tombol filter']");
    private By firstTransaction = By.xpath("//div[@class='flex w-1/2 flex-col gap-y-[30px]']/div[1]");
    private By popDate = By.xpath("//h2[text()='Filter Mutasi']");
    private By first23Agus = By.xpath("(//div[contains(@class, 'react-calendar')]//button[@class='react-calendar__tile react-calendar__month-view__days__day' and abbr[text()='23']])[1]");
    private By second26Agus = By.xpath("(//div[contains(@class, 'react-calendar')]//button[@class='react-calendar__tile react-calendar__month-view__days__day' and abbr[text()='26']])[2]");
    private By gunakanFilterButton = By.xpath("//*[text()= 'Gunakan Filter']");
    private By hapusFilterButton = By.xpath("//*[@aria-label= 'tombol hapus filter']");
    private By textBCATabungan = By.xpath("//span[text()='BCA TABUNGANKu']");
    private By textMutasiRekening = By.xpath("//*[@aria-label='MUTASI REKENING']");

    //Constructor buat manggil wait
    public MutationPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void validateOnMutationPage(){
        wait.until(ExpectedConditions.presenceOfElementLocated(filterButton));
        wait.until(ExpectedConditions.presenceOfElementLocated(textBCATabungan));
        wait.until(ExpectedConditions.presenceOfElementLocated(textMutasiRekening));
    }
    public void clickFilterButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(filterButton)).click();
    }
    public void clickHapusFilterButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(hapusFilterButton)).click();
    }
    public void clickGunakanFilterButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(gunakanFilterButton)).click();
    }
    public void clickFirstTransaction(){
        wait.until(ExpectedConditions.presenceOfElementLocated(firstTransaction)).click();
    }
    public void clickFirst23Agus(){
        wait.until(ExpectedConditions.presenceOfElementLocated(first23Agus)).click();
    }
    public void clickSecond26Agus(){
        wait.until(ExpectedConditions.presenceOfElementLocated(second26Agus)).click();
    }
    public void validatePopFilter(){
        wait.until(ExpectedConditions.presenceOfElementLocated(popDate)).isDisplayed();
    }



}
