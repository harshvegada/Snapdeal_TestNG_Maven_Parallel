package testScripts;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage.signInApplication;
import pages.PlaceOrderPage.paymentOptions;

@Listeners(base.TestNGListeners.class)
public class FirstTestCases extends TestBase {

	@Test(dataProvider = "testData", description = "verify new customer able to sign in using FB & can place order with COD option")
	public void verifyUserAbleToLoginApplication(Map<String, String> details) {
		homePage.signIn(signInApplication.FACEBOOK);
		homePage.verifyUserSignin();
		homePage.searchProcuctNameInSearchBar(details.get("productName"));

		resultPage.getTotalProductCount();
		resultPage.choseFirstAvilableProduct();

		productDetailPage.productName();
		productDetailPage.clickOnBuyNow();

		placeOrderPage.verifyProductNameDisplayInOrderReviewSection();
		placeOrderPage.capaturePayCharges();
		placeOrderPage.clickOnProcessPaymentOptions();
		placeOrderPage.doPaymentUsing(paymentOptions.COD);
		placeOrderPage.calculateExtraCharges();
	}

}
