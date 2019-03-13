package day2;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Zuoye {
	public WebDriver driver;
	String nal="file:///D:/qqÎÄ¼þ/1538758215/filerecv/draganddrop%20(1).html";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal);
	}
	@Test
	public void login() throws InterruptedException, IOException{
		Actions a=new Actions(driver);
		WebElement move= driver.findElement(By.id("drag"));
		a.dragAndDropBy(move, -99, -66).perform();
	}
}
