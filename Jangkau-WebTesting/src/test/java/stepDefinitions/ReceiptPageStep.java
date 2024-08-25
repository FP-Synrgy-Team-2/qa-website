package stepDefinitions;

import io.cucumber.java.en.*;
import pages.ReceiptPage;

public class ReceiptPageStep {
    ReceiptPage receiptPage = new ReceiptPage();

    @Given("User is on the Receipt Page")
    public void user_is_on_the_receipt_page(){
        receiptPage.validateOnReceiptPage();
    }
    @Then("User redirected to Receipt Page")
    public void user_redirected_to_receipt_page(){
        receiptPage.validateOnReceiptPage();
    }
    @When("User download transfer receipt")
    public void user_download_transfer_receipt(){
        receiptPage.clickUnduhButton();
    }
    @When("User redirected to Dashboard Page")
    public void user_redirected_to_dashboard(){
        receiptPage.clickDashboardButton();
    }
}
