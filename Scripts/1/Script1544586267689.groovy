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

WebUI.click(findTestObject('1/Page_Qun tr vin/div_K thi'))

WebUI.click(findTestObject('1/Page_Danh sch k thi/span_fa fa-cog'))

WebUI.click(findTestObject('1/Page_Danh sch ch  thi/i_fa fa-cog'))

WebUI.click(findTestObject('1/Page_Thit lp chi tit ch  thi/span_fa fa-pencil'))

WebUI.click(findTestObject('1/Page_Chnh sa  thi/button_Ly cu hi t ngn hng'))

WebUI.click(findTestObject('1/Page_Chnh sa  thi/a_Loi cu hi'))

WebUI.selectOptionByValue(findTestObject('1/Page_Chnh sa  thi/select_AnyNoneCu hi t lunCu hi'), 'essay', true)

WebUI.click(findTestObject('1/Page_Chnh sa  thi/button_p dng'))

WebUI.click(findTestObject('1/Page_Chnh sa  thi/input_general-checkbox checkbo'))

WebUI.click(findTestObject('1/Page_Chnh sa  thi/button_Thm vo'))

WebUI.click(findTestObject('1/Page_Chnh sa  thi/button_ng'))

WebUI.closeBrowser()

