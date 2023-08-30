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
import internal.GlobalVariable

import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


/**
 * Open Browser and pass the URL
 * Maximize Window
 */
WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
WebUI.maximizeWindow()

/**
 * Get window title and print, can use print (WebUI.getWindowTitle())
 * Get URL of the window
 */
WebUI.getWindowTitle()
println (WebUI.getWindowTitle()) 
WebUI.getUrl()

/**
 * Get window index
 * Define a variable intger and store windwo index 
 */
WebUI.getWindowIndex()
int currentTab = WebUI.getWindowIndex()

/**
 * Open a new window using Javascript snippet
 * 
 */
WebDriver driver= DriverFactory.getWebDriver()
JavascriptExecutor js= ((driver) as JavascriptExecutor)
js.executeScript('window.open();')

/**
 * Switch window with index currentTab+1 
 * Navigate to wiki
 * Get index of the new window
 */
WebUI.switchToWindowIndex(currentTab+1)
WebUI.navigateToUrl('https://www.wikipedia.org/')
WebUI.getWindowIndex()
WebUI.delay(3)

/**
 * Switch to window with title
 */
WebUI.switchToWindowTitle('CURA Healthcare Service')

/**
 * Switch to window with URL
 */
WebUI.switchToWindowUrl('https://www.wikipedia.org/')
WebUI.delay(3)

/**
 * Close window by title
 */
//WebUI.closeWindowTitle('CURA Healthcare Service')

/**
 * Close window by URL
 */
//WebUI.closeWindowUrl('https://katalon-demo-cura.herokuapp.com/')

/**
 * Close window by index
 * For window with index 1, can use currentTab or 1
 * For window with index 2, can use currentTab+1 or 2
 */
WebUI.closeWindowIndex(currentTab)
WebUI.delay(3)

WebUI.closeBrowser()
