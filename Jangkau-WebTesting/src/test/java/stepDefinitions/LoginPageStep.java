package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageStep {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the Login Page")
    public void user_is_on_the_login_page(){
        loginPage.validateOnLoginPage();
        Assert.assertEquals("The current URL does not match the expected value", loginPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/login");
    }

    @And("User input credentials with username {string} and password {string}")
    public void user_input_credentials(String username, String password){
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
    }

    @When("User click login button")
    public void user_click_login_button(){
        loginPage.clickLoginButton();
    }

    @When("User click show password button")
    public void user_click_show_password_button(){
        loginPage.clickShowPassButton();
    }

    @When("User click hide password button")
    public void user_click_hide_password_button(){
        loginPage.clickHidePassButton();
    }

    @Then("Page occur username and password handler")
    public void page_occur_username_and_password_handler(){
        loginPage.validateUsernameHandler();
        loginPage.validatePasswordHandler();
    }

    @Then("Input password is displayed")
    public void input_password_is_displayed(){
        loginPage.typePasswordInputText();
    }

    @Then("Input password is hidden")
    public void input_password_is_hidden(){
        loginPage.typePasswordInputPass();
    }

}
