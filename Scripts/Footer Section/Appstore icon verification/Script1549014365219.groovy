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

//WebUI.scrollToElement(findTestObject("Object Repository/Footer Section Objects/facebook icon/a_Follow Us_fab fa-facebook-sq"), 3)


WebUI.waitForElementPresent(findTestObject("Object Repository/Footer Section Objects/Appstore icon/img_Get The App_store-icon-foo"), 10);

WebUI.click(findTestObject("Object Repository/Footer Section Objects/Appstore icon/img_Get The App_store-icon-foo"));

WebUI.waitForPageLoad(3);

String acttitle=WebUI.getWindowTitle();

String exptitle="itunes.apple.com";

println (exptitle);

if(acttitle.contains(exptitle))
{
	println (" link working");
}
else
{
	println (" link not working");
}