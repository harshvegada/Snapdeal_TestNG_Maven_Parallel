package testScripts;

import org.testng.annotations.DataProvider;

import com.beust.jcommander.Strings;

import base.TestNGListeners;
import pages.HomePage;
import pages.PlaceOrderPage;
import pages.ProductDetailPage;
import pages.ResultPage;

public class TestBase extends TestNGListeners {

	/**
	 * Browser Setting
	 */

	public static String defaultBrowser = "Chrome";
	public static String defaultenvironment = "QA";
	public static String browserName = System.getProperty("browser");
	public static String environmentName = System.getProperty("environment");

	HomePage homePage = HomePage.getHomePage();
	ResultPage resultPage = ResultPage.getResultPage();
	ProductDetailPage productDetailPage = ProductDetailPage.getProductDetailPage();
	PlaceOrderPage placeOrderPage = PlaceOrderPage.getPlaceOrderPage();

	public TestBase() {
		TestBase.browserName = (Strings.isStringEmpty(browserName)) ? TestBase.defaultBrowser
				: System.getProperty("browser");
		TestBase.environmentName = (Strings.isStringEmpty(environmentName)) ? TestBase.defaultenvironment
				: System.getProperty("environment");
	}

	@DataProvider(name = "testData")
	public Object[][] getDataSuppiler() {
		return null;
	}
}
