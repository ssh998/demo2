package zuoye01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Zuoye02 {
	public WebDriver driver;
	String nal="file:///D:/qqÎÄ¼þ/1538758215/FileRecv/Ò³Ãæ/autotest.html";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal);
	}
	@Test
	public void login() throws InterruptedException{
	driver.findElement(By.id("accountID")).sendKeys("admin");
	driver.findElement(By.id("passwordID")).sendKeys("123456");
	Select s=new Select(driver.findElement(By.className("u17")));
	s.selectByIndex(2);
	WebElement r1=driver.findElement(By.id("sexID1"));
	r1.click();
	System.out.println(r1.isSelected());
	driver.findElement(By.id("sexID2")).click();
	driver.findElement(By.id("u1")).click();
	driver.findElement(By.id("u2")).click();
	driver.findElement(By.id("u3")).click();
	WebElement sub=driver.findElement(By.name("file"));
	sub.sendKeys("C:\\Users\\Administrator\\Desktop\\test.txt");
	Thread.sleep(2000);
	driver.findElement(By.id("buttonID")).click();
	Alert aa= driver.switchTo().alert();
	aa.accept();

	}
	@After
	public void lost() {
		driver.close();
	}
}
