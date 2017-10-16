/**
 * 
 */
package com.assignment.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * @author Ashish_Kumar_Sahu
 *
 */
public class WikipediaPage {

	private WebDriver driver;

	public WikipediaPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "searchInput")
	private WebElement searchInputTextField;

	public void serach(String text) {
		searchInputTextField.sendKeys(text);
	}

	public void selectFirstItemFromSuggestions() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
