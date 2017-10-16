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
public class ObjectOrientedProgrammingPage {

	public WebDriver driver;

	public ObjectOrientedProgrammingPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "collapseButton1")
	private WebElement collapseButton;

	@FindBy(linkText = "Grady Booch")
	private WebElement softwareEngineerNameLink;

	public void expand() {
		collapseButton.click();
	}

	public void selectName() {
		softwareEngineerNameLink.click();
	}
}
