import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.testng.Assert as Assert
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//check for header section is present
CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.launchBrowser'('')

KeywordLogger logger=new KeywordLogger()
logger.logInfo("Application launched successfully")

boolean elementcheck = WebUI.verifyElementPresent(findTestObject('Object Repository/Quick Links Section/Quick links header section/div_American Water Corporate S'), 10)
logger.logInfo("Element is "+elementcheck)

boolean val=Assert.assertTrue(elementcheck)
logger.logInfo(elementcheck+"Element is"+val)

for (int i = 1; i <= 6; i++) {
    String obj1 = findTestData('Data Files/Links').getValue('Quicklinks text', i)
	logger.logInfo("getting quick links data from excel")
	
    //println (obj1);
    String obj2 = findTestData('Data Files/Links').getValue('Objects', i)
	logger.logInfo("getting object data from excel")
	
    //println (obj2);
    String link = WebUI.getText(findTestObject(obj2))
    println(link)
	logger.logInfo("getting text")

    if (obj1.equals(link)) {
        println('pass')
    } else {
        println('fail')
    }
}

CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.closeBrowser'()
logger.logInfo("browser closed successfully")
