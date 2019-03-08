import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.delay(10);

WebUI.waitForElementPresent(findTestObject("Object Repository/Homepage carousel objects/Navigation right arrow/i_Event Page_right-arrow"), 10);

Boolean flagvalue1=WebUI.verifyElementPresent(findTestObject("Object Repository/Homepage carousel objects/Navigation right arrow/i_Event Page_right-arrow"), 5)
Boolean flagvalue2=WebUI.verifyElementPresent(findTestObject("Object Repository/Homepage carousel objects/Navigation_Leftarrow/i_Event Page_left-arrow"), 5)
try 
{
	flagvalue1&&flagvalue2==true
	WebUI.click(findTestObject("Object Repository/Homepage carousel objects/Navigation right arrow/i_Event Page_right-arrow"));
	WebUI.delay(2);
	WebUI.click(findTestObject("Object Repository/Homepage carousel objects/Navigation_Leftarrow/i_Event Page_left-arrow"));
	System.out.println("passed");
} 
catch (Exception e) 
{
	e.printStackTrace()
	System.out.println("failed"+e);
	
}


