package org.base;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Alert a1;
	public static Select s;
	public static Robot r;
	public static TakesScreenshot t;
	
	
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	
	
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}
	
	public static void fetchUrl(String url) {
		driver.get(url);

	}
	
	public static String fetchTitle() {
		String a = driver.getTitle();
		return a;
	}
	
	public static String fetchCurrentUrl() {
	String b = driver.getCurrentUrl();
	return b;
	}
	
	public static String getAttributeValueGiven(WebElement ele) {
		String value = ele.getAttribute("value");
		return value;

	}
	
	public static void closeTab() {
		driver.close();

	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	public static void fillText(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public static void clickMethod(WebElement ele ) {
		ele.click();

	}
	
	public static void actionDragDrop(WebElement src, WebElement des) {
		 a = new Actions(driver);
		 a.dragAndDrop(src,des).perform();
	}
	
	public static void actionMoveToElement(WebElement target) {
		a = new Actions(driver);
		a.moveToElement(target).perform();
	}
	
	public static void actionDoubleClick() {
		a = new Actions(driver);
		a.doubleClick().perform();

	}
	
	public static void actionContextClick() {
		a = new Actions(driver);
		a.contextClick().perform();
	}
	
	public static void altAccept() {
		a1 = driver.switchTo().alert();
		a1.accept();

	}
	
	public static void altDismiss() {
		a1 = driver.switchTo().alert();
		a1.dismiss();	
	}
	
	public static void altSendKeys(String value) {
		a1 = driver.switchTo().alert();
		a1.sendKeys(value);

	}
	
	public static void altText() {
		a1 = driver.switchTo().alert();
		a1.getText();
	}
	
	public static void dropDownSelectWithValue(WebElement SelectWebRef , String value) {
		 s = new Select(SelectWebRef);
		 s.selectByValue(value);
	}
	
	
	public static void dropDownSelectWithVisibleText(WebElement Ele , String text ) {
		s = new Select(Ele);
		s.selectByVisibleText(text);
	}
	
	public static void dropDownSelectWithIndex(WebElement ele , int index) {
		s = new Select(ele);
		s.selectByIndex(index);
	}
	
	public static void isMultipleSelect(WebElement ele) {
		s = new Select(ele);
		boolean a = s.isMultiple();
		System.out.println(a);
	}
	
	public static void getOptionsSelect(WebElement ele) {
		s = new Select(ele);
		List<WebElement> a = s.getOptions();
		System.out.println(a);
	}
	
	public static void getAllSelectedOptionsSelect(WebElement ele) {
		s = new Select(ele);
		List<WebElement> a = s.getAllSelectedOptions();
		System.out.println(a);
		
	}
	
	public static void getSnap(String fileName) {
		 t = (TakesScreenshot)driver;
		 File src = t.getScreenshotAs(OutputType.FILE);
		 File f = new File
				 ("C:\\Users\\WIN8\\eclipse-workspace\\MavenProjectSample\\ScreenShotFiles\\"+fileName+".png");

	}
	
	public static String excelFile() throws IOException {
		
		File f =new File("C:\\Users\\WIN8\\eclipse-workspace\\MavenProjectSample\\XLSheet\\excel.xlsx");
		
		FileInputStream fi =new FileInputStream(f);
		
		Workbook book = new XSSFWorkbook(fi);
		
		Sheet sh = book.getSheet("Details");
		String name = null;
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			
			Row row = sh.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell c = row.getCell(j);
				int type = c.getCellType();
				if (type==1) {
					name = c.getStringCellValue();
				}
				
				else if (DateUtil.isCellDateFormatted(c)) {
					Date format = c.getDateCellValue();
					SimpleDateFormat si =new SimpleDateFormat("dd-mm-yyyy");
					 name = si.format(format);
				}
				else {
					double value = c.getNumericCellValue();
					long l =(long)value;
					 name = String.valueOf(l);
				
				}
			
			}
		}
		
		
		
		return name;
	}

	public static void outputSream(String NewFile, int rownum , int column,String value) throws IOException {
		File f = new File
		("C:\\Users\\WIN8\\eclipse-workspace\\MavenProjectSample\\"+ NewFile +".xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet cr = book.createSheet();
		Row row = cr.createRow(rownum);
		Cell cell = row.createCell(column);
		cell.setCellValue(value);
		FileOutputStream fot = new FileOutputStream(f);
		book.write(fot);
		System.out.println("New Sheet Added");
		}
	
	public static void editStream(String NewFile, int rownum , int column,String value) throws IOException {
		File f = new File
		("C:\\Users\\WIN8\\eclipse-workspace\\MavenProjectSample\\"+ NewFile +".xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook();
		Sheet cr = book.createSheet();
		Row row = cr.createRow(rownum);
		Cell cell = row.createCell(column);
		cell.setCellValue(value);
		FileOutputStream fot = new FileOutputStream(f);
		book.write(fot);
		System.out.println("File Edited");
		}
	
}
