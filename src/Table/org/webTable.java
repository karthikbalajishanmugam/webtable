package Table.org;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balas\\eclipse-workspace\\SampleTable\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']"));
		
			List<WebElement> trow = table.findElements(By.tagName("tr"));
			for (int i=1 ; i<trow.size(); i++) {
				WebElement row = trow.get(i);
				
			List<WebElement> Tdata = row.findElements(By.tagName("td"));
			for (int j=1 ; j<Tdata.size(); j++) {
				WebElement data = Tdata.get(j);
				 System.out.println(data.getText());
				
				 }
				
			}
			
			
		}
		
		
		
		
	}
		



