package entities;

public class ProductDetails {

	/**
	 * Setter & Getter Methods
	 */

	private static String productName;
	private static String productQuantity;
	private static String deliveryDate;
	private static String productPrice;

	public static String getProductName() {
		return productName;
	}

	public static void setProductName(String productName) {
		ProductDetails.productName = productName;
	}

	public static String getProductQuantity() {
		return productQuantity;
	}

	public static void setProductQuantity(String productQuantity) {
		ProductDetails.productQuantity = productQuantity;
	}

	public static String getDeliveryDate() {
		return deliveryDate;
	}

	public static void setDeliveryDate(String deliveryDate) {
		ProductDetails.deliveryDate = deliveryDate;
	}

	public static String getProductPrice() {
		return productPrice;
	}

	public static void setProductPrice(String productPrice) {
		ProductDetails.productPrice = productPrice;
	}

}
