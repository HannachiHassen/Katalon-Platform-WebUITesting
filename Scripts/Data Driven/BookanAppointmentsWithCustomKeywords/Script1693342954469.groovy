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

CustomKeywords.'example.MyKeywords.AppLogin'()

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service_DataDriven/ddHealthcareCenter'), 1, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(findTestObject('Page_CURA Healthcare Service_DataDriven/cbReadmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service_DataDriven/cbMedicare'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service_DataDriven/cbMedicaid'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service_DataDriven/cbNone'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service_DataDriven/txtVisitDate'), '31/08/2023')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service_DataDriven/txtComment'), 'I will type somthing in here')

    WebUI.click(findTestObject('Page_CURA Healthcare Service_DataDriven/btnBookAppointment'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service_DataDriven/btnGotoHomepage'))

    CustomKeywords.'example.MyKeywords.Congrats'('you')
}

WebUI.closeBrowser()

