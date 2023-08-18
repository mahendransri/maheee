package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert alert;
	public static JavascriptExecutor js;
	public static Select s;
	public static List<WebElement> findElements;

	public static void openchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void openfirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static  void Implicity() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void openEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void closecurrentTab() {
		driver.close();
	}

	public static void maxwindow() {
		driver.manage().window().maximize();
	}

	public static void minwindow() {
		driver.manage().window().minimize();
	}

	public static void fetchTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void fetchUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void hold(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void fillTextbox(WebElement element, String input) {
		element.sendKeys(input);

	}

	public static void toclick(WebElement element) {
		element.click();
	}

	public static void mouseHovering(WebElement targetelement) {
		a = new Actions(driver);
		a.moveToElement(targetelement).perform();
	}

	public static void clickdouble(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	public static void dragAndDrop(WebElement element, WebElement target) {
		a = new Actions(driver);
		a.dragAndDrop(element, target).perform();

	}

	public static void Rightclick(WebElement element) {
		a = new Actions(driver);
		a.contextClick(element).perform();

	}

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void Enter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static void keyDown() throws AWTException {
		r = new Robot();
		for (int i = 0; i<4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);	
		}

	}

	public static void Accept() {
		alert = driver.switchTo().alert();
		alert.accept();

	}

	public static void dismiss() {
		alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static String getAttribute(WebElement element) {
		String att = element.getAttribute("value");
		return att;
	}

	public static void takesnap(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\ADMIN\\eclipse-workspace\\BDDcucumberframework\\screenshot\\" + imgName + ".png");
		FileUtils.copyFile(source, target);
	}

	public static void scrolldown(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}

	public void scrollup(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void JSEclick(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", element);

	}

	public static void JSEsendkeys(WebElement element, String input) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + input + "')", element);

	}

	public static void JSEgetAttribute(WebElement element) {
		js = (JavascriptExecutor) driver;
		Object O = js.executeScript("return arguments[0].getAttribute('value')", element);
		String object = O.toString();
		System.out.println(object);

	}

	public static void findframe1(String id) {
		driver.switchTo().frame("id");

	}

	public static void findframe2(WebElement name) {
		driver.switchTo().frame(name);

	}

	public static void findFrame3(int number) {
		driver.switchTo().frame(number);

	}
	public static void windowHandling() {
		String parentid = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String each : allwindow) {
			if (!parentid.equals(each)) {
				driver.switchTo().window(each);
				
			}
			
		}

	}
	public static void selectbyindex(WebElement target, int index) {
		s = new Select(target);
		s.selectByIndex(index);

	}
	public static void selectbyvalue(WebElement element,String name) {
		s = new Select(element);
		s.selectByValue(name);

	}
	public static void selectbyvisibletext(WebElement ele , String value) {
		s = new Select(ele);
		s.selectByVisibleText(value);

	}
	public static void getoption(WebElement alloption) {
		List<WebElement> all = s.getOptions();
		for (WebElement aa : all) {
			String text = aa.getText();
			System.out.println(text);
			
		}		
	}
	public static void getfirstselectedoption(WebElement element,int integer,String name,String text) {
		s = new Select(element);
		s.selectByIndex(integer);
		s.selectByValue(name);
		s.selectByVisibleText(text);
		WebElement firstselected = s.getFirstSelectedOption();
		String text2 = firstselected.getText();
		System.out.println(text2);

	}
	public static void getallselectedoption(WebElement ele,int integer,String name,String text) {
		s = new Select(ele);
		s.selectByIndex(integer);
		s.selectByValue(name);
		s.selectByVisibleText(text);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("Get All Selected Option");
		for (WebElement web : allSelectedOptions) {
			String text3 = web.getText();
			System.out.println(text3);
			
		}
	}
	public static void TableData(WebElement elem) {
		String alldata = elem.getText();
		System.out.println(alldata);
	}
	public static void firstrowdata(WebElement table) {
		 List<WebElement> row = table.findElements(By.tagName("tr"));
		 WebElement firstrow = row.get(0);
		 String data = firstrow.getText();
		 System.out.println(data);	
	}
	public static void iterateallrowalldata(WebElement table) {
		 List<WebElement> allrows = table.findElements(By.tagName("tr"));
		 for (int i = 0; i < allrows.size(); i++) {
			 WebElement data = allrows.get(i);
			 List<WebElement> alldata = data.findElements(By.tagName("td"));
			 for (int j = 0; j < alldata.size(); j++) {
				 WebElement eachdata = alldata.get(j);
				 String  textdata = eachdata.getText();
				 System.out.println(textdata);	
			}
			
		}
		 
		 
	}
	public static void beforedate() {
		Date d = new Date();
		System.out.println(d);

	}
	public static  void afterdate() {
		Date d = new Date();
		System.out.println(d);

	}

	}

	


