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

//Browser opening & url navigation
WebUI.openBrowser('');
WebUI.waitForPageLoad(3);
WebUI.maximizeWindow();
WebUI.navigateToUrl("https://qa-ir.amwaternp.net/#/home");

String contactustext="Contact US";
String name1="Edward Vallejo - Vice President, Investor Relations";
String name2="Ralph Jedlicka - Director, Investor Relations";
String name3="Kelley Uyeda - Executive Assistant, Investor Relations";

WebUI.waitForPageLoad(5);

String name11=WebUI.getText(findTestObject("Object Repository/Footer Section Objects/name1/p_Edward Vallejo - Vice Presid"));
String name22=WebUI.getText(findTestObject("Object Repository/Footer Section Objects/name2/p_Ralph Jedlicka - Director In"));
String name33=WebUI.getText(findTestObject("Footer Section Objects/name3/p_Kelley Uyeda - Executive Ass"));

if(name11==name1&&name22==name2&&name33==name3)
{
	println ("Contact Us names are present");
}
else
{
	println ("Contact Us names are not present");
}

