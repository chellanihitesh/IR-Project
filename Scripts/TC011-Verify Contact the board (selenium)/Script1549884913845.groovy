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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions
import org.testng.Assert as Assert
import java.util.List as List

WebUI.callTestCase(findTestCase('TT001-Launch Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

not_run: WebUI.mouseOver(findTestObject('Menu_SubMenu_Links/a_Financial Reports'))

WebElement corporateGovernance = driver.findElement(By.cssSelector('ul.navbar-nav:nth-child(2) > li:nth-child(4) > a:nth-child(1)'))

Actions action = new Actions(driver)

action.moveToElement(corporateGovernance).build().perform()

WebUI.delay(3)

//absolute Xpath
//driver.findElement(By.xpath("/html/body/ion-app/ng-component/div/ir-main-header/nav/div/div[2]/div/ul[1]/li[4]/div/a[4]")).click();
//Relative xpath
driver.findElement(By.xpath('//*[@class=\'dropdown-item\'][text()=\'Contact the Board\']')).click()

WebUI.delay(2)

//driver.findElement(By.xpath("//[@class='contact-content'][text()='Shareholders and interested parties can contact the American Water Board of Directors to provide comments, to report concerns, or to ask a question, at the following address.']"))
String actualText = driver.findElement(By.xpath('//DIV[@class=\'contact-content\']')).getText()

String text1 = 'Shareholders and interested parties can contact the American Water Board of Directors to provide comments, to report concerns, or to ask a question, at the following address.'

String text2 = 'American Water Board of Directors'

String text3 = '1 Water St,'

String text4 = 'Camden, NJ 08102'

String text5 = 'or via email: contacttheboard@amwater.com'

String expectedText = ((((((((text1 + '\n') + '\n') + text2) + '\n') + text3) + '\n') + text4) + '\n') + text5

System.out.println(expectedText)

System.out.println(actualText)

if (expectedText.equals(actualText)) {
    println('Content matches')
} else {
    println('Content mismatches')
}

WebUI.scrollToElement(findTestObject('ContactTheBoard/a_contacttheboardamwater.com'), 2)

WebUI.verifyElementClickable(findTestObject('ContactTheBoard/a_contacttheboardamwater.com'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

