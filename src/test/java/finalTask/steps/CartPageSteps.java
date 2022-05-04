package finalTask.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import finalTask.pages.CartPagePom;

public class CartPageSteps {

    CartPagePom cartPagePom = new CartPagePom();

    @And("Submit purchase, set up product price")
    public void submitPurchaseSetProductNameAndPrice() {
        cartPagePom.submitPurchase();
    }

    @And("Enter email for purchase")
    public void enterEmailForPurchase() {
        cartPagePom.enterEmailForPurchase();
    }

    @And("Choose collection at office")
    public void chooseCollectionAtOffice() {
        cartPagePom.chooseCollectionAtOffice();
    }

    @And("Choose city to collect product")
    public void chooseCityToCollectProduct() {
        cartPagePom.chooseCityOfCollection();
    }

    @And("Enter name, surname and phone number")
    public void enterNameSurnameAndPhoneNumber() {
        cartPagePom.enterName();
        cartPagePom.enterSurname();
        cartPagePom.enterPhoneNumber();
    }

    @Then("Checkout to payment")
    public void checkout() {
        cartPagePom.checkOut();
    }

    @And("Choose payment by cash")
    public void choosePaymentByCash() {
        cartPagePom.choosePayWithCash();
    }

    @And("Validate final price")
    public void validateThatPriceIs() {
        cartPagePom.validatePrice();
    }
}

