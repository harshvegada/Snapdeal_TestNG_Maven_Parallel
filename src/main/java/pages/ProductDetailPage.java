package pages;

import java.util.Properties;

import base.PredefinedActions;
import fileConstants.FilePaths;
import util.PropertiesFileOperations;

public class ProductDetailPage extends PredefinedActions {

	/**
	 * 1. capature product name
	 * 2. price
	 * 3. deliver dates
	 * 4. options for add to cart & buy now
	 */
	
	private static ThreadLocal<ProductDetailPage> productPageThreaded = new ThreadLocal<ProductDetailPage>();
	private Properties prop;

	private ProductDetailPage() {
		// properties file reading
		prop = PropertiesFileOperations.getProperties(FilePaths.PRODUCT_DETAILS_ELEMENTS);
	}

	public static ProductDetailPage getProductDetailPage() {
		if (productPageThreaded.get() == null) {
			productPageThreaded.set(new ProductDetailPage());
		}
		return productPageThreaded.get();
	}

	public void productName() {
		//also set in ProductDetail class setter method
	}

	public void clickOnAddToCart() {
		//click on button		
	}

	public void clickOnBuyNow() {	
		//click on button
	}
	
	
}
