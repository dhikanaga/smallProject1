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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('homePage/button_BUY NOW'))

WebUI.setText(findTestObject('homePage/input_name'), GlobalVariable.name)

WebUI.setText(findTestObject('homePage/input_email'), invalidEmail)

WebUI.setText(findTestObject('homePage/input_phone'), GlobalVariable.phoneNumber)

WebUI.setText(findTestObject('homePage/input_city'), GlobalVariable.city)

WebUI.setText(findTestObject('homePage/input_address'), GlobalVariable.address)

WebUI.setText(findTestObject('homePage/input_postal'), GlobalVariable.postalCode)

WebUI.click(findTestObject('homePage/button_CHECKOUT'))

WebUI.verifyElementPresent(findTestObject('homePage/email_error_message'), 2)

WebUI.closeBrowser()

