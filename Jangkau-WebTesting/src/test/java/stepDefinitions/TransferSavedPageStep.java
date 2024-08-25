package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TransferSavedPage;

public class TransferSavedPageStep {
    TransferSavedPage transferSavedPage = new TransferSavedPage();

    @Given("User is on the Transfer Saved Page")
    public void user_is_on_the_transfer_saved_page(){
        transferSavedPage.validateOnTransferSavedPage();
        Assert.assertEquals("The current URL does not match the expected value", transferSavedPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer/saved");
    }

    @Then("User redirected to the Transfer Saved Page")
    public void user_redirected_to_the_transfer_saved_page(){
        transferSavedPage.validateOnTransferSavedPage();
        Assert.assertEquals("The current URL does not match the expected value", transferSavedPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer/saved");
    }

    @And("User input nominal {string} and catatan {string}")
    public void user_input_nominal_and_catatan(String nominal, String catatan){
        transferSavedPage.validateOnTransferSavedPage();
        transferSavedPage.inputNominal(nominal);
        transferSavedPage.inputCatatan(catatan);
    }

    @When("User click lanjutkan")
    public void user_click_lanjutkan(){
        transferSavedPage.validateOnTransferSavedPage();
        transferSavedPage.clickLanjutkanButton();
    }

    @Then("Page occur nominal transfer handler")
    public void page_occur_nominal_transfer_handler(){
        transferSavedPage.validateNominalTransferHandler();
    }

    @Then("Page occur minimum transfer handler")
    public void page_occur_minimum_transfer_handler(){
        transferSavedPage.validateMinimumTransferHandler();
    }

    @Then("Page occur saldo transfer handler")
    public void page_occur_saldo_transfer_handler(){
        transferSavedPage.validateSaldoTransferHandler();
    }

    @Then("Page occur maximum catatan handler")
    public void page_occur_maximum_catatan_handler(){
        transferSavedPage.validateCatatanHandler();
    }

}

