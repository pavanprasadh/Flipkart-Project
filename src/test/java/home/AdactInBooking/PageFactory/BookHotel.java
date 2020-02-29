package home.AdactInBooking.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import home.AdactInBooking.BaseClass.BasicRequirements;

public class BookHotel extends BasicRequirements {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccNum;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement ccType;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
}
