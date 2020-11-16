import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class redirectTo {
	@Keyword
	def orderSummary(){
		WebUI.click(findTestObject('homePage/button_settings'))

		WebUI.click(findTestObject('homePage/label_Set advanced rules'))

		WebUI.click(findTestObject('homePage/radio_redirection'))

		WebUI.click(findTestObject('homePage/button_start'))

		WebUI.verifyElementText(findTestObject('paymentPage/total_price'), '20,000')

		WebUI.click(findTestObject('paymentPage/creditordebit'))

		WebUI.verifyElementText(findTestObject('paymentPage/final_price'), '18,000')
	}
}
