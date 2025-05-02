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

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_9to9 Indonesia Toko Fashion Wanita dan_367fc8/img_IDR 959,200_jsx-2611454927 img jss95 loaded'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lavvie Double Strap 2 In Tan/span_44'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lavvie Double Strap 2 In Tan/span_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lavvie Double Strap 2 In Tan/div_1HI, GUEST'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Lavvie Double Strap 2 In Tan/svg'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Keranjang belanja/input_Keranjang belanja_checkAll'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Keranjang belanja/span_Checkout'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/span_Anda sudah memiliki akun silahkan masu_f606e4'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Email_username'), 'muhammadaldev@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Password_password'), 'WUHEd1iJI5wfIkso1NjskA==')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Masuk/span_Masuk'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Keranjang belanja/input_Subtotal_check348761'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Keranjang belanja/span_Checkout_1'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/svg_Anteraja_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Anteraja_mui-96843'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Transfer bank_radio'))

