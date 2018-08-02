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

WebUI.openBrowser('https://yoyaku.sod.bla-one.net/password/forgot')

WebUI.comment('email is wrong')

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 'abcd')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません', false)

WebUI.verifyElementNotClickable(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 'AAA@BBB@CCC.DDD')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), ' taistore001@mailinator.com')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 'taistore001@mailinator.com ')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 'taistore001 @mailinator.com')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.comment('reset with email not registered')

WebUI.setText(findTestObject('O20_ForgetPw_page/O20_ForgetPw_Email_Input'), 'notavailableaccount@test001.com')

WebUI.click(findTestObject('O20_ForgetPw_page/O20_ForgetPw_btn_Send_Reset_Pw'))

WebUI.waitForElementVisible(findTestObject('O20_ForgetPw_page/O20_Toast_Message'), 0)

WebUI.verifyElementText(findTestObject('O20_ForgetPw_page/O20_Toast_Message'), '予期しないエラー')

