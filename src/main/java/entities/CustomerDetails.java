package entities;

public class CustomerDetails {

	/**
	 * Setter & Getter Methods
	 */

	private static String customerName = "harsh vegada";
	private static String customerEmailAddress = "harshvegada1997@gmail.com";
	private static String mobileNumber = "8905714840";
	private static String deliveryAddress = "govani hostel, nana mauva road nr ambika township Rajkot - 360004 Gujarat";
	private static String deliverDate;

	public static String getCustomerName() {
		return customerName;
	}

	public static void setCustomerName(String customerName) {
		CustomerDetails.customerName = customerName;
	}

	public static String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public static void setCustomerEmailAddress(String customerEmailAddress) {
		CustomerDetails.customerEmailAddress = customerEmailAddress;
	}

	public static String getMobileNumber() {
		return mobileNumber;
	}

	public static void setMobileNumber(String mobileNumber) {
		CustomerDetails.mobileNumber = mobileNumber;
	}

	public static String getDeliveryAddress() {
		return deliveryAddress;
	}

	public static void setDeliveryAddress(String deliveryAddress) {
		CustomerDetails.deliveryAddress = deliveryAddress;
	}

	public static String getDeliverDate() {
		return deliverDate;
	}

	public static void setDeliverDate(String deliverDate) {
		CustomerDetails.deliverDate = deliverDate;
	}

}
