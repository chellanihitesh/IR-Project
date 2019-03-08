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

WebUI.delay(12);

WebUI.waitForElementPresent(findTestObject("Object Repository/Homepage carousel objects/carousel event page link/Event Page link"), 10);

Boolean flagvalue=WebUI.verifyElementPresent(findTestObject("Object Repository/Homepage carousel objects/carousel event page link/Event Page link"), 5)


try
{
	flagvalue==true
	WebUI.click(findTestObject("Object Repository/Homepage carousel objects/carousel event page link/Event Page link"))
	WebUI.delay(3);
	
	String acttitle=WebUI.getText(findTestObject("Object Repository/Homepage carousel objects/upcoming event page title/UPCOMING EVENT"))
	String exptitle="UPCOMING EVENT";
	
	System.out.println(exptitle+"Eventpage link is present"+"pass");
}
catch (Exception e)
{
	e.printStackTrace()
	System.out.println(e+"fail");
}
