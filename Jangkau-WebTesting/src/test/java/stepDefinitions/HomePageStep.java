package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HomePage;
import pages.SideBar;

public class HomePageStep {
    HomePage homePage = new HomePage();
    SideBar sideBar = new SideBar();

    @Given("User is on the Home Page")
    public void user_is_on_the_home_page(){
        homePage.validateOnBerandaPage();
        sideBar.validateSideBar();
        Assert.assertEquals("The current URL does not match the expected value", homePage.getCurrentUrl(), "https://jangkau-delta.vercel.app/dashboard");
    }

    @Then("User redirected to homepage with correct account number {string}")
    public void user_redirected_to_homepage_with_correct_account_number(String nomorRekening){
        sideBar.validateSideBar();
        homePage.validateOnBerandaPage();
        Assert.assertEquals("The displayed account number does not match the expected value.", homePage.getNomorRekeningText(), nomorRekening);
    }

    @When("User click show balance")
    public void user_click_show_balance(){
        homePage.clickTampilkanSaldoButton();
    }

    @When("User click hide balance")
    public void user_click_hide_balance(){
        homePage.clickSembunyikanSaldoButton();
    }

    @Then("User account balance is displayed")
    public void user_balance_displayed(){
        String saldoText = homePage.getSaldoText();
        boolean containsNumber = saldoText.matches(".*\\d.*");
        Assert.assertTrue("The balance is not displayed", containsNumber);
    }

    @Then("User account balance is hidden")
    public void user_balance_hidden(){
        String saldoText = homePage.getSaldoText();
        boolean containsNumber = saldoText.matches("\\*+");
        Assert.assertTrue("The balance is not displayed", containsNumber);
    }

}
