import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class GmailLogin{
   public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeDriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.manage().window().maximize();
      driver.get("https://mail.google.com/");
      //identify email
      WebElement l = driver
      .findElement(By.name("identifier"));
      l.sendKeys("82automationtesting2021@gmail.com");
      WebElement b = driver
      .findElement(By.className("VfPpkd-LgbsSe"));
      b.click();
      //identify password
      WebElement p = driver
      .findElement(By.name("password"));
      p.sendKeys("Test@123");
      //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
      driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
      driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
      //Enter the sender mail id
     		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("82automationtesting2021@gmail.com");
      //Enter subject to the mail
     		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Incubyte");
     		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation QA Test for Incubyte");
     		driver.findElement(By.xpath("//div[text()='Send']")).click();
     		
     		//close browser
      //driver.close();
   }
}