package zuoye01;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zuoye04 {
	public WebDriver driver;
	String nal1="file:///D:/qqÎÄ¼þ/1538758215/FileRecv/Ò³Ãæ/frame.html";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal1);
	}
	@Test
	public void login() throws InterruptedException{
		driver.switchTo().frame(0);
		driver.findElement(By.id("input1")).sendKeys("À¬»øÑîÕÜ");
		Thread.sleep(2000);
	}
	@After
	public void lost() {
		driver.close();
	}
}
