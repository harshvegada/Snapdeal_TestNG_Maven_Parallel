package testScripts;

import org.testng.annotations.DataProvider;

import base.TestNGListeners;
import pages.HomePage;
import pages.PlaceOrderPage;
import pages.ProductDetailPage;
import pages.ResultPage;

public class TestBase extends TestNGListeners {

	HomePage homePage = HomePage.getHomePage();
	ResultPage resultPage = ResultPage.getResultPage();
	ProductDetailPage productDetailPage = ProductDetailPage.getProductDetailPage();
	PlaceOrderPage placeOrderPage = PlaceOrderPage.getPlaceOrderPage();

	@DataProvider(name = "testData")
	public Object[][] getDataSuppiler() {
		return null;
	}
}
