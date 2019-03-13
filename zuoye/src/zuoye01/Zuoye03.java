package zuoye01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Zuoye03 {
	public WebDriver driver;
	String uall="file:///D:/qq%E6%96%87%E4%BB%B6/1538758215/FileRecv/%E9%A1%B5%E9%9D%A2/dialogs.html";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(uall);
	}
	@Test
	public void login() throws InterruptedException{
		WebElement x=driver.findElement(By.id("alert"));
		x.click();
		Thread.sleep(2000);
		Alert c=driver.switchTo().alert();
		c.accept();
		WebElement x1=driver.findElement(By.id("confirm"));
		x1.click();
		Thread.sleep(2000);
		Alert c1=driver.switchTo().alert();
		c1.dismiss();
		Thread.sleep(2000);
		WebElement x2=driver.findElement(By.id("prompt"));
		x2.click();
		Thread.sleep(2000);
		Alert c3=driver.switchTo().alert();
		c3.sendKeys("—Ó’‹’Ê¿¨ª¯");
		System.out.println();
		c3.accept();
	}
	@After
	public void lost() {
		driver.close();
	}
}
