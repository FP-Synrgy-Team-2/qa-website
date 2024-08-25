package stepDefinitions;

import org.junit.Assert;
import pages.ConfirmationPage;
import io.cucumber.java.en.*;
import pages.TransferSavedPage;

public class ConfirmationPageStep {
    ConfirmationPage confirmationPage = new ConfirmationPage();
    TransferSavedPage transferSavedPage = new TransferSavedPage();

    @Given("User is on the Confirmation Page")
    public void user_is_on_the_confirmation_page(){
        confirmationPage.validateOnConfirmationPage();
        Assert.assertEquals("The current URL does not match the expected value", confirmationPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer/confirm");
    }
    @When("User click kembali")
    public void user_click_kembali(){
        confirmationPage.clickKembaliButton();
    }
    @And("User click kirim")
    public void user_click_kirim(){
        confirmationPage.validateOnConfirmationPage();
        confirmationPage.clickKirimButton();
    }
    @When("User click kirim PIN")
    public void user_click_kirim_pin() {
        confirmationPage.clickPinKirimButton();
    }

    @And("User fill PIN with {string}")
    public void user_fill_pin(String pin){
        confirmationPage.validatePinPopUp();
        confirmationPage.pinInputFill(pin);
    }

}
