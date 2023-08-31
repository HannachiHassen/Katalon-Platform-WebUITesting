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

WebUI.callTestCase(findTestCase('Reuse Test Case/E-commerce/TC002_Add to cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.navigateToUrl('https://cms.demo.katalon.com/checkout/')

WebUI.verifyElementText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/h1_Checkout'), 'Checkout')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    'Katalon')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    'customer')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 
    'KMS')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))

WebUI.click(findTestObject('Katalon Ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_address_1'), 
    '119 Nguyen Thi Thap')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_postcode'), 
    '70000')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_city'), 'HCM')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_phone'), '0359912894')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_email'), 'katalonLover@outlook.com')

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.verifyElementText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')

