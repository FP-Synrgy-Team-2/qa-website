package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TransferNewPage;
import pages.TransferSavedPage;

public class TransferNewPageStep {

    TransferNewPage transferNewPage = new TransferNewPage();

    @Given("User is on the Transfer New Page")
    public void user_is_on_the_transfer_new_page(){
        transferNewPage.validateOnTransferNewPage();
        Assert.assertEquals("The current URL does not match the expected value", transferNewPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer/new");
    }

    @Then("User redirected to the Transfer New Page")
    public void user_redirected_to_the_transfer_new_page(){
        transferNewPage.validateOnTransferNewPage();
        Assert.assertEquals("The current URL does not match the expected value", transferNewPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer/new");
    }

    @And("User input nomor rekening {string} nominal {string} and catatan {string}")
    public void user_input_norek_nominal_and_catatan(String norek, String nominal, String catatan){
        transferNewPage.validateOnTransferNewPage();
        transferNewPage.inputNomorRekening(norek);
        transferNewPage.inputNominal(nominal);
        transferNewPage.inputCatatan(catatan);
        transferNewPage.checkSimpanRekening();
    }

    @And("User click lanjutkan in Transfer New")
    public void user_click_lanjutkan(){
        transferNewPage.validateOnTransferNewPage();
        transferNewPage.clickLanjutkanButton();
    }

    @Then("Page transfer occur account number handler")
    public void page_transfer_occur_account_number_handler(){
        transferNewPage.validateNomorRekeningHandler();
    }

    @Then("Page transfer occur nominal transfer handler")
    public void page_transfer_occur_nominal_transfer_handler(){
        transferNewPage.validateNominalTransferHandler();
    }

    @Then("Page transfer occur minimum transfer handler")
    public void page_transfer_occur_minimum_transfer_handler(){
        transferNewPage.validateMinimumTransferHandler();
    }

    @Then("Page transfer occur saldo transfer handler")
    public void page_transfer_occur_saldo_transfer_handler(){
        transferNewPage.validateSaldoTransferHandler();
    }

    @Then("Page transfer occur maximum catatan handler")
    public void page_transfer_occur_maximum_catatan_handler(){
        transferNewPage.validateCatatanHandler();
    }

}
