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

WebUI.navigateToUrl('http://cms.demo.katalon.com/my-account/')

// Login stage
WebUI.setText(findTestObject('Object Repository/Web 04 - Image Savior/Page_My account  Katalon Shop/input__username'), 'customer')

WebUI.setEncryptedText(findTestObject('Object Repository/Web 04 - Image Savior/Page_My account  Katalon Shop/input__password'), 
    'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_My account  Katalon Shop/button_Log in'))

// Browsing stage
WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_My account  Katalon Shop/a_Shop'))

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Katalon Shop  Katalon Ecommerce/span_Default sorting'))

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Katalon Shop  Katalon Ecommerce/li_Sort by average rating'))

WebUI.click(findTestObject('Web 04 - Image Savior/Page_Katalon Shop  Katalon Ecommerce/img_Ninja Thumbnail (Broken)'))

WebUI.verifyElementText(findTestObject('Object Repository/Web 04 - Image Savior/Page_Flying Ninja  Katalon Shop/h1_Flying Ninja'), 'Flying Ninja')

WebUI.click(findTestObject('Web 04 - Image Savior/Page_Flying Ninja  Katalon Shop/button_Add to cart (Broken)'))

// Checkout stage
WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Flying Ninja  Katalon Shop/a_View cart'))

WebUI.setText(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/input_Coupon_coupon_code'), 
    'KBAW662Szzzz')

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/button_Apply coupon'))

WebUI.verifyElementText(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/li_Coupon kbaw662szzzz does not exist'), 
    'Coupon "kbaw662szzzz" does not exist!')

WebUI.setText(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/input_Coupon_coupon_code'), 
    'KBAW662S')

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/button_Apply coupon'))

WebUI.verifyElementText(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/div_Coupon code applied successfully'), 
    'Coupon code applied successfully.')

// Clean stage
WebUI.executeJavaScript('document.querySelector(\'[href="http://cms.demo.katalon.com/cart/?remove_coupon=kbaw662s"]\').click()', null)

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/a_Remove item'))

WebUI.click(findTestObject('Object Repository/Web 04 - Image Savior/Page_Cart  Katalon Shop/a_Return to shop'))

not_run: WebUI.closeBrowser()

