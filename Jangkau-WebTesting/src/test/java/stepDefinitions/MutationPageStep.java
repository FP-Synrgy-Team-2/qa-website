package stepDefinitions;

import io.cucumber.java.en.*;
import pages.MutationPage;

public class MutationPageStep {
    MutationPage mutationPage = new MutationPage();

    @Given("User is on the Mutation Page")
    public void user_is_on_the_mutation_page(){
        mutationPage.validateOnMutationPage();
    }
}
