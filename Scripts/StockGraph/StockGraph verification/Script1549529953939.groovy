import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import org.testng.Assert

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.waitForPageLoad(3)

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa-ir.amwaternp.net/#/home')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject("Object Repository/StockGraph objects/stockdropdown button/stockdropdown"))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject("Object Repository/StockGraph objects/stockdropdown button/stockdropdown"), 10)

WebUI.verifyElementPresent(findTestObject("Object Repository/StockGraph objects/graph window/div_1D  5D  1M  6M  YTD  1Y  5"), 5)

WebUI.verifyElementPresent(findTestObject("Object Repository/StockGraph objects/All frequencies/div_1D  5D  1M  6M  YTD  1Y  5"), 5)

WebUI.click(findTestObject("Object Repository/StockGraph objects/1D frequency/a_1D"))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject("Object Repository/StockGraph objects/All frequencies/div_1D  5D  1M  6M  YTD  1Y  5"), 5)

WebUI.delay(5)

String onedtextactual=WebUI.getText(findTestObject("Object Repository/StockGraph objects/1d garph text/span_Data would be available d"))

String onedtextexpected="Data would be available during the stock market trading hours";

Assert.assertEquals(onedtextactual, onedtextexpected)

Date date=java.util.Calendar.getInstance().getTime();
System.out.println(date);

/*String DATE_FORMAT = "dd-MM-yyyy hh:mm:ss a";
SimpleDateFormat sdfAmerica = new SimpleDateFormat(DATE_FORMAT);
TimeZone tzInAmerica = TimeZone.getTimeZone("America/New_York");
sdfAmerica.setTimeZone(tzInAmerica);
String sDateInAmerica = sdfAmerica.format(date); // Convert to String first
//Date dateInAmerica = formatter.parse(sDateInAmerica); // Create a new Date object
System.out.println("\nTimeZone : " + tzInAmerica.getID() + " - " + tzInAmerica.getDisplayName());
System.out.println("TimeZone : " + tzInAmerica);
System.out.println("Date (New York) (String) : " + sDateInAmerica);
//System.out.println("Date (New York) (Object) : " + formatter.format(dateInAmerica));
*/





/*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Date date = new Date();
System.out.println(formatter.format(date));*/

















