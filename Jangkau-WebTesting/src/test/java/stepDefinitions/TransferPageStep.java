package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.SideBar;
import pages.TransferPage;

public class TransferPageStep {
    TransferPage transferPage = new TransferPage();
    SideBar sideBar = new SideBar();

    @Given("User is on the Transfer Page")
    public void user_is_on_the_transfer_page(){
        transferPage.validateOnTransferPage();
        Assert.assertEquals("The current URL does not match the expected value", transferPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer");
    }

    @Then("User redirected to the Transfer Page")
    public void user_redirected_to_the_transfer_page(){
        transferPage.validateOnTransferPage();
        Assert.assertEquals("The current URL does not match the expected value", transferPage.getCurrentUrl(), "https://jangkau-delta.vercel.app/transfer");
    }

    @And("User choose existing account")
    public void user_choose_existing_account(){
        transferPage.clickPilihRekeningButtonUntilElementAppears();
        transferPage.clickAdminRekeningButton();
    }

    @And("User click input baru")
    public void user_click_input_baru(){
        transferPage.clickInputBaruButton();
    }

}
