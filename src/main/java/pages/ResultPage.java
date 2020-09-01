package pages;

import java.util.Properties;

import base.PredefinedActions;
import fileConstants.FilePaths;
import util.PropertiesFileOperations;

public class ResultPage extends PredefinedActions {

	/**
	 * 1. display total result cnt 2. add filter for range 3. pick first available
	 */

	private static ThreadLocal<ResultPage> resultPageThreaded = new ThreadLocal<ResultPage>();
	private Properties prop;

	private ResultPage() {
		// properties file reading
		prop = PropertiesFileOperations.getProperties(FilePaths.RESULT_PAGE_ELEMENTS);
	}

	public static ResultPage getResultPage() {
		if (resultPageThreaded.get() == null) {
			resultPageThreaded.set(new ResultPage());
		}
		return resultPageThreaded.get();
	}

	public void getTotalProductCount() {
		// get list of webelement size
	}

	public void choseFirstAvilableProduct() {
		// take list and chose 0 index product
		// swicth window code
	}

}
