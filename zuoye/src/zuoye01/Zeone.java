package zuoye01;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Zeone {
	public WebDriver driver;
	String nal="http://192.168.135.128:8080/mobile_mysql/index.jsp";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
	}
	@Test
	public void zhuce() throws InterruptedException{
		driver.get(nal);
		driver.findElement(By.linkText("ע��")).click();
		driver.findElement(By.name("name")).sendKeys("����");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("passwordOne")).sendKeys("123456");
		driver.findElement(By.name("reallyName")).sendKeys("����");
		driver.findElement(By.name("age")).sendKeys("20");
		driver.findElement(By.name("profession")).sendKeys("ѧ��");
		driver.findElement(By.name("email")).sendKeys("1538758215@qq.com");
		driver.findElement(By.name("question")).sendKeys("����˭");
		driver.findElement(By.name("result")).sendKeys("ʢ�ƻ�");
		driver.findElement(By.className("input1")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("name")).sendKeys("����");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.className("input1")).click();
	}
	@After
	public void login()  {
		
}

}