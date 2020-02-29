package home.AdactInBooking.BaseClass;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import home.AdactInBooking.PageExecution.Execution;

public class BasicRequirements {

	public static WebDriver driver;
	
	public static void loadDriver(String driverName) {
		String whichDriver = driverName;
		Scanner scan = new Scanner(System.in);
		if(whichDriver.equalsIgnoreCase("Chrome")) {
			System.out.println("Please wait...");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\AdactInBooking\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();	
			scan.close();
		}
		else {
			System.out.println("Other WebBrowsers are currently Not Available, Please type Driver Name as 'Chrome' for Now");
			
		}

	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public static void input(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void selectByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static String getText(WebElement element) {
		String text = element.getAttribute("value");
		
		return text;
		
	}
	public static String excelRead(String sheetName, int i, int j) throws IOException {
		File file = new File("C:\\Users\\admin\\eclipse-workspace\\AdactInBookingMaven\\target\\TestForMaven.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet(sheetName);
		String input="";
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		int type = cell.getCellType();
		if(type==1) {
			input = cell.getStringCellValue();
		}
		else if(type==0) {
			if(DateUtil.isCellDateFormatted(cell)) {
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				java.util.Date d = cell.getDateCellValue();
				input = df.format(d);	
			}
			else {
				double d = cell.getNumericCellValue();
				long lng = (long)d;
				input = String.valueOf(lng);	
			}
			
		}
	
		return input;
		
	}
	public static void excelWrite(String sheetName,String value, int i, int j) throws IOException {
		File file = new File("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\AdactInBookingMaven\\\\target\\\\TestForMaven.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet(sheetName);
		String input="";
		Row row = sheet.getRow(i);
		Cell createCell = row.createCell(j);
		createCell.setCellValue(value);
		FileOutputStream output = new FileOutputStream(file);
		wb.write(output);
		
		
	}
}
