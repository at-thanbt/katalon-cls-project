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

//Thread.sleep(30000)
WebUI.callTestCase(findTestCase('DeleteUser'), [:], FailureHandling.STOP_ON_FAILURE)
Thread.sleep(3000)

WebUI.click(findTestObject('AddUser/Page_Qun l ngi dng/span_THM NGI DNG'))

Thread.sleep(5000)

WebUI.setText(findTestObject('AddUser/Page_Qun l ngi dng/input_NewUserName'), 'usertest')

WebUI.setText(findTestObject('AddUser/Page_Qun l ngi dng/input_NewPassword'), '123456')

WebUI.setText(findTestObject('AddUser/Page_Qun l ngi dng/input_NewEmail'), 'usertest@gmail.com')

WebUI.click(findTestObject('AddUser/Page_Qun l ngi dng/button_Lu'))

Thread.sleep(10000)

WebUI.verifyTextPresent('usertest', false)

