/**
 * 
 */
package com.assignment.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.assignment.helper.DriverFactory;
import com.assignment.pages.OOPPage;
import com.assignment.pages.ObjectOrientedProgrammingPage;
import com.assignment.pages.WikipediaPage;

/**
 * @author Ashish_Kumar_Sahu
 *
 */
public class AssignmentTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		String browserName = System.getProperty("browserName");
		driver = DriverFactory.initializeDriver(browserName);
	}

	@After
	public void tearDown() throws Exception {
		DriverFactory.destroyDriver();
	}

	@Test
	public void testAssignment() {
		// 1. Navigate to wikipedia.org page
		DriverFactory.loadURL("https://www.wikipedia.org");
		// 2. Search for “OOP”
		WikipediaPage wikipediaPage = PageFactory.initElements(driver, WikipediaPage.class);
		wikipediaPage.serach("OOP");
		// 3. Select first item in suggested results list
		wikipediaPage.selectFirstItemFromSuggestions();
		// 4. Validate that you successfully navigate to https://en.wikipedia.org/wiki/OOP page
		Assert.assertEquals("OOP Page URL : ", "https://en.wikipedia.org/wiki/OOP", DriverFactory.getCurrentPageURL());
		// 5. Click on link with title “Object-oriented programming”
		OOPPage oopPage = PageFactory.initElements(driver, OOPPage.class);
		oopPage.clickLink();
		// 6. Validate that you successfully navigate to https://en.wikipedia.org/wiki/Object-oriented_programming page
		Assert.assertEquals("ObjectOrientedProgramming Page URL : ",
				"https://en.wikipedia.org/wiki/Object-oriented_programming", DriverFactory.getCurrentPageURL());
		// 7. On page bottom expand “Software engineering” area, and select third name from  “Software engineers” list (e. g. “Grady Booch”).
		ObjectOrientedProgrammingPage page = PageFactory.initElements(driver, ObjectOrientedProgrammingPage.class);
		page.expand();
		page.selectName();
		Assert.assertEquals("Grady Booch Page URL : ", "https://en.wikipedia.org/wiki/Grady_Booch", DriverFactory.getCurrentPageURL());
	}
}
