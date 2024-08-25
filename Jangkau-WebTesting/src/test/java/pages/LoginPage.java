package pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LoginPage extends BrowserDriver {

    WebDriverWait wait;

    //Locators or elements
    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//*[contains(@type, 'submit')]");
    private By hidePassButton = By.xpath("//*[contains(@alt, 'Sembunyikan password')]");
    private By showPassButton = By.xpath("//*[contains(@alt, 'Tampilkan password')]");
    private By loginPageValidator = By.xpath("//*[contains(@aria-label, 'Masuk ke akun anda')]");
    private By passwordInputText = By.xpath("//input[@name='password' and @type='text']");
    private By passwordInputPass = By.xpath("//input[@name='password' and @type='password']");

    //Handler
    private By usernameHandler = By.xpath("//*[contains(text(), 'Masukkan username yang valid')]");
    private By passwordHandler = By.xpath("//*[contains(text(), 'Masukkan password yang valid')]");

    //Constructor buat manggil wait
    public LoginPage(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Page Methods/Actions

    public String getCurrentUrl() { return driver.getCurrentUrl(); }

    public void validateOnLoginPage(){
        wait.until((ExpectedConditions.presenceOfElementLocated(loginPageValidator)));
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameInput));
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordInput));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
    }
    public void typePasswordInputText(){ driver.findElement(passwordInputText).isDisplayed(); }

    public void typePasswordInputPass(){ driver.findElement(passwordInputPass).isDisplayed(); }

    public void inputUsername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void clickShowPassButton(){ driver.findElement(showPassButton).click(); }

    public void clickHidePassButton(){
        driver.findElement(hidePassButton).click();
    }

    public void validateUsernameHandler(){ driver.findElement(usernameHandler).isDisplayed();}

    public void validatePasswordHandler(){ driver.findElement(passwordHandler).isDisplayed();}
}
