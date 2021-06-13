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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

WebUI.setText(findTestObject('Object Repository/input_Find locations_q'), 'Apply for a number plate')

WebUI.click(findTestObject('Object Repository/li_apply for a number plate'))

WebUI.click(findTestObject('Object Repository/a_Apply to exchange existing number plates _3f868e'))

WebUI.click(findTestObject('Object Repository/a_Apply to collect number plates from anoth_d5291d'))

WebUI.click(findTestObject('Object Repository/a_Cancel a number plate order'))

WebUI.click(findTestObject('Object Repository/div_Renew the storagehold period of number _70cc66'))

WebUI.click(findTestObject('Object Repository/a_Renew the storagehold period of number plates'))

WebUI.click(findTestObject('Object Repository/a_Place your number plates on holdin storage'))

WebUI.click(findTestObject('Object Repository/a_Find a service centre'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney 2000')

WebUI.click(findTestObject('Object Repository/li_Sydney 2000'))

WebUI.click(findTestObject('Object Repository/p_Marrickville Metro Shopping CentreShop 92_cd35c6'))

WebUI.click(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'))

WebUI.click(findTestObject('Object Repository/p_Marrickville Metro Shopping CentreShop 92_cd35c6'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Shop 9')

WebUI.sendKeys(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'sydney')

WebUI.sendKeys(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney')

WebUI.click(findTestObject('Object Repository/button_The University Of Sydney 2006_button_35dd0e'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney Domestic Airport 2020')

WebUI.click(findTestObject('Object Repository/li_Sydney Domestic Airport 2020'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney')

WebUI.click(findTestObject('Object Repository/li_Sydney South 2000'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney Sout')

WebUI.click(findTestObject('Object Repository/li_Sydney University 2006'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney ')

WebUI.click(findTestObject('Object Repository/li_Sydney Olympic Park 2127'))

WebUI.click(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'))

WebUI.click(findTestObject('Object Repository/li_Sydney Domestic Airport 2020'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney ')

WebUI.click(findTestObject('Object Repository/li_Sydney International Airport 2020'))

WebUI.click(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'))

WebUI.click(findTestObject('Object Repository/li_Unsw Sydney 2052'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydne')

WebUI.click(findTestObject('Object Repository/li_Unsw Sydney 2052'))

WebUI.click(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'))

WebUI.click(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney ')

WebUI.click(findTestObject('Object Repository/li_North Sydney 2060'))

WebUI.setText(findTestObject('Object Repository/input_Search by suburb postcode or current _25e956'), 'Sydney')

WebUI.click(findTestObject('Object Repository/li_The University Of Sydney 2006'))

WebUI.closeBrowser()

