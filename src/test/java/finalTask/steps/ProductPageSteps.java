package finalTask.steps;

import io.cucumber.java.en.And;
import finalTask.pages.ProductPagePom;

public class ProductPageSteps {

    ProductPagePom productPagePom = new ProductPagePom();

    @And("Choose a product and click on it")
    public void chooseAProductAndClickOnIt() {
        productPagePom.chooseProduct();
    }

    @And("Set up product price")
    public void setUpProductPrice() {
        productPagePom.setUpProductPrice();
    }

    @And("Add it to the cart")
    public void addItToTheCart() {
        productPagePom.addToCard();
    }

}
