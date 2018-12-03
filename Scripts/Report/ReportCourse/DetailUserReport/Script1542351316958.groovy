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

WebUI.callTestCase(findTestCase('Authentication/Login1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Report/Course/link_report_course'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/input_search_course'), 'Khóa tự động do thân tạo')

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/icon_detail_course'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/tab_learner'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_user_content'), 'Admin2')

Thread.sleep(2000)

WebUI.verifyTextPresent('admin2', false)

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_detail'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/button_export_content'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/tab_content'))

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/button_export_content_1'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'Bài khảo sát')

Thread.sleep(2000)

WebUI.verifyTextPresent('Bài khảo sát', false)

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_detail_content'))
Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_close_popup'))
Thread.sleep(2000)

if()

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'Bài kiểm tra')

Thread.sleep(2000)

WebUI.verifyTextPresent('Bài kiểm tra', false)

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_detail_content'))
Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_close_popup'))
Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'document question')

Thread.sleep(2000)

WebUI.verifyTextPresent('document question', false)

Thread.sleep(2000)
WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_detail_content'))
Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_close_popup'))
Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'document with time')

Thread.sleep(2000)

WebUI.verifyTextPresent('document with time', false)

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'Flash')

Thread.sleep(2000)

WebUI.verifyTextPresent('Flash', false)

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'flash question')

Thread.sleep(2000)

WebUI.verifyTextPresent('flash question', false)

Thread.sleep(2000)
WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_detail_content'))
Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_close_popup'))
Thread.sleep(2000)
WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'flash with time')

Thread.sleep(2000)

WebUI.verifyTextPresent('flash with time', false)

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'scorm 1')

Thread.sleep(2000)

WebUI.verifyTextPresent('scorm 1', false)

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'scorm with question')

Thread.sleep(2000)

WebUI.verifyTextPresent('scorm with question', false)

Thread.sleep(2000)
WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_detail_content'))
Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/icon_close_popup'))
Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'scorm with time')

Thread.sleep(2000)

WebUI.verifyTextPresent('scorm with time', false)

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), 'Tài liệu 1')

Thread.sleep(2000)

WebUI.verifyTextPresent('Tài liệu 1', false)

Thread.sleep(2000)

WebUI.setText(findTestObject('Report/Course/DetailCourse/TabLearner/input_search_content'), '')

Thread.sleep(2000)

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/select_content'))

WebUI.click(findTestObject('Report/Course/DetailCourse/TabLearner/content_content'))

