package utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class CreateRuntimeObjectWishlist {

	private String getObjectXpath(String objectVariable) {
		//	return "//img[@title ='" + objectVariable + "']"
		return "//*[@id="Analyst Coverage"]/div[2]/div[1]/ul[1]/li["+ objectVariable +"]/div[1]/div[1]/h5[1]";
	}

	//xpath will get generated during runtime
	//Need to create object during runtime
	//for creating test object we used TestObject class

	private TestObject getElementTestObject(String objectVariable)
	{
		TestObject objectItem = new TestObject(objectVariable)

		objectItem.addProperty("xpath", ConditionType.EQUALS, getObjectXpath(objectVariable),true)
		return objectItem
		System.out.println('Xpath is - '  + getElementTestObject(objectVariable))
	}

	@Keyword
	public void createRuntimeObject(String objectVariable) {
		TestObject objectItem = getElementTestObject(objectVariable)
		WebUI.verifyElementPresent(objectItem, GlobalVariable.G_ShortTimeOut)

	}

}

