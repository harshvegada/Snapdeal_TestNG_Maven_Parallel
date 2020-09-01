package pages;

import java.util.Properties;

import base.PredefinedActions;
import fileConstants.FilePaths;
import util.PropertiesFileOperations;

public class PlaceOrderPage extends PredefinedActions {

	/**
	 * 1. verify product name display correct on order review 2. price checks 3.
	 * proceess payment 4. chose payment method [do not click on]
	 */

	private static ThreadLocal<PlaceOrderPage> placeOrderPageThreaded = new ThreadLocal<PlaceOrderPage>();
	private Properties prop;

	public enum paymentOptions {
		CREDIT_CARD, DEBIT_CARD, NET_BANKING, COD, EMI, UPI
	}

	private PlaceOrderPage() {
		// properties file reading
		prop = PropertiesFileOperations.getProperties(FilePaths.PLACE_ORDER_PAGE_ELEMENTS);
	}

	public static PlaceOrderPage getPlaceOrderPage() {
		if (placeOrderPageThreaded.get() == null) {
			placeOrderPageThreaded.set(new PlaceOrderPage());
		}
		return placeOrderPageThreaded.get();
	}

	public void verifyProductNameDisplayInOrderReviewSection() {
		// check with pojo class getter n element text

	}

	public void capaturePayCharges() {
		// capature element text & set in pojo class ProductDetails

	}

	public void clickOnProcessPaymentOptions() {
		// button click
	}

	public void doPaymentUsing(paymentOptions options) {
		// add switch case and based on click on element
		// in customerdetails class set payment option based on selection
		switch (options) {
		case CREDIT_CARD:
			break;

		case DEBIT_CARD:
			break;

		case NET_BANKING:
			break;

		case COD:
			break;

		case EMI:
			break;

		case UPI:
			break;

		}
	}

	public void calculateExtraCharges() {
		// gettext of pay element & get value from pojo class & check deductiable & show
		// extra chage on console
		// with payment option from customer class

	}

}
