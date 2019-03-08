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

WebUI.waitForPageLoad(10)

WebUI.delay(5)

//check for header section is present
boolean elementcheck=WebUI.verifyElementPresent(findTestObject("Object Repository/Header Section Objects/White color header/white color header/div_Investing With Us"), 10)

Assert.assertTrue(elementcheck)

for(int i=1;i<=5;i++)
{
String obj1= findTestData('Data Files/Links').getValue('dropdowns', i)
//println (obj1);

String obj2 = findTestData('Data Files/Links').getValue('objects', i)
//println (obj2);

String dd=WebUI.getText(findTestObject(obj2))
println (dd);


if(obj1.equals(dd))
{
	println ("pass");
}
else
{
	println ("fail");
}

}


















