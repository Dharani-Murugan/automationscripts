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

WebUI.navigateToUrl('https://maltapark.com/')

WebUI.click(findTestObject('Object Repository/Page_Home  Maltapark/i_All Classifieds_dropdown icon'))

WebUI.click(findTestObject('Object Repository/Page_Home  Maltapark/div_Books'))

WebUI.setText(findTestObject('Object Repository/Page_Home  Maltapark/input_Search By Username_search'), 'computer')

WebUI.click(findTestObject('Object Repository/Page_Home  Maltapark/i_title only_large search icon'))

WebUI.click(findTestObject('Object Repository/Page_Search Results  Maltapark/img'))

Price = WebUI.getText(findTestObject('Object Repository/Page_Classic Aircraft of WW2  Maltapark/h1_10.00'))
System.out.println("Price"+Price)

Description = WebUI.getText(findTestObject('Object Repository/Page_Classic Aircraft of WW2  Maltapark/div_Large HB book in excellent condition. L_b69f5c'))
System.out.println("Description"+Description)
WebUI.closeBrowser()

