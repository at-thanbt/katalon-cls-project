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

WebUI.callTestCase(findTestCase('Course/GoToContent'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(4000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/button_show_as_learner'))

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/button_see_as_learner'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

String title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'Tài liệu 1', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title1 = WebUI.getWindowTitle()

WebUI.verifyMatch(title1, 'document question', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title2 = WebUI.getWindowTitle()

WebUI.verifyMatch(title2, 'document with time', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title3 = WebUI.getWindowTitle()

WebUI.verifyMatch(title3, 'Flash', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title4 = WebUI.getWindowTitle()

WebUI.verifyMatch(title4, 'flash question', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title5 = WebUI.getWindowTitle()

WebUI.verifyMatch(title5, 'flash with time', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title6 = WebUI.getWindowTitle()

WebUI.verifyMatch(title6, 'scorm 1', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title7 = WebUI.getWindowTitle()

WebUI.verifyMatch(title7, 'scorm with question', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title8 = WebUI.getWindowTitle()

WebUI.verifyMatch(title8, 'scorm with time', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title9 = WebUI.getWindowTitle()

WebUI.verifyMatch(title9, 'Bài khảo sát', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_next_content'))

Thread.sleep(2000)

String title10 = WebUI.getWindowTitle()

WebUI.verifyMatch(title10, 'Bài kiểm tra', true)

Thread.sleep(2000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/icon_return_back'))

Thread.sleep(5000)

WebUI.click(findTestObject('Course/ManageContent/ShowAsLearner/link_backto_course'))

