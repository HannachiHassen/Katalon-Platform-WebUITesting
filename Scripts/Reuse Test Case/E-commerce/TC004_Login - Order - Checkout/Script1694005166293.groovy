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

WebUI.navigateToUrl(url)

WebUI.waitForPageLoad(waitForPageLoad)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Katalon Shop  Katalon Ecommerce/menuMy account'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_My account  Katalon Shop/input__username'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Katalon Ecommerce/Page_My account  Katalon Shop/input__password'), 
    password)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_My account  Katalon Shop/btn_Log in'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Ecommerce/Page_My account  Katalon Shop/loggedUsername'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('null'), 'KatalonLover')

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Ecommerce/Page_My account  Katalon Shop/nav_HomeMyaccount'), 
    0)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_My account  Katalon Shop/a_Shop'))

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Katalon Shop  Katalon Ecommerce/img__attachment-woocommerce_thumbnail size-_5f269b'))

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Happy Ninja  Katalon Shop/btn_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Ecommerce/Page_Happy Ninja  Katalon Shop/div_View cart Happy Ninja has been added to_368951'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Ecommerce/Page_Happy Ninja  Katalon Shop/nav_HomeClothingHoodiesHappy Ninja'), 
    0)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Happy Ninja  Katalon Shop/a_View cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Ecommerce/Page_Cart  Katalon Shop/h1_Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Katalon Ecommerce/Page_Cart  Katalon Shop/a_Happy Ninja'), 
    0)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.navigateToUrl(checkoutUrl)

WebUI.verifyElementText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/h1_Checkout'), 'Checkout')

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_first_name'), 
    firstname)

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_last_name'), 
    lastname)

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 
    company)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))

WebUI.click(findTestObject('Katalon Ecommerce/Page_Checkout  Katalon Shop/span_Vietnam'))

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_address_1'), 
    address)

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input_(optional)_billing_postcode'), 
    postcode)

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_city'), city)

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_phone'), phone)

WebUI.setText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/input__billing_email'), email)

WebUI.click(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/button_Place order'))

WebUI.verifyElementText(findTestObject('Object Repository/Katalon Ecommerce/Page_Checkout  Katalon Shop/p_Thank you. Your order has been received'), 
    message)

