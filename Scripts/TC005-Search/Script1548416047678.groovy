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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

CustomKeywords.'utilities.BasicFunctions.invokeapplication'()

WebUI.verifyElementPresent(findTestObject('Search/input_Search'), 0)

WebUI.sendKeys(findTestObject('Search/input_Search'), findTestData('Search_Input').getValue(1, 1))

WebUI.sendKeys(findTestObject('Search/input_Search'), Keys.chord(Keys.ENTER, ''))

WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject('Search/p_Results (100)'), 30)

WebUI.verifyElementText(findTestObject('Search/h1_Search'), 'Search')

WebUI.waitForPageLoad(0)

/*WebDriver driver = DriverFactory.getWebDriver()

int elecount = driver.findElements(By.name(findTestData('Search_Input').getValue(1, 1))).size()

//int eleCount = driver.equals(findTestData('Search_Input').getValue(1, 1)).

println elecount

WebElement body = driver.findElement(By.tagName("body"));

String bodyText = driver.findElement(By.name(findTestData('Search_Input').getValue(1, 1));

	int count = 0;
	
	While (bodyText.contains(findTestData('Search_Input').getValue(1, 1)))
		{
			
			count++;
			
		}
	//	system.out.println(count);
*/
CustomKeywords.'utilities.BasicFunctions.closeApplication'()

