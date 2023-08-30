import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

/**
 * Verify Title match the expected string
 * Verify Element is present - make appointment button is present in the DOM
 * Verify Element is clickable - make appointment button is clickable
 * Verify Element is visibale - Copyright text is visibale on the webpage
 * Verify Element is visibale in viewport
 */
title = WebUI.getWindowTitle()
WebUI.verifyMatch('CURA Healthcare Service', title, true)
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'), 2)
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/Copyright text'))
//WebUI.verifyElementVisibleInViewport(findTestObject('Object Repository/Page_CURA Healthcare Service/Copyright text'),2)

/**
 * Verify Element is not present - make appointment button is present in the DOM
 */

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 2)

/**
 * Verify text is present
 */
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))
WebUI.verifyTextPresent('Please login to make appointment', false)

/**
 * Verify Element text
 */
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')
WebUI.setEncryptedText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))
WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')

/**
 * Close Browser
 */
WebUI.delay(2)
WebUI.closeBrowser()