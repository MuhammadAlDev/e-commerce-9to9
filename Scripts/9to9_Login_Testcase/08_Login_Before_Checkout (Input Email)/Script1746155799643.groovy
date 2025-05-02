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

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_9to9 Indonesia Toko Fashion Wanita dan_367fc8/img_IDR 139,000_jsx-2611454927 img jss95 loaded'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Velove In Lime/div_38'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Velove In Lime/span_Tambah ke keranjang'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Velove In Lime/span_1'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Keranjang belanja/input_Keranjang belanja_checkAll'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Keranjang belanja/span_Checkout'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Alamat Email_email'), 'muhammadaldev@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Alamat Email_email'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Transfer bank_radio'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/span_Tambah Alamat'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Nama Depan_firstname'), 'test')

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Nama Belakang_lastname'), 'coba')

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Nomor Telepon_telephone'), '081317260545')

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Negara_country'), 'Indonesia')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Negara_country'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/li_Indonesia'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Bagian  Provinsi_state_1744429005202'), 'jawa timur')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/li_Jawa Timur'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/form_Nama DepanNama BelakangNomor TeleponNe_c7f182'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Kota_city_1744429012596'), 'malang')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/li_Malang'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Kecamatan_district_1744429016791'), 'dampit')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/li_Dampit'))

WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Detail Alamat_addressDetail'), 'jalan test no 55')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Detail Alamat_addressDetail'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/div_Alamat baruNama DepanNama BelakangNomor_1a9051'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Report a map error_newsletter'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/span_Simpan'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/svg_Anteraja_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Anteraja_mui-83250'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/input_Transfer bank_radio'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/span_Buat pesanan'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/button_Check status'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/button_Check status'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Checkout/svg'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Sukses/span_Lanjutkan Belanja'))

