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

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_Qun tr vin/div_Ngi dng'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToCourse/Page_Qun l ngi dng/input_txtUserSearchBox'), 'admin1')

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_Qun l ngi dng/span_fa fa-pencil'))

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_- admin1/span_Nhm ngi dng'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToCourse/Page_- admin1/input_txtUserGroupSearchBox'), 'Nhóm quản lý')

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_- admin1/input_ipt-action'))

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_- admin1/button_Lu'))

Thread.sleep(3000)

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_- admin1/span_Kho hc'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToCourse/Page_- admin1/input_txtUserCourseSearchBox'), 'Vận hành CLS trong doanh nghiệp')

Thread.sleep(2000)

WebUI.verifyElementNotChecked(findTestObject('User/UnsignUserToCourse/Page_- admin1/input_ipt-action'), 1)

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_- admin1/span_Qun tr vin'))

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_Qun tr vin/div_Nhm ngi dng'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToCourse/Page_Qun l nhm ngi dng/input_txtGroupSearchBox'), 'Nhóm quản lý')

Thread.sleep(2000)

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_Qun l nhm ngi dng/span_fa fa-pencil'))

WebUI.click(findTestObject('User/UnsignUserToCourse/Page_Nhm qun l/span_Ngi dng'))

Thread.sleep(2000)

WebUI.setText(findTestObject('User/UnsignUserToCourse/Page_Nhm qun l/input_txtGroupUserSearchBox'), 'Admin1')

Thread.sleep(2000)

WebUI.verifyElementNotChecked(findTestObject('User/UnsignUserToCourse/Page_Nhm qun l/input_ipt-action'), 1)
Thread.sleep(5000)

WebUI.mouseOver(findTestObject('User/AddUserToCourse/Page_Qun tr vin/span_fa fa-caret-down'))

Thread.sleep(3000)

WebUI.click(findTestObject('User/AddUserToCourse/Page_Qun tr vin/a_Ngi hc'))

WebUI.setText(findTestObject('User/AddUserToCourse/Page_Ngi hc/input_txtCourseSearchBox'), 'Vận hành CLS trong Doanh Nghiệp')

WebUI.verifyTextNotPresent('Vận hành CLS trong Doanh Nghiệp', false)

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Authentication/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

