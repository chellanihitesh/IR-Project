import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

WebUI.waitForPageLoad(5)

WebUI.waitForElementPresent(findTestObject('Object Repository/Corporate Governance/Contact the board objects/corporate Governance/a_Corporate Governance'), 10)

WebUI.mouseOver(findTestObject('Object Repository/Corporate Governance/Contact the board objects/corporate Governance/a_Corporate Governance'))

WebUI.click(findTestObject('Object Repository/Corporate Governance/Contact the board objects/Contact the board option/a_Contact the Board'))

WebUI.waitForPageLoad(3)

WebUI.delay(5);

String text1="Shareholders and interested parties can contact the American Water Board of Directors to provide comments, to report concerns, or to ask a question, at the following address."

String text2="American Water Board of Directors"
			 
String text3="1 Water St,"
			   
String text4="Camden, NJ 08102"
			   
String text5="or via email: contacttheboard@amwater.com"


String exptext=text1+"\n"+"\n"+text2+"\n"+text3+"\n"+text4+"\n"+text5;


String acttext=WebUI.getText(findTestObject("Object Repository/Corporate Governance/Contact the board objects/contact the board text/div_Shareholders and intereste"))		   
			   
System.out.println(acttext);
System.out.println(exptext);

if(exptext.equals(acttext))
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
			   
			   
			   
			   
			   
			   