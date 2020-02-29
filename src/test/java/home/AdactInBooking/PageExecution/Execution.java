package home.AdactInBooking.PageExecution;

import java.io.IOException;
import java.util.Scanner;

import home.AdactInBooking.BaseClass.BasicRequirements;
import home.AdactInBooking.PageFactory.BookHotel;
import home.AdactInBooking.PageFactory.BookedDetails;
import home.AdactInBooking.PageFactory.LoginPage;
import home.AdactInBooking.PageFactory.SearchHotel;
import home.AdactInBooking.PageFactory.SelectHotel;

public class Execution extends BasicRequirements{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Enter the Browser Name 'Chrome' or 'IE' or 'FireFox': ");
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		scan.close();
		Thread.sleep(1000);
		loadDriver(browser);
		Thread.sleep(1000);
		loadUrl("https://adactin.com/HotelApp/index.php");
		Thread.sleep(1000);
		BookHotel pf = new BookHotel();
		LoginPage lp = new LoginPage();
		SearchHotel sh = new SearchHotel();
		SelectHotel select = new SelectHotel();
		BookedDetails bd = new BookedDetails();
		String sheet1 = "Sheet1";
		String sheet2 = "Sheet2";
		input(lp.getUsername(), excelRead(sheet1, 1, 0));
		//Thread.sleep(1000);
		input(lp.getPassword(), excelRead(sheet1, 1, 1));
		//Thread.sleep(1000);
		click(lp.getLogin());
		Thread.sleep(1000);
		
		selectByText(sh.getLocation(), excelRead(sheet1, 1, 2));
		//Thread.sleep(1000);
		selectByText(sh.getHotels(), excelRead(sheet1, 1, 3));
		//Thread.sleep(1000);
		selectByText(sh.getRoomType(), excelRead(sheet1, 1, 4));
		//Thread.sleep(1000);
		String NoOfRooms = excelRead(sheet1, 1, 5);
		int roomsNos = Integer.parseInt(NoOfRooms);
		selectByIndex(sh.getRoom_nos(), roomsNos);
		//Thread.sleep(1000);
		sh.getCheckIn().clear();
		input(sh.getCheckIn(), excelRead(sheet1, 1, 6));
		Thread.sleep(1000);
		sh.getCheckOut().clear();
		input(sh.getCheckOut(), excelRead(sheet1, 1, 7));
		Thread.sleep(1000);
		selectByText(sh.getAdults(), excelRead(sheet1, 1, 8));
		Thread.sleep(1000);
		click(sh.getSubmit());
		Thread.sleep(1000);
		click(select.getSelectHotel());
		//Thread.sleep(1000);
		click(select.getContinueButton());
		Thread.sleep(2000);
		input(pf.getFirstName(), excelRead(sheet1, 1, 10));
		//Thread.sleep(1000);
		input(pf.getLastName(),excelRead(sheet1, 1, 11));
		//Thread.sleep(1000);
		input(pf.getAddress(),excelRead(sheet1, 1, 12));
		//Thread.sleep(1000);
		input(pf.getCcNum(), excelRead(sheet1, 1, 13));
		//Thread.sleep(1000);
		selectByText(pf.getCcType(), excelRead(sheet1, 1, 14));
		//Thread.sleep(1000);
		selectByText(pf.getExpMonth(), excelRead(sheet1, 1, 15));
		//Thread.sleep(1000);
		selectByText(pf.getExpYear(), excelRead(sheet1, 1, 16));
		//Thread.sleep(1000);
		input(pf.getCvv(), excelRead(sheet1, 1, 17));
		//Thread.sleep(1000);
		click(pf.getBook());
		Thread.sleep(10000);
		String text1 = getText(bd.getBookedHotel());
		excelWrite(sheet2, text1, 1, 3);
		String text2 = getText(bd.getBookedLocation());
		excelWrite(sheet2, text2, 1, 4);
		String text3 = getText(bd.getBookedRoomType());
		excelWrite(sheet2, text3, 1, 5);
		String text = getText(bd.getArrivalDate());
		excelWrite(sheet2, text, 1, 6);
		String text11 = getText(bd.getDepDate());
		excelWrite(sheet2, text11, 1, 7);
		String text4 = getText(bd.getTotalRoomsBooked());
		excelWrite(sheet2, text4, 1, 8);
		String text5 = getText(bd.getBookedAdults());
		excelWrite(sheet2, text5, 1, 9);
		String text6 = getText(bd.getPricePerNightBooked());
		excelWrite(sheet2, text6, 1, 10);
		String text7 = getText(bd.getBookedTotalPrice());
		excelWrite(sheet2, text7, 1, 11);
		String text8 = getText(bd.getBookedGST());
		excelWrite(sheet2, text8, 1, 12);
		String text9 = getText(bd.getBookedFinalPrice());
		excelWrite(sheet2,text9, 1, 13);
		String text10 = getText(bd.getOrderNumber());
		excelWrite(sheet2, text10, 1, 2);
		System.out.println("Do Excel Write Date");
	
	}

}
