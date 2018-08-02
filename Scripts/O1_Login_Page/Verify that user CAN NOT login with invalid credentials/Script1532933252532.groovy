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

WebUI.openBrowser('https://yoyaku.sod.bla-one.net/login')

WebUI.comment('email empty')

WebUI.click(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'))

WebUI.click(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Label'))

WebUI.verifyTextPresent('メールアドレスを入力してください\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.comment('email is space only')

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), '    ')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.comment('email is wrong')

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 'abcd')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 'AAA@BBB@CCC.DDD')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), ' taistore001@mailinator.com')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 'taistore001@mailinator.com ')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 'taistore001 @mailinator.com')

WebUI.verifyTextPresent('メールアドレスのフォーマットが正しくありません\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.comment('password is empty')

WebUI.click(findTestObject('O1_Login_Page/Password/O1_Login_PW_Input'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('O1_Login_Page/O1_Login_Logo'))

WebUI.verifyTextPresent('パスワードを入力してください\n', false)

WebUI.verifyElementNotClickable(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.comment('login with right email wrong pw')

WebUI.setText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 'taistore001@mailinator.com')

WebUI.setText(findTestObject('O1_Login_Page/Password/O1_Login_PW_Input'), 'aaaaaaaaaaaaa')

WebUI.click(findTestObject('O1_Login_Page/O1_Login_btn_Signin'))

WebUI.waitForElementVisible(findTestObject('O1_Login_Page/O1_Toast_Error'), 0)

WebUI.verifyTextPresent('メールアドレスまたはパスワードが正しくありません', false)

