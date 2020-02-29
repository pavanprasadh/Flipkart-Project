package home.AdactInBooking.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import home.AdactInBooking.BaseClass.BasicRequirements;

public class BookedDetails extends BasicRequirements {
	public BookedDetails() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='hotel_name']")
	private WebElement BookedHotel;
	
	@FindBy(xpath="//input[@name='location']")
	private WebElement BookedLocation;
	
	@FindBy(xpath="//input[@name='room_type']")
	private WebElement BookedRoomType;
	
	@FindBy(xpath="//input[@name='arrival_date']")
	private WebElement ArrivalDate;
	
	@FindBy(xpath="//input[@name='departure_date']")
	private WebElement DepDate;
	
	@FindBy(xpath="//input[@name='total_rooms']")
	private WebElement totalRoomsBooked;
	
	@FindBy(xpath = "//input[@name='adults_room']")
	private WebElement bookedAdults;
	
	@FindBy(xpath = "//input[@name='children_room']")
	private WebElement bookedChildrenRooms;
	
	@FindBy(xpath = "//input[@name='price_night']")
	private WebElement pricePerNightBooked;
	
	@FindBy(xpath = "//input[@name='total_price']")
	private WebElement bookedTotalPrice;
	
	@FindBy(xpath = "//input[@name='gst']")
	private WebElement bookedGST;
		
	@FindBy(xpath = "//input[@name='final_price']")
	private WebElement bookedFinalPrice;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement bookedFirstName;
		
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement bookedLastName;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement bookedAddress;
	
	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement OrderNumber;

	public WebElement getBookedHotel() {
		return BookedHotel;
	}

	public WebElement getBookedLocation() {
		return BookedLocation;
	}

	public WebElement getBookedRoomType() {
		return BookedRoomType;
	}

	public WebElement getArrivalDate() {
		return ArrivalDate;
	}

	public WebElement getDepDate() {
		return DepDate;
	}

	public WebElement getTotalRoomsBooked() {
		return totalRoomsBooked;
	}

	public WebElement getBookedAdults() {
		return bookedAdults;
	}

	public WebElement getBookedChildrenRooms() {
		return bookedChildrenRooms;
	}

	public WebElement getPricePerNightBooked() {
		return pricePerNightBooked;
	}

	public WebElement getBookedTotalPrice() {
		return bookedTotalPrice;
	}

	public WebElement getBookedGST() {
		return bookedGST;
	}

	public WebElement getBookedFinalPrice() {
		return bookedFinalPrice;
	}

	public WebElement getBookedFirstName() {
		return bookedFirstName;
	}

	public WebElement getBookedLastName() {
		return bookedLastName;
	}

	public WebElement getBookedAddress() {
		return bookedAddress;
	}

	public WebElement getOrderNumber() {
		return OrderNumber;
	}
	
}
