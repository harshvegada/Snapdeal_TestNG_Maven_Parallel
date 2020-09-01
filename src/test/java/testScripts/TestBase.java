package testScripts;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import base.TestNGListeners;
import fileConstants.FilePaths;
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
		Object[][] data = new Object[2][2];
		data[0][0] = "maulik";
		data[0][1] = "kanani";
		data[1][0] = "krishna";
		data[1][1] = "kanani";
		return data;
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite--------------------------------------");
		PropertyConfigurator.configure(FilePaths.LOG4J_FILE);
	}
}
