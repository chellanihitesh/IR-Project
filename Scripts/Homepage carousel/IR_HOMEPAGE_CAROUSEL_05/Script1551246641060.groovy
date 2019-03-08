import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After
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

WebUI.openBrowser('');
WebUI.waitForPageLoad(3);
WebUI.maximizeWindow();
WebUI.navigateToUrl("https://qa-ir.amwaternp.net/#/home");

WebUI.waitForPageLoad(5);

WebUI.delay(12);

//waiting for element to present while scrolling
WebUI.waitForElementPresent(findTestObject("Object Repository/Homepage carousel objects/carousel event page link/Event Page link"), 10);

//Checking element is present if not stop on failure
WebUI.verifyElementPresent(findTestObject("Object Repository/Homepage carousel objects/carousel event page link/Event Page link"), 10, FailureHandling.STOP_ON_FAILURE)

//clicking on element if not stop on failure
WebUI.click(findTestObject("Object Repository/Homepage carousel objects/carousel event page link/Event Page link"), FailureHandling.STOP_ON_FAILURE)

//wait for page to load
WebUI.waitForPageLoad(10);

String acturl="https://qa-ir.amwaternp.net/#/events/494737";

String expurl=WebUI.getUrl();

System.out.println(expurl);


if(expurl.equals(acturl))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}





























/*WebUI.waitForElementPresent(findTestObject("Object Repository/Homepage carousel objects/carousel webcast button/button Webcast"), 10);

Boolean flagvalue=WebUI.verifyElementPresent(findTestObject("Object Repository/Homepage carousel objects/carousel webcast button/button Webcast"), 5)


try
{
	flagvalue==true
	
	WebUI.click(findTestObject("Object Repository/Homepage carousel objects/carousel webcast button/button Webcast"))
	WebUI.delay(3);
	WebUI.switchToWindowIndex(1);
	String acttitle=WebUI.getWindowTitle()
	String exptitle="Webcast"; 
	
	System.out.println(exptitle+"webcast link is present"+"pass");
} 
catch (Exception e)
{
	e.printStackTrace()
	System.out.println(e+"fail");
}*/

















