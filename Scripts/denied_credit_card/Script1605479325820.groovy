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

CustomKeywords.'customerDetails.inputData'()

CustomKeywords.'redirectTo.orderSummary'()

WebUI.setText(findTestObject('paymentPage/input_card_number'), cardNumber)

WebUI.setText(findTestObject('paymentPage/input_expiry'), expiry)

WebUI.setText(findTestObject('paymentPage/input_cvv'), cvv)

WebUI.click(findTestObject('paymentPage/button_Bayar Sekarang'))

WebUI.switchToFrame(findTestObject('paymentPage/iframe_gagal'), 2)

WebUI.setText(findTestObject('paymentPage/input_Password_PaRes'), otp)

WebUI.delay(2)

WebUI.click(findTestObject('paymentPage/button_OK'))

WebUI.verifyElementText(findTestObject('paymentPage/message_Transaksi gagal'), 'Transaksi gagal')

WebUI.delay(5)

WebUI.closeBrowser()

