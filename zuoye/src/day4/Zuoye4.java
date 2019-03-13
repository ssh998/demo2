package day4;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Zuoye4 {
	public WebDriver driver;
	String nal="http://localhost:8080/Exam_ssh/adminLogin.do";
	@Before
	public void openfirefox() {
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.get(nal);
	}
	@Test
	public void houtai() throws InterruptedException {
		
		driver.findElement(By.id("name")).sendKeys("admin");//�������Ա�˺�admin
		driver.findElement(By.id("pass")).sendKeys("admin");//�������룺admin
		driver.findElement(By.name("B1")).click();//�����¼
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("��ӿ�������")).click();//�����ӿ�������
		driver.findElement(By.name("testName")).sendKeys("���Ի���");//����Ծ���Ի���
		driver.findElement(By.id("testTime")).sendKeys("120����");//��ӿ���ʱ��120����
		driver.findElement(By.name("submit")).click();//����ύ��ť
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("�������")).click();//����������
		driver.findElement(By.name("title")).sendKeys("���ܲ��Եĸ���");//�����Ŀ
		WebElement s1=driver.findElement(By.id("score"));//��λ����������
		Select s=new Select(s1);
		s.selectByIndex(3);//ѡ����������ĸ�
		WebElement a=driver.findElement(By.id("level"));//��λ�Ѷ�������
		Select s11=new Select(a);
		s11.selectByVisibleText("�е�");//ѡ���е��Ѷ�
		driver.findElement(By.name("choices")).sendKeys("ѡ��1:ѡ��2:ѡ��3");
		driver.findElement(By.id("standardAnswer")).sendKeys("1:2:2:3");
		driver.findElement(By.name("submit")).click();//���ȷ��
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("���ȫ������")).click();//������ȫ������
		WebElement a1=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]"));
		System.out.println(a1.getText());//��ӡȫ������
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("��ӿ�������")).click();//�����ӿ�������
		driver.findElement(By.id("id")).sendKeys("3623301561591994");
		driver.findElement(By.name("realname")).sendKeys("����");
		driver.findElement(By.name("stuNumber")).sendKeys("20171231115");
		driver.findElement(By.name("className")).sendKeys("170305");
		driver.findElement(By.name("address")).sendKeys("�����ȷ�");
		driver.findElement(By.name("phone")).sendKeys("15070337408");
		driver.findElement(By.name("email")).sendKeys("1538758215@qq.com");
		driver.findElement(By.name("humanId")).sendKeys("362330199812092015");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("���ȫ������")).click();
		WebElement a2=driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td[2]"));
		System.out.println(a2.getText());//��ӡȫ������
		Thread.sleep(2000);
		
		
		
		
	}
}
