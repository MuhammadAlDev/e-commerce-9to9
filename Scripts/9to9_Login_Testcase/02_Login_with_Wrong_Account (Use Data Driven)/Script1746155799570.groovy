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
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger


WebUI.openBrowser('')

WebUI.navigateToUrl('https://9to9.co.id/')

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_9to9 Indonesia Toko Fashion Wanita dan_367fc8/a_HI, GUEST'))

WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Beranda Pelanggan/span_Masuk'))


for(def rowNum = 1; rowNum <= findTestData('user_account_wrong_data').getRowNumbers(); rowNum++){
	
	username = findTestData('user_account_wrong_data').getValue(1, rowNum)
	
	WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Email_username'), findTestData('user_account_wrong_data').getValue(1, rowNum))
	
	WebUI.setText(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Password_password'), findTestData('user_account_wrong_data').getValue(2, rowNum))
	
	WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Masuk/span_Masuk'))
	

	if((findTestData('user_account_wrong_data').getValue(1, rowNum) != 'muhammadaldev@gmail.com') && (findTestData('user_account_wrong_data').getValue(
        2, rowNum) != 'Superman!23')) {
		
	//WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Masuk/div_Invalid login or password'))
	
	KeywordLogger log = new KeywordLogger()
	log.logInfo('user '+username+ ' failed to login')
	println('user ' +username+ ' failed to login')

	// ---- use this to clear inputfield -------
	WebUI.sendKeys(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Password_password'), Keys.chord(Keys.CONTROL,
			'a'))

	WebUI.sendKeys(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Password_password'), Keys.chord(Keys.BACK_SPACE))

	WebUI.sendKeys(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Email_username'), Keys.chord(Keys.CONTROL,
			'a'))

	WebUI.sendKeys(findTestObject('Object Repository/9to9_OR/Page_Masuk/input_Email_username'), Keys.chord(Keys.BACK_SPACE))

	
	}else {
		
		//WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Beranda Pelanggan/a_HI, Muhammad'))
		
		//	WebUI.click(findTestObject('Object Repository/9to9_OR/Page_Beranda Pelanggan/a_keluar'))
			
			KeywordLogger log = new KeywordLogger()
			log.logInfo('user '+username+ ' successfully login')
			println('user ' +username+ ' successfully login')
			
	}
	
	
	Thread.sleep(1000)
	WebUI.refresh()

	}

	WebUI.closeBrowser()




