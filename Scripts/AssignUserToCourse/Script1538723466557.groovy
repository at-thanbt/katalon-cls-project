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

Thread.sleep(30000)

WebUI.callTestCase(findTestCase('OpenUserModun'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('AddUserToCourse/Page_Qun l ngi dng/input_txtUserSearchBox'), 'admin1')

Thread.sleep(3000)

WebUI.click(findTestObject('AddUserToCourse/Page_Qun l ngi dng/span_fa fa-pencil'))

Thread.sleep(3000)

WebUI.click(findTestObject('AddUserToCourse/Page_- admin1/span_Kho hc'))

WebUI.setText(findTestObject('AddUserToCourse/Page_- admin1/input_txtUserCourseSearchBox'), 'Vận hành CLS trong Doanh Nghiệp')

Thread.sleep(3000)

WebUI.click(findTestObject('AddUserToCourse/Page_- admin1/input_ipt-action'))

WebUI.click(findTestObject('AddUserToCourse/Page_- admin1/button_Lu'))

Thread.sleep(5000)

WebUI.mouseOver(findTestObject('AddUserToCourse/Page_Qun tr vin/span_fa fa-caret-down'))

Thread.sleep(5000)

//WebUI.click(findTestObject('AddUserToCourse/Page_Qun tr vin/span_fa fa-caret-down'))
//Thread.sleep(3000)
WebUI.click(findTestObject('AddUserToCourse/Page_Qun tr vin/a_Ngi hc'))

WebUI.setText(findTestObject('AddUserToCourse/Page_Ngi hc/input_txtCourseSearchBox'), 'Vận hành CLS trong Doanh Nghiệp')

WebUI.verifyTextPresent('Vận hành CLS trong Doanh Nghiệp', false)

Thread.sleep(3000)

WebUI.click(findTestObject('AddUserToCourse/Page_Ngi hc/a_Vn hnh CLS trong Doanh Nghip'))

WebUI.callTestCase(findTestCase('UnssignUserToCours'), [:], FailureHandling.STOP_ON_FAILURE)

