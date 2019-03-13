package day4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Zuoye5 {
	public WebDriver driver;
	String nal="http://localhost:8080/Exam_ssh/";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal);
	}
	@Test
	public void kaoshi() throws InterruptedException {
		driver.findElement(By.linkText("开始在线考试")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("stuNumber")).sendKeys("20171231115");
		driver.findElement(By.name("stuName")).sendKeys("杨哲");
		driver.findElement(By.name("B1")).click();
		Thread.sleep(2000);
		
		/*WebElement s1=driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]/form/div/select"));//定位分数下拉框
		Select s=new Select(s1);
		s.selectByIndex(4);//选择下拉框第1个
*/		driver.findElement(By.xpath("//*[@id=\"start_b\"]")).click();
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input")).click();
	}
	@After
	public void guanbi() {
		driver.quit();
	}
}
