package finalTask.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import finalTask.pages.HomePagePom;

public class HomePageSteps {

    HomePagePom homePagePom = new HomePagePom();

    @Given("^Open home page (.*)$")
    public void openHomePage(String homePageUrl) {
        homePagePom.openHomePage(homePageUrl);
    }

    @And("^Validate that (.*) is open$")
    public void validateThatHomePageIsOpen(String homePageUrl) {
        homePagePom.validatePageUrl(homePageUrl);
    }

    @When("^Enter product name (.*) into search and click search button$")
    public void enterProductNameIrobotIntoSearchAndClickSearchButton(String productName) {
        homePagePom.searchByProduct(productName);
    }

    @And("Click on vacuum cleaner category")
    public void clickOnVacuumCleanerDirectory() {
        homePagePom.chooseVacuumCleanerCategory();
    }
}
