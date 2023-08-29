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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Web 01 - XPaths were broken - Heal by CSS selector/Page_CURA Healthcare Service/a_Make Appointment'))

def username = findTestObject('Web 01 - XPaths were broken - Heal by CSS selector/Page_CURA Healthcare Service/input_Username_username')

WebUI.setText(username, 'Healed by CSS Selector')

WebUI.verifyElementAttributeValue(username, 'value', 'Healed by CSS Selector', 5)

WebUI.setEncryptedText(findTestObject('Web 01 - XPaths were broken - Heal by CSS selector/Page_CURA Healthcare Service/input_Password_password'), 
    'D6wWZFKNXMObfcyi7o9uog==')

WebUI.closeBrowser()

