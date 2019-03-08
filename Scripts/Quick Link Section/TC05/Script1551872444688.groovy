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

CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.launchBrowser'('https://qa-ir.amwater.com/#/home')

KeywordLogger logger=new KeywordLogger()
logger.logInfo("Application launched successfully")

WebUI.waitForElementPresent(findTestObject('Object Repository/Header Section Objects/Header American water corporate site link/a_American Water Corporate Sit'), 10)
logger.logInfo("waiting for element")

WebUI.click(findTestObject('Object Repository/Header Section Objects/Header American water corporate site link/a_American Water Corporate Sit'))
logger.logInfo("clicked on element")

WebUI.waitForPageLoad(10)

String acturl = WebUI.getUrl()

String expurl = 'https://amwater.com/corp/'

println('acturl')

Assert.assertEquals(expurl, acturl)

if (acturl.contains(expurl)) {
    println('American water corp link working')
} else {
    println('American water corp link not working')
}

CustomKeywords.'launchandClosekeyword.LaunchandCloseApp.closeBrowser'()
logger.logInfo("Application closed successfully")



