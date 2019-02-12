package utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class BasicFunctions {



	@Keyword
	def invokeapplication() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://ir.amwater.com')

		'For IE Load'
		WebUI.delay(30)

		not_run: WebUI.waitForPageLoad(30)

		WebUI.maximizeWindow()
	}

	@Keyword
	def closeApplication() {
		WebUI.closeBrowser()
	}



	@Keyword
	public void demoKey(String name) throws IOException{
		FileInputStream fis = new FileInputStream("D:\\Katalon_Studio_Windows_64-5.10.1\\projects\\IR Project\\Excels\\AC.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		Row row = sheet.createRow(rowCount+1);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(name);
		FileOutputStream fos = new FileOutputStream("D:\\Katalon_Studio_Windows_64-5.10.1\\projects\\IR Project\\Excels\\AC.xlsx");
		workbook.write(fos);
		fos.close();
	}

	/*@keyword
	 def extractNumbersFromString() {
	 //*************** Extracting int values *************************
	 String searchCountStr = “There are 280 search results”;
	 // or String cartCountStr = “There are total 6 items in your cart”;
	 int searchCount = Integer.parseInt(searchCountStr.replaceAll(“\D”,""));
	 System.out.println(searchCount);
	 //*************** Extracting double values *************************
	 String totalPriceStr = "Your have paid £154.75 for this order”;
	 // or String totalPriceStr = “Total Price: £154.75”;
	 double totalPrice = Double.parseDouble(totalPriceStr.replaceAll(“[^0-9\\.]+”, “”));
	 System.out.println(totalPrice);
	 }
	 }*/

	/*@Keyword
	 def killwebdriver() {
	 Process[] chromeDriverProcesses =  Process.GetProcessesByName("chromedriver");
	 foreach(var chromeDriverProcess in chromeDriverProcesses)
	 {
	 chromeDriverProcess.Kill();
	 }
	 //taskkill /im chromedriver.exe /f
	 Runtime.getRuntime().exec(‘taskkill /f /im chromedriver.exe’)
	 Runtime.getRuntime().exec(‘taskkill /f /im geckodriver.exe’)
	 Runtime.getRuntime().exec(‘taskkill /f /im IEDriverServer.exe’)
	 Runtime.getRuntime().exec(‘taskkill /f /im firefox.exe’)
	 }
	 static void runBatchFile(String batchFile) {
	 String bf = RunConfiguration.getProjectDir() + '/' + batchFile
	 comment("Running batch file: " + bf)
	 Runtime.runtime.exec(bf)
	 }*/

	@Keyword
	public static String extractNumberFromString(String source) {
		StringBuilder result = new StringBuilder(100);
		for (char ch : source.toCharArray()) {
			if (ch >= '0' && ch <= '9') {
				result.append(ch);
			}
		}

		return result.toString();
	}


	@Keyword
	def Sel_CheckPageTitle ()  {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Driver\\Mozilla\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();


		String baseUrl = "https://ir.amwater.com/";
		String expectedTitle = "Investor Relations";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		//close Fire fox
		//driver.close();

	}

}
