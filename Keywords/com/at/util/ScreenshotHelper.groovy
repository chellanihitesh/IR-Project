package com.at.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint()

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

WebElement element = WebUICommonHelper.findWebElement(object, 20)
WebDriver driver = DriverFactory.getWebDriver();

Screenshot screenshot = new Ashot().takeScreenshot(driver, element);
ImageIO.write(screenshot.getImage(), "PNG,new File(System.getProperty("user.dir") + "/ErrorScrenshots/ElementSccreeshot.png"))
	}
	
}
