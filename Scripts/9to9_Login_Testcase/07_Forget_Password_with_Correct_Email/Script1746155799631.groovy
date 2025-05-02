import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://9to9.co.id/')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_9to9 Indonesia Toko Fashion Wanita dan_367fc8/a_HI, GUEST'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Beranda Pelanggan/span_Masuk'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Masuk/span_Lupa password'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Lupa password/input_Email_email'), 'muhammadaldev@gmail.com')


//--------------- use chaptcha -------------
//WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lupa password/div_reCAPTCHA_recaptcha-checkbox-border'))


//WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lupa password/button_Verify'))
//------------------------------------------------------------

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lupa password/span_kirim'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lupa password/div_Reset Password link has been sent to email'))

