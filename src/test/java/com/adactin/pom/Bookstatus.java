package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookstatus {
	
	WebDriver driver;

	//@FindBy(name="my_itinerary")
	//@FindBy(xpath="(//*[@class='reg_button'])[2]")
	@FindBy(linkText = "Booked Itinerary")
	private WebElement itinerary;

	public Bookstatus(WebDriver idriver) {
		
		this.driver=idriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getItinerary() {
		return itinerary;
	}
}
