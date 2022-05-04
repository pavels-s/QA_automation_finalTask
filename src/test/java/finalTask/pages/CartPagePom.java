package finalTask.pages;

import finalTask.models.CustomerModel;
import finalTask.models.ProductModel;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CartPagePom {

    CustomerModel customerModel = new CustomerModel();
    ProductModel productModel = new ProductModel();

    private final By finalPrice = byXpath("//span[@class = 'checkout-order-summary-total__price']");
    private final By submitPurchaseButton = By.name("commit");
    private final By emailFields = byXpath("//input[@id = 'user_email']");
    private final By collectionAtOfficeButton = byClassName("title");
    private final By collectionAtDpilsOption = byText("Kraujas iela 2, K SENUKAI Daugavpils");
    private final By nameField = byId("address_first_name");
    private final By surnameField = byId("address_last_name");
    private final By customerPhoneNumberField = byId("address_phone_number");
    private final By checkOutButton = byText("Turpināt");
    private final By payWithCashButton = byText("Apmaksa saņemot preci");

    public void submitPurchase() {
        $(submitPurchaseButton).click();
    }

    public void enterEmailForPurchase() {
        $$(emailFields).get(1).sendKeys(customerModel.getEmail());
        $$(emailFields).get(1).submit();
    }

    public void chooseCollectionAtOffice() {
        $$(collectionAtOfficeButton).get(1).click();
    }

    public void chooseCityOfCollection() {
        $(collectionAtDpilsOption).click();
    }

    public void enterName() {
        $(nameField).sendKeys(customerModel.getName());
    }

    public void enterSurname() {
        $(surnameField).sendKeys(customerModel.getSurname());
    }

    public void enterPhoneNumber() {
        $(customerPhoneNumberField).sendKeys(customerModel.getPhoneNumber());
    }

    public void checkOut() {
        $(checkOutButton).click();
        sleep(2000);
        $(checkOutButton).click();
    }

    public void choosePayWithCash() {
        $(payWithCashButton).click();
    }

    public void validatePrice() {
        assertThat($(finalPrice).getValue()).isEqualTo(productModel.getProductPrice());
    }

}
