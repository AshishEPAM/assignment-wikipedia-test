/**
 * 
 */
package com.assignment.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Ashish_Kumar_Sahu
 */
public class DriverFactory {

	private static WebDriver driver;

	/**
	 * Returns the corresponding WebDriver instance based on the browser name provided.
	 * 
	 * @param browserName
	 * @return driver
	 */
	public static WebDriver initializeDriver(String browserName) {

		if (browserName.equalsIgnoreCase("GoogleChrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			throw new IllegalArgumentException(
					"Invalid/Unsupported Browser Name: " + browserName + ", only 'GoogleChrome' is supported.");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	/**
	 * Quits the WebDriver instance. Hence it closes all the browser window opened.
	 */
	public static void destroyDriver() {
		if (null != driver) {
			driver.quit();
		}
	}

	/**
	 * Load the URL provided in the browser window.
	 * 
	 * @param url
	 */
	public static void loadURL(String url) {
		driver.get(url);
	}

	/**
	 * This method returns the current page URL.
	 * 
	 * @return CurrentPageURL
	 */
	public static String getCurrentPageURL() {
		return driver.getCurrentUrl();
	}
}
