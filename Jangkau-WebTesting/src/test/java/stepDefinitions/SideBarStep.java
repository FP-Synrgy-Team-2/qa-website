package stepDefinitions;

import io.cucumber.java.en.*;
import pages.SideBar;

public class SideBarStep {
    SideBar sideBar = new SideBar();

    @When("User click the Transfer Page menu")
    public void user_click_the_transfer_page_menu(){
        sideBar.clickTransferButton();
    }

    @When("User click the Beranda Page menu")
    public void user_click_the_beranda_page_menu(){
        sideBar.clickBerandaButton();
    }

    @When("User click logged out")
    public void user_click_logged_out(){
        sideBar.clickKeluarButton();
    }

    @When("User click the Mutasi Page menu")
    public void user_click_the_mutasi_page_menu(){
        sideBar.clickMutasiButton();
    }


}
