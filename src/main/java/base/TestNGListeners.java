package base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import com.beust.jcommander.Strings;

import io.qameta.allure.Attachment;
import testScripts.TestBase;

public class TestNGListeners extends PredefinedActions implements ITestListener, IAnnotationTransformer {

	public static String defaultBrowser = "Chrome";
	public static String defaultenvironment = "QA";
	public static String browserName = System.getProperty("browser");
	public static String environmentName = System.getProperty("environment");

	@Override
	public void onTestStart(ITestResult result) {
		createBrowser(TestBase.browserName);
		System.out.println("browser open code");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("browser close code");
		terminateBrowser();
	}

	@Override
	public void onTestFailure(ITestResult result) {
		makeScreenShot(driverThread.get());
		if (driverThread.get() instanceof WebDriver) {
			System.out.println("Screenshot captured for test case:" + getTestMethodName(result));
		}
		saveTextLog(getTestMethodName(result) + " failed and screenshot taken!");
		terminateBrowser();
		System.out.println("capature screen shot");
		System.out.println("browser close code");
		terminateBrowser();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipp");
		System.out.println("browser close code");
		terminateBrowser();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		TestBase.browserName = (Strings.isStringEmpty(browserName)) ? TestBase.defaultBrowser
				: System.getProperty("browser");
		TestBase.environmentName = (Strings.isStringEmpty(environmentName)) ? TestBase.defaultenvironment
				: System.getProperty("environment");
		System.out.println("Browser : " + browserName);
		System.out.println("Environment : " + environmentName);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("First Method which will execute ends of Suite");
	}

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryTestCase.class);
	}

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] makeScreenShot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}

	@Attachment(value = "{0}", type = "text/html")
	public static String attachHtml(String html) {
		return html;
	}

}
