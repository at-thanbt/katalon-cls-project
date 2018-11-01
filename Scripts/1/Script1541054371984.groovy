import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ntmtien.cls.vn/account/login')

WebUI.setText(findTestObject('1/Page_ng nhp/input_UserName'), 'admin1')

WebUI.setText(findTestObject('1/Page_ng nhp/input_Password'), '123456')

WebUI.sendKeys(findTestObject('1/Page_ng nhp/input_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('1/Page_Qun tr vin/div_Kho hc'))

WebUI.setText(findTestObject('1/Page_Qun l kha hc/input_txtSearchBox'), 'auto')

WebUI.click(findTestObject('1/Page_Qun l kha hc/span_fa fa-file-text-o'))

WebUI.click(findTestObject('1/Page_Qun l ni dung/span_fa fa-caret-down'))

WebUI.click(findTestObject('1/Page_Qun l ni dung/a_Scorm'))

WebUI.setText(findTestObject('1/Page_Thm ni dung/input_NameContent'), 'a')

WebUI.click(findTestObject('1/Page_Thm ni dung/a_Ti ln file bi ging Scorm'))

WebUI.click(findTestObject('1/Page_Thm ni dung/button_Lu'))

WebUI.closeBrowser()

