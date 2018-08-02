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

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_Logo'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_btn_Signin'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Input'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Label'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_btn_ForgetPw'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Password/O1_Login_PW_Input'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/Password/O1_Login_PW_Label'), 0)

WebUI.verifyElementPresent(findTestObject('O1_Login_Page/O1_Login_Description'), 0)

WebUI.comment('Verify element texts')

WebUI.verifyElementText(findTestObject('O1_Login_Page/O1_Login_Description'), 'ご登録のメールアドレスとパスワードでログインが可能です')

WebUI.verifyElementText(findTestObject('O1_Login_Page/Email Address/O1_Login_Email_Label'), 'メールアドレス')

WebUI.verifyElementText(findTestObject('O1_Login_Page/Password/O1_Login_PW_Label'), 'パスワード')

WebUI.verifyElementText(findTestObject('O1_Login_Page/O1_Login_btn_Signin'), 'サインイン')

WebUI.verifyElementText(findTestObject('O1_Login_Page/O1_Login_btn_ForgetPw'), 'パスワードを忘れた方')

