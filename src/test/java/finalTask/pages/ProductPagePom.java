package finalTask.pages;

import finalTask.models.ProductModel;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ProductPagePom {

    ProductModel productModel = new ProductModel();

    private final By irobotRoombaProduct = byXpath("//a[@data-gtm-link ='159116']");
    private final By addProductToCart = byId("add_to_cart_btn");
    private final By checkOutToPayment = byXpath("//a[@class ='main-button']");
    private final By selectedProductPrice = byXpath("//span[@class = 'price']");

    public void chooseProduct() {
        $$(irobotRoombaProduct).get(1).click();
    }

    public void setUpProductPrice() {
        productModel.setProductPrice($(selectedProductPrice).getValue());
    }

    public void addToCard() {
        $(addProductToCart).submit();
        sleep(5000);
        $(checkOutToPayment).click();
    }


}
