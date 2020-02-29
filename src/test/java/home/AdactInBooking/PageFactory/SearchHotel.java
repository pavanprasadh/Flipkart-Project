package home.AdactInBooking.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import home.AdactInBooking.BaseClass.BasicRequirements;

public class SearchHotel extends BasicRequirements {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement room_nos;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath ="//select[@name='adult_room']")
	private WebElement adults;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	


}
