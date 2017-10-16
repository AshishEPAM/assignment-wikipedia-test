/**
 * 
 */
package com.assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Ashish_Kumar_Sahu
 *
 */
public class OOPPage {

	public WebDriver driver;

	public OOPPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(linkText = "Object-oriented programming")
	private WebElement objectOrientedProgrammingLink;

	public void clickLink() {
		objectOrientedProgrammingLink.click();
	}
}
