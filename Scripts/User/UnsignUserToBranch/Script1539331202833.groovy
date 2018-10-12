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

WebUI.callTestCase(findTestCase('Authentication/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToBranch/Page_Qun tr vin/div_Ngi dng'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToBranch/Page_Qun l ngi dng/input_txtUserSearchBox'), 'admin1')

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToBranch/Page_Qun l ngi dng/span_fa fa-pencil'))

WebUI.click(findTestObject('User/UnsignUserToBranch/Page_- admin1/span_Chi nhnh'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToBranch/Page_- admin1/input_txtUserBranchSearchBox'), 'Cà Mau')

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToBranch/Page_- admin1/input_ipt-action'))

WebUI.click(findTestObject('User/UnsignUserToBranch/Page_- admin1/button_Lu'))

Thread.sleep(5000)

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://camau-ntmtien.cls.vn/account/login')

WebUI.setText(findTestObject('User/UnsignUserToBranch/Page_ng nhp (1)/input_UserName'), 'admin1')

WebUI.setText(findTestObject('User/UnsignUserToBranch/Page_ng nhp (1)/input_Password'), '123456')

WebUI.click(findTestObject('User/UnsignUserToBranch/Page_ng nhp (1)/button_NG NHP'))
Thread.sleep(2000)

WebUI.verifyTextPresent('Tên đăng nhập hoặc mật khẩu không đúng', false)



