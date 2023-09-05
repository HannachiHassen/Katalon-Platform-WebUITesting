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

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/CP001_Database Checkpoint'), false)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.airbnb.com/')

WebUI.click(findTestObject('Object Repository/Airbnb/Page_Search/div_Add guests_s1qcpybl dir dir-ltr'))

WebUI.setText(findTestObject('Object Repository/Airbnb/Page_Search/input_Where_query'), city)

WebUI.click(findTestObject('Object Repository/Airbnb/Page_Search/div_Add dates'))

WebUI.click(findTestObject('Object Repository/Airbnb/Page_Search/div_3 days'))

WebUI.click(findTestObject('Object Repository/Airbnb/Page_Search/span_Add guests_t1dqvypu dir dir-ltr'))

WebUI.verifyTextPresent(expectedResult, false)

WebUI.closeBrowser()

