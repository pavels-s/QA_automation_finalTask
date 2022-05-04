package finalTask.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.assertj.core.api.Assertions.assertThat;


public class HomePagePom {

    private final By searchField = byId("q");
    private final By acceptAllCookiesButton = byXpath("//a[@class = 'c-button']");
    private final By searchSubmitButton = byClassName("main-search-submit");
    private final By vacuumCleanerCategoryButton = byClassName("frftyoh");

    public void openHomePage(String url) {
        open(url);
        getWebDriver().manage().window().maximize();
        $(acceptAllCookiesButton).click();
    }

    public void validatePageUrl(String url) {
        String currentUrl = url();
        assertThat(currentUrl).isEqualTo(url);
    }

    public void searchByProduct(String productToSearch) {
        $(searchField).sendKeys(productToSearch);
        $(searchSubmitButton).click();
    }

    public void chooseVacuumCleanerCategory() {
        $(vacuumCleanerCategoryButton).click();
    }
}
