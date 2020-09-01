package pages;

import java.util.Properties;

import base.PredefinedActions;
import fileConstants.FilePaths;
import util.PropertiesFileOperations;

public class HomePage extends PredefinedActions {

	/**
	 * 1. sign in using fb/google 2. cart 3. search bar options 4. verify user sign
	 * in 5.
	 */

	private static ThreadLocal<HomePage> homePageThreaded = new ThreadLocal<HomePage>();
	private Properties prop;

	private HomePage() {
		prop = PropertiesFileOperations.getProperties(FilePaths.HOME_PAGE_ELEMENTS);
	}

	public static HomePage getHomePage() {
		if (homePageThreaded.get() == null) {
			homePageThreaded.set(new HomePage());
		}
		return homePageThreaded.get();
	}

	public enum signInApplication {
		FACEBOOK, GOOGLE
	}

	public void signIn(signInApplication application) {
		login(application);
	}

	private void login(signInApplication application) {
		// facebook sign in
	}

	public void verifyUserSignin() {
		// check user sign in name
	}

	public void searchProcuctNameInSearchBar(String productName) {
		// sendkey in searchbox
		// hit enter
	}
}
