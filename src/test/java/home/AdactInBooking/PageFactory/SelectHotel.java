package home.AdactInBooking.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import home.AdactInBooking.BaseClass.BasicRequirements;

public class SelectHotel extends BasicRequirements{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement selectHotel;
	
	@FindBy(id="continue")
	private WebElement continueButton;

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	

}
