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

WebUI.comment('Story: Book an appointment')

WebUI.comment('Given that the user has logged into their account')

WebUI.openBrowser(GlobalVariable.URL)

WebUI.takeScreenshotAsCheckpoint('login', null)

WebUI.callTestCase(findTestCase('Visual Test/Common Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('And Appointment page is displayed')

WebUI.takeScreenshotAsCheckpoint('appointment', null)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_None_programs'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '10/09/2023')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Visual Testing: Please make appointment as soon as possible.')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.takeScreenshotAsCheckpoint('confirmation', null)

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.comment('Then he should be able to book a new appointment')

WebUI.verifyMatch('Seoul CURA Healthcare Center', WebUI.getText(findTestObject('Page_CURA Healthcare Service/p_Seoul CURA Healthcare Center')),	false)

WebUI.verifyMatch('Yes', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_HospitalReadmission')), false)

WebUI.verifyMatch('None', WebUI.getText(findTestObject('Page_CURA Healthcare Service/p_None')), false)

WebUI.verifyMatch('10/09/2023', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_VisitDate')), false)

WebUI.verifyMatch('Visual Testing: Please make appointment as soon as possible.', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Comment')), 
    false)

WebUI.takeScreenshot()

WebUI.closeBrowser()

