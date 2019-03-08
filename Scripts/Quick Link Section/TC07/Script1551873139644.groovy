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

CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.launchBrowser'('https://qa-ir.amwater.com/#/home')

for (int i = 1; i<= 6; i++)
 {
    String path1 = "//div[@id='irscroll']/ir-header/header/div[2]/div/div[2]/ul/li[";
    String path2 = "]";

	TestObject to1=findTestObject("Object Repository/Quick Links Section/Presentations link/li_Presentations")
    to1.findProperty('xpath').setValue("//div[@id='irscroll']/ir-header/header/div[2]/div/div[2]/ul/li["+i+"]")
	                                   
	WebUI.click(to1)
	
	WebUI.delay(3);
	
	WebUI.click(findTestObject("Object Repository/Header Section Objects/Amwater logo on whiteheader/img_Investing With Us_logo"))
	
	WebUI.delay(3);

 }
