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

WebUI.click(findTestObject('Forgot password/Page_ng nhp/a_Qun mt khu'))

Thread.sleep(5000)

WebUI.switchToWindowIndex(0)

String title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Quên mật khẩu', true)

WebUI.setText(findTestObject('Forgot password/Page_Qun mt khu/input_Email'), 'buithithan.cntt@gmail.com')

WebUI.click(findTestObject('Forgot password/Page_Qun mt khu/button_GI'))
Thread.sleep(5000)

WebUI.verifyTextPresent('Chúng tôi đã gửi một email tới hòm thư của bạn, vui lòng kiểm tra và làm theo hướng dẫn để thiết lập lại tài khoản của bạn', 
    false)

WebUI.closeBrowser()

