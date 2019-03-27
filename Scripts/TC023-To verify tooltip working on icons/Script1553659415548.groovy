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
import com.kms.katalon.core.webui.keyword.builtin.GetUrlKeyword as GetUrlKeyword
import com.sun.jna.platform.win32.DsGetDC as DsGetDC
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Home Page/Featured Articles/link_View All_FeaturedArticles'), 5)

WebUI.click(findTestObject('Home Page/Featured Articles/link_View All_FeaturedArticles'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('NotificationIcons/icon_PDFDownload'), 5, FailureHandling.CONTINUE_ON_FAILURE)

attributePDF = WebUI.getAttribute(findTestObject('NotificationIcons/icon_PDFDownload'), 'tooltip', FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyMatch(attributePDF, 'PDF', false) == true) {
    System.out.println('Tooltip for PDFDownload is correct') //println('Tooltip for PDFDownload is', attributePDF)
} else {
    System.out.println('Tooltip for PDFDownload is incorrect')
}

WebUI.waitForElementPresent(findTestObject('NotificationIcons/icon_Email'), 5, FailureHandling.CONTINUE_ON_FAILURE)

attributeEmail = WebUI.getAttribute(findTestObject('NotificationIcons/icon_Email'), 'tooltip', FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyMatch(attributeEmail, 'Email', false) == true) {
    System.out.println('Tooltip for Email is correct' //println('Tooltip for PDFDownload is', attributePDF)
        )
} else {
    System.out.println('Tooltip for Email is incorrect')
}

WebUI.waitForElementPresent(findTestObject('NotificationIcons/icon_Notification'), 5, FailureHandling.CONTINUE_ON_FAILURE)

attributeNotification = WebUI.getAttribute(findTestObject('NotificationIcons/icon_Notification'), 'tooltip', FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyMatch(attributeNotification, 'Notification', false) == true) {
    System.out.println('Tooltip for Notification is correct' //println('Tooltip for PDFDownload is', attributePDF)
        )
} else {
    System.out.println('Tooltip for Notification is incorrect')
}

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

