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

CustomKeywords.'utilities.BasicFunctions.invokeapplication'()

WebUI.click(findTestObject('ContactUs aka RequestMaterials/button_Contact Us'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('ContactUs aka RequestMaterials/button_Request Materials'))

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/h2_Request Materials'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/p_or send us a questioncomment'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input__firstName'), 'Hitesh')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input__lastName'), 'Chellani')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input__email'), 'hiteshc@Apporchid.com')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input_MailingAddress'), 'Manikonda')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input_City'), 'Hyderabad')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input_State'), 'Telangana')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input_zip'), '400051')

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/input_country'), 'India')

WebUI.verifyElementVisible(findTestObject('ContactUs aka RequestMaterials/strong_Materials'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/ul_Annual Report'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_Annual Report'))

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/li_Proxy Statement'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_Proxy Statement'))

WebUI.verifyElementVisible(findTestObject('ContactUs aka RequestMaterials/li_Latest Earnings Release'))

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_Latest Earnings Release'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/li_Latest Press Release'), 0)

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_Latest Press Release'))

WebUI.verifyElementChecked(findTestObject('ContactUs aka RequestMaterials/input_Latest Press Release'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/li_10-K'), 0)

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_10K'))

WebUI.verifyElementVisible(findTestObject('ContactUs aka RequestMaterials/li_10-Q'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_10Q'))

WebUI.verifyElementNotChecked(findTestObject('ContactUs aka RequestMaterials/input_Other_other'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('ContactUs aka RequestMaterials/input_Other_other'))

WebUI.click(findTestObject('ContactUs aka RequestMaterials/li_Other'))

WebUI.setText(findTestObject('ContactUs aka RequestMaterials/textarea_Other_question'), 'Questions Comments')

not_run: WebUI.click(findTestObject('ContactUs aka RequestMaterials/Captcha'))

not_run: WebUI.click(findTestObject('ContactUs aka RequestMaterials/div_Submit'))

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/p_Thank you for your interest'), 0)

WebUI.verifyElementPresent(findTestObject('ContactUs aka RequestMaterials/p_Please let us know if you ha'), 0)

CustomKeywords.'utilities.BasicFunctions.closeApplication'()

